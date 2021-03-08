package by.htp.les18.bean;

import java.io.Serializable;

public class Refrigerator extends HouseHoldDevice  implements Serializable {

	private static final long serialVersionUID = 1L;
	private int weight;
	private int frezerCapacity;
	private double overallCapacity;
	private int height;
	private int width;
	
	
	
	
	public Refrigerator() {
		super();
	
	}
	
	public Refrigerator(int powerConcumption, String name,int price) {
		super(powerConcumption,name,price);
		
	}
	
	public Refrigerator(int weight, int frezerCapacity, double overallCapacity, int height, int width) {
		super();
		this.weight = weight;
		this.frezerCapacity = frezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
	}
	
	public Refrigerator(String name,int price,int powerConcumption, int weight, int frezerCapacity, double overallCapacity, int height, int width) {
		super(powerConcumption,name,price);
		this.weight = weight;
		this.frezerCapacity = frezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
	}
	
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	public int getFrezerCapacity() {
		return frezerCapacity;
	}
	public void setFrezerCapacity(int frezerCapacity) {
		this.frezerCapacity = frezerCapacity;
	}
	
	
	public double getOverallCapacity() {
		return overallCapacity;
	}
	public void setOverallCapacity(double overallCapacity) {
		this.overallCapacity = overallCapacity;
	}
	
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + frezerCapacity;
		result = prime * result + height;
		long temp;
		temp = Double.doubleToLongBits(overallCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + weight;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refrigerator other = (Refrigerator) obj;
		if (frezerCapacity != other.frezerCapacity)
			return false;
		if (height != other.height)
			return false;
		if (Double.doubleToLongBits(overallCapacity) != Double.doubleToLongBits(other.overallCapacity))
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Refrigerator [weight=" + weight + ", frezerCapacity=" + frezerCapacity + ", overallCapacity="
				+ overallCapacity + ", height=" + height + ", width=" + width + "]";
	}
	
	
}
