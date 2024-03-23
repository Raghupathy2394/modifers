package modifie;

public class Demo1
{
private int slry=1000;
private String work="electric";
public int getSlry() {
	return slry;
}
public void setSlry(int slry) {
	this.slry = slry;
}
public String getWork() {
	return work;
}
public void setWork(String work) {
	this.work = work;
}

public static void main(String[] args)	{
	Demo1 obj=new Demo1();
	System.out.println(obj.getSlry());
	System.out.println(obj.getWork());
}
} 
	 
	 

