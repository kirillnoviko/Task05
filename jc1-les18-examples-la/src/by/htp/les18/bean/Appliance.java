package by.htp.les18.bean;

import java.io.Serializable;

public class Appliance  implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private int price;
	
	
	
	public Appliance() {

	}


	public Appliance(String name, int price) {
	
		this.name = name;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliance other = (Appliance) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Appliance [name=" + name + ", price=" + price + "]";
	}
	
	
}
