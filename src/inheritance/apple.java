package inheritance;

public class apple extends tree {
private String color;

void setColor(String color) {
	this.color=color;
}

	public String WhatIsaColor() {
		return (this.color + "GrowthRate is: " );
	}

}
