package Demointerface;

public class Indiantraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTraffic a = new Indiantraffic();
		a.redsignal();
		a.greensignal();
		a.yellowsignal();

		Indiantraffic at = new Indiantraffic();
		at.Walking();

		ContinentalTraffic c = new Indiantraffic();
		c.Trainsymbol();

	}

	@Override
	public void greensignal() {
		// TODO Auto-generated method stub
		System.out.println("Green Signal Implementation");

	}

	@Override
	public void redsignal() {
		// TODO Auto-generated method stub
		System.out.println("Red Signal Implementation");

	}

	@Override
	public void yellowsignal() {
		// TODO Auto-generated method stub
		System.out.println("Yellow Signal Implementation");

	}
	public void Walking() {
		// TODO Auto-generated method stub
		
		System.out.println("Walking  Implementation");

		
	}

	public void Trainsymbol() {
		System.out.println("Train  symbol");
	}

}
