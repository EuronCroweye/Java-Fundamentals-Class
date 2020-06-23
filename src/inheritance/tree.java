package inheritance;

public class tree {
private int height;
private int growRate;

public void set_Values(int height, int growRate) {
	this.height=height;
	this.setGrowRate(growRate);
	
	
}

public int getGrowRate() {
	return growRate;
}

public void setGrowRate(int growRate) {
	this.growRate = growRate;
}
}
