package SS;

public class Constuctor extends ConsPa {

	public Constuctor() {
		super(500);
		System.out.println("0 argument const");
	}
	
	
	
	String abc="Hello World";
	public Constuctor(String a) {
		this();
		System.out.println(super.abc);
		System.out.println(this.abc);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Constuctor c=new Constuctor("yes");
		
	
	}

}
