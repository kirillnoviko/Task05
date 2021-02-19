package by.htp.les18.bean;

import java.io.Serializable;

public class Oven  extends HouseHoldDevice  implements Serializable {

	private static final long serialVersionUID = 1L;

	private int weight;
	private int capacity;
	private int depth;
	private double height;
	private double width;
	
	
	public Oven() {
		super();
		
	}
	public Oven(int powerConcumption) {
		super(powerConcumption);
	
	}
	public Oven(int weight, int capacity, int depth, double height, double width) {
		super();
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
		this.height = height;
		this.width = width;
	}
	
	public Oven(int powerConcumption, int weight, int capacity, int depth, double height, double width) {
		super(powerConcumption);
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
		this.height = height;
		this.width = width;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + capacity;
		result = prime * result + depth;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + weight;
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Oven other = (Oven) obj;
		if (capacity != other.capacity)
			return false;
		if (depth != other.depth)
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (weight != other.weight)
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Oven [weight=" + weight + ", capacity=" + capacity + ", depth=" + depth + ", height=" + height
				+ ", width=" + width + "]";
	}
	
	
}
