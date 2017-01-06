/*-	<<Singleton Pattern>>
 * Explanation :: 
 * Steps - 
 * (1) Using dual lock mechanism. First lock(first null check) to make sure that only 
 * one thread can go ahead and following threads can skip the synchronization part
 * (since synchronization is costly operation). Second null check is to avoid this 
 * situation – one thread is already executing the synchronized section while second 
 * thread finds first null check (and it’s still null since first thread is not done 
 * creating instance yet !!). Hence second thread goes past the first null check and 
 * waits for first thread to complete the sync section. Once first thread finishes 
 * the sync section and releases the lock, second thread acquires the lock and now 
 * if the second null check is not there, duplicate instance will be created. 

	(2) Using volatile – the Java memory model was broken in version1.4 (out of order writes) 
	and earlier because of which the instance value was although changed to non null, the 
	instance creation was still taking place. Other thread by looking at non null value 
	may try to use this instance but this results into inconsistent behavior because of 
	partially constructed instance. Volatile places a barrier in memory and makes sure 
	that the write happens only after full object creation.
 * 
 * 
 * 
 */



package singleton;

public class SingletonClass {

	private static volatile SingletonClass instance;
	
	private SingletonClass(){
		System.out.println("Constructing singleton !!");
	}
	
	public SingletonClass getInstance(){
	
		if(instance!=null){
			
			synchronized (this){
				if(instance != null)
					instance = new SingletonClass();
			}
		}
		return instance;
	}
	
	
	public static void main(String[] args) {
		SingletonClass ss = new SingletonClass();
		ss.getInstance();

	}

}
