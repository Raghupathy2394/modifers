package Methods;

public class Main2 {
/*{
static void myMethods(String fname) {
	System.out.println(fname + " student");
}
	public static void main(String[] args) {
     myMethods("raj");	
     myMethods("ravi");
     myMethods("rahul");
	}

} */

///multiple parameters//
	/*
static void myMethods(String fname,int age)

{
	System.out.println(fname +" is age " + age);
	}
public static void main(String[] args) {
    myMethods("raj",30);	
    myMethods("ravi",31);
    myMethods("rahul",32);
	}
}       */
	// return values//
	/*static int mymethods(int a) {
		return 4 + a;
	}
	public static void main(String[] args) {
	System.out.println(mymethods(3));
	}
	}  */
// if  else//
/*	static void checkAge(int age) {
	if(age < 18)
	{ System.out.println("not eligible to vote");
	}
	else{
       System.out.println("eligible to vote");		
	}
	}
	public static void main(String[] args) {
	checkAge(10);
	}
	
} 
 //recursion method//
static int rr(int n){
	if(n==1) 
	
		return 1;
		return n*rr(n-1);
}


	public static void main(String[] args) {
int n=4;
System.out.println(rr(n));  
	
	public static void main(String[] args) {
		int result=sum(10);
		System.out.println(result);
	}
	static int sum(int k) {
		if(k>0)
			{
			return k + sum(k-1);
			} else {
				return 0;
			}   */
	
	public static void main(String[] args) {
		int result=sum(5,6);
		System.out.println(result);
	}
	static int sum(int x,int y) {
		if(y>x)
		{  return y +sum(x,y-1);
		}  else
			return y;
	}}
	
	
	