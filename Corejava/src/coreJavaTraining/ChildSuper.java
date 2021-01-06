package coreJavaTraining;

public class ChildSuper extends ParentSuper {
	String name="Lavish";
	public  ChildSuper() {
		super();//this should be always be at first line in child constructor
		System.out.println("Child class constructor");
	}
	
	
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	public void getData() {
		super.getData();
	System.out.println("I am a child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildSuper c=new ChildSuper();
		c.getStringdata();
		c.getData();

	}

}
