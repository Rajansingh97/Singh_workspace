package mypackage;


public class candidate {
	public void checkMarks(int marks) throws Exception{
	
	if(marks<30)
	{
		throw new Exception("marks invalid");
	}
	else
	{
		System.out.println("valid marks");
		
	}
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		candidate c=new candidate();
		try
		{
			
			c.checkMarks(25);

	}
		catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}}
