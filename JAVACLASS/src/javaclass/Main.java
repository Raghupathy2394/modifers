package javaclass;

public class Main {
/*{
int x =4 ;
	public static void main(String[] args) {
		Main myObj1= new Main();
		Main myObj2=new Main();
		System.out.println(myObj1.x);
System.out.println(myObj2.x);
	}}    
/// multible attributes//
String fname="raj";
String lname="anand";
	int age=25 ;
	public static void main(String[] args) {
		Main obj=new Main();
		System.out.println("Name:"+ obj.fname + " " + obj.lname);
	System.out.println("Age:"+obj.age); 
	} } 
	static void mymethod() 
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		mymethod();  mymethod();
	}} */
	
/*	//static vs public
	 static void mystaticmethod() {
		System.out.println("hello");
	}
	public void mypublicmethod() {
		System.out.println("world");
	}
	public static void main(String[] args) {
		mystaticmethod();
		Main myObj=new Main();
		myObj.mypublicmethod();
	}
	}*/

/*
	  public void fullThrottle() {
	    System.out.println("The car is going as fast as it can!");
	  }

	  public void speed(int maxSpeed) {
	    System.out.println("Max speed is: " + maxSpeed);
	  }
	
	public static void main(String[] args) {
	Main myCar=new Main();
	myCar.fullThrottle();
	myCar.speed(200);
	} }  
	
String name;
int rank;
void display()
{ 
	System.out.println("name="+name);
	System.out.println("rank="+rank);
}
public void setvalues(String vj, int num) {
	name = vj;
	rank = 5;
}

 
 public static void main(String[] args) {
 Main card=new Main();
 card.setvalues("vj",5);

 card.display();
 }}    */ 
///Constructors//// parameterized
	/*
 int num1;
 int num2;
 int result;
 Main(int a , int b)
 { 
	 num1=a;
	 num2=b;

 }
 void display()
 {
	 result=num1+num2;
	 System.out.println("result = "+ result);
 }
 public static void main(String[] args) {
 Main obj=new Main(10,30);
 obj.display();
 }
}   */
	///constuctor overlooading ///
	
	int num1;
	int num2;
	int result;
	Main(int a, int b)
	{ 
		num1=a;
		num2=b;
	}
	Main(){
		System.out.println("hello");
	}
	void display() {
		result = num1 + num2;
		System.out.println("result = " + result);
		}
	 public static void main(String[] args) {
		 Main obj1=new Main(10,20);
		 obj1.display();
		 Main obj=new Main();
		
	 }
 
		 
		 
		 
		 
		 
	 }
	
 
 
 

 





