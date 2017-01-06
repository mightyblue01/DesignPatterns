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
