package coreJavaTraining;

public class String1 {

	public static void main(String[] args) {

		//String:it is one of the prebuilt class in java
		//1.String literal
		//2.by creating a object of string
		String a="  LavishJain";
		
	System.out.println(a.charAt(2));
	System.out.println(a.indexOf("v"));
	System.out.println(a.substring(1,5));
	System.out.println(a.substring(0));
	System.out.println(a.concat("Kushal Jain"));
	System.out.println(a.length());
	//to remove whitepsace in a string at beiginning 
	System.out.println(a.trim());
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	//we can split the string based on our delimeter
	//it will split into 2 string
	// Thats the reason ,we store it into an array
	//return type of that array would be String only
	String arr[]=a.split("s");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(a.replace("n", "o"));
		
	}

}
