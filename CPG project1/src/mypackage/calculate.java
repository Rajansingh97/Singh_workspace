package mypackage;

public class calculate {
	static double Area(){
		double radius=2.14;
	    double area=(3.14)*radius*radius;
	    return area;
	   
	}static int Salary(){
		  int net_salary;
	      int basic_slary=33000;
	      int DA=3000;
	      int HRA=1000;
	      int pf=2000;
	      net_salary=(basic_slary+DA+HRA)-pf;
	      return net_salary;
		
	}
		
	

	public static void main(String[] args) {
		System.out.println(Area());
		System.out.println(Salary());
		
		
	    
//****************************************************
	  
 
  //***************************************************
  int amount=50000;
  int discount=amount-(amount*5/100);
  System.out.println(discount);

	}

}
