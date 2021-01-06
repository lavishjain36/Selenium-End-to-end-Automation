package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d=new Date();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("M/dd/yyyy");
		SimpleDateFormat dateFormat1=new SimpleDateFormat("M/dd/yyyy hh::mm:ss");

		System.out.println(dateFormat.format(d));
		
		System.out.println(dateFormat1.format(d));

		
		System.out.println(d.toString());
		
		//to print the data in our format
	//	mm//dd//yyyy HH:MM:SS
		

	}

}
