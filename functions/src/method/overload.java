package method;

public class overload extends functions {
	public void intrest(float principal,float total_intrest)
	{
		System.out.println("this is overriden");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functions var=new overload();
		var.intrest(78830, 893939);
		
		

	}

}
