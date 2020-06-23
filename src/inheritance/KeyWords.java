package inheritance;

public class KeyWords {

	public String GetInfo() {
		return ("The class has to have a Key Word ..extends XXX at the end of a class name");
	}
	
	public static void main(String [] args) {
		apple green = new apple();
		green.set_Values(5,1);
		green.setColor("green");
		System.out.println(green.WhatIsaColor());
		System.out.println(green.getGrowRate());
		
	}
}
