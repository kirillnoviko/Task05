package by.htp.les18.bean;

import java.io.Serializable;

public class TablePC extends ComputerDevice  implements Serializable{

	private static final long serialVersionUID = 1L;

	private int flashmemoryCapacity;
	private String color;
	
	
	
	public TablePC() {
		super();
		
	}
	
	
	public TablePC(int batteryCapacity, int memoryROM, int displayInches) {
		super(batteryCapacity, memoryROM, displayInches);
		
	}
	
	
	public TablePC(int flashmemoryCapacity, String color) {
		super();
		this.flashmemoryCapacity = flashmemoryCapacity;
		this.color = color;
	}
	
	public TablePC(int batteryCapacity, int memoryROM, int displayInches, int flashmemoryCapacity, String color) {
		super(batteryCapacity, memoryROM, displayInches);
		this.flashmemoryCapacity = flashmemoryCapacity;
		this.color = color;
	}
	
	public int getFlashmemoryCapacity() {
		return flashmemoryCapacity;
	}
	public void setFlashmemoryCapacity(int flashmemoryCapacity) {
		this.flashmemoryCapacity = flashmemoryCapacity;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + flashmemoryCapacity;
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
		TablePC other = (TablePC) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (flashmemoryCapacity != other.flashmemoryCapacity)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "TablePC [flashmemoryCapacity=" + flashmemoryCapacity + ", color=" + color + "]";
	}
	
	
}
