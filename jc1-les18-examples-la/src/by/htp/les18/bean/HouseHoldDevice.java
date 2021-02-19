package by.htp.les18.bean;

import java.io.Serializable;

public class HouseHoldDevice extends Appliance  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int powerConcumption;
	
	
	
	public HouseHoldDevice() {
		super();
		
	}
	public HouseHoldDevice(int powerConcumption) {
		super();
		this.powerConcumption = powerConcumption;
	}
	public int getPowerConcumption() {
		return powerConcumption;
	}
	public void setPowerConcumption(int powerConcumption) {
		this.powerConcumption = powerConcumption;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + powerConcumption;
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
		HouseHoldDevice other = (HouseHoldDevice) obj;
		if (powerConcumption != other.powerConcumption)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "HouseHoldDevice [powerConcumption=" + powerConcumption + "]";
	}
	
	
	
}
