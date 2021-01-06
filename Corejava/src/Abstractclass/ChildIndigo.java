package Abstractclass;

public class ChildIndigo extends ParentAircaraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildIndigo c=new ChildIndigo();
		c.engine();	
		c.safteyGuidelines();
		c.bodyColor();

	}
	@Override
	public void bodyColor() {
		System.out.println("Body color");
	}

}
