package by.htp.les18.bean;

import java.io.Serializable;

public class Laptop extends ComputerDevice  implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private String operatingSystem;
	private int systemMemory;
	private double cPU;
	
	

	public Laptop() {
		super();
		
	}


	public Laptop(int batteryCapacity, int memoryROM, int displayInches) {
		super(batteryCapacity, memoryROM, displayInches);
	
	}


	public Laptop(String operatingSystem, int systemMemory, double cPU) {
		super();
		this.operatingSystem = operatingSystem;
		this.systemMemory = systemMemory;
		this.cPU = cPU;
	}
	
	public Laptop(int batteryCapacity, int memoryROM, int displayInches, String operatingSystem, int systemMemory, double cPU) {
		super(batteryCapacity, memoryROM, displayInches);
		this.operatingSystem = operatingSystem;
		this.systemMemory = systemMemory;
		this.cPU = cPU;
	}
	
	
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	
	public int getSystemMemory() {
		return systemMemory;
	}
	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}
	
	
	public double getcPU() {
		return cPU;
	}
	public void setcPU(double cPU) {
		this.cPU = cPU;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(cPU);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
		result = prime * result + systemMemory;
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
		Laptop other = (Laptop) obj;
		if (Double.doubleToLongBits(cPU) != Double.doubleToLongBits(other.cPU))
			return false;
		if (operatingSystem == null) {
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		if (systemMemory != other.systemMemory)
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		return "Laptop [operatingSystem=" + operatingSystem + ", systemMemory=" + systemMemory + ", cPU=" + cPU + "]";
	}
	
	
}
