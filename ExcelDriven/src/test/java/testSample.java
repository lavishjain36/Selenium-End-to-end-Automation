import java.io.IOException;
import java.util.ArrayList;

public class testSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Datadriven d=new Datadriven();
		ArrayList data=d.getData("Add profile");
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		
		ArrayList data1=d.getData("Login");
		System.out.println(data1.get(0));
		System.out.println(data1.get(1));
		System.out.println(data1.get(2));
		System.out.println(data1.get(3));



	}

}
