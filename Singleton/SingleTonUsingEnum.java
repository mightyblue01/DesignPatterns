/*
 * <<Singleton>>
 * This is the latest and preferred method for singleton design pattern.
 */

package singleton;

public class SingleTonUsingEnum {

	public enum Singleton{
		INSTANCE;
		
		public void doSomething(){
			
			System.out.println("Doing something !!");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		Singleton.INSTANCE.doSomething();

	}

}
