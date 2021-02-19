package by.htp.les18.bean;

import java.io.Serializable;

public class VacuumCleaner  extends HouseHoldDevice  implements Serializable{

	
	private static final long serialVersionUID = 1L;

	
	private String filterType;
	private String bagType;
	private String wandType;
	private int motorSpeedRegulation;
	private int cleaningWidth;
	
	
	
	public VacuumCleaner() {
		
		super();

	}
	
	
	public VacuumCleaner(int powerConcumption) {
		
		super(powerConcumption);
		
	}
	
	
	public VacuumCleaner(String filterType, String bagType, String wandType, int motorSpeedRegulation,
			int cleaningWidth) {
	
		super();
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeedRegulation = motorSpeedRegulation;
		this.cleaningWidth = cleaningWidth;
	
	}
	
	
	public VacuumCleaner(int powerConcumption, String filterType, String bagType, String wandType, int motorSpeedRegulation,
			int cleaningWidth) {
		
		super(powerConcumption);
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeedRegulation = motorSpeedRegulation;
		this.cleaningWidth = cleaningWidth;
	
	}
	
	
	public String getFilterType() {
		return filterType;
	}
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}
	
	
	public String getWandType() {
		return wandType;
	}
	public void setWandType(String wandType) {
		this.wandType = wandType;
	}
	
	
	public int getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}
	public void setMotorSpeedRegulation(int motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}
	
	
	public String getBagType() {
		return bagType;
	}
	public void setBagType(String bagType) {
		this.bagType = bagType;
	}
	
	
	public int getCleaningWidth() {
		return cleaningWidth;
	}
	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		result = prime * result + cleaningWidth;
		result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
		result = prime * result + motorSpeedRegulation;
		result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
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
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bagType == null) {
			if (other.bagType != null)
				return false;
		} else if (!bagType.equals(other.bagType))
			return false;
		if (cleaningWidth != other.cleaningWidth)
			return false;
		if (filterType == null) {
			if (other.filterType != null)
				return false;
		} else if (!filterType.equals(other.filterType))
			return false;
		if (motorSpeedRegulation != other.motorSpeedRegulation)
			return false;
		if (wandType == null) {
			if (other.wandType != null)
				return false;
		} else if (!wandType.equals(other.wandType))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "VacuumCleaner [filterType=" + filterType + ", bagType=" + bagType + ", wandType=" + wandType
				+ ", motorSpeedRegulation=" + motorSpeedRegulation + ", cleaningWidth=" + cleaningWidth + "]";
	}
	
	
}
