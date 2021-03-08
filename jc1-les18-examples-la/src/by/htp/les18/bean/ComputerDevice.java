package by.htp.les18.bean;

import java.io.Serializable;

public class ComputerDevice extends Appliance  implements Serializable  {

	private static final long serialVersionUID = 1L;

	private int batteryCapacity;
	private int memoryROM;
	private int displayInches;
	
	
	
	public ComputerDevice() {
		super();
		
	}
	public ComputerDevice(String name,int price,int batteryCapacity, int memoryROM, int displayInches) {
		super(name,price);
		this.batteryCapacity = batteryCapacity;
		this.memoryROM = memoryROM;
		this.displayInches = displayInches;
	}
	
	
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	
	public int getMemoryROM() {
		return memoryROM;
	}
	public void setMemoryROM(int memoryROM) {
		this.memoryROM = memoryROM;
	}
	
	
	public int getDisplayInches() {
		return displayInches;
	}
	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + batteryCapacity;
		result = prime * result + displayInches;
		result = prime * result + memoryROM;
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
		ComputerDevice other = (ComputerDevice) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (displayInches != other.displayInches)
			return false;
		if (memoryROM != other.memoryROM)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ComputerDevice [batteryCapacity=" + batteryCapacity + ", memoryROM=" + memoryROM + ", displayInches="
				+ displayInches + "]";
	}
	
	
}
