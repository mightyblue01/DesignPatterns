package builder;

public class ComputerBuilderClass {

	private String mouse;
	private String keyboard;
	
	
	public static class Builder {
	
	private String mouse;
	private String keyboard;	
		
	public Builder setMouseType(String mouseType){
		
		this.mouse = mouseType;
		return this;
	}
	
	public Builder setKeyboardType(String keyboardType){
		this.keyboard = keyboardType;
		return this;	
	}
	
	public ComputerBuilderClass build(){
		
			return new ComputerBuilderClass(this);
		
		}
	}
	
	private ComputerBuilderClass(Builder bb){
		this.mouse = bb.mouse;
		this.keyboard = bb.keyboard;
		
	}
	
	public void print(){
		System.out.println(this.mouse);
		System.out.println(this.keyboard);
	}
	
	
	
	
	public static void main(String[] args) {
		ComputerBuilderClass cbl = new ComputerBuilderClass.Builder().
									setKeyboardType("kb3").
									setMouseType("logitech").build();
		
		cbl.print();

	}

}
