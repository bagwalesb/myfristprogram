package Demo;

class person {
	  
	private static final person P = null;
	private static person Person;
	int age=21;
	int weight=56;
	String color="light";
	
	void eat()
	{
		System.out.print("i am Eating");
	}
	
	void sleep()
	{
	System.out.print("i am sleeping");
	
	}
  public static void main(String[] args) {
	 Person=new person();
	 System.out.print("P.age");
	 System.out.print("P.weaight");
	 System.out.print("P.color");
	
	 
	 
	  

	}

}
