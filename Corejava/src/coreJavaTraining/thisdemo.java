package coreJavaTraining;

public class thisdemo {

	int a=20;
	public void getData()
	{
		int a=10;
		int b= a+this.a;
		System.out.println(a);
		System.out.println(this.a);//this keyword is used to access global variable
		System.out.println(b);

		
		//this refers to the current object -object scope lies in class level

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisdemo c=new thisdemo();
		c.getData();
		
	}

}
