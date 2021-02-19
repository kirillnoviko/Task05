package by.htp.les18.bean;

import java.io.Serializable;
import java.util.Arrays;

public class AudioDevice extends Appliance  implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	private int powerConsumption;

	private int numberOfSpeakers;
	
	private double[] frequencyRange;

	
	public AudioDevice(int powerConsumption, int numberOfSpeakers, double[] frequencyRange) {
		super();
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
	}

	public AudioDevice() {
		super();
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public double[] getFrequencyRange() {
		return frequencyRange;
	}

	public void setFrequencyRange(double[] frequencyRange) {
		this.frequencyRange = frequencyRange;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(frequencyRange);
		result = prime * result + numberOfSpeakers;
		result = prime * result + powerConsumption;
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
		AudioDevice other = (AudioDevice) obj;
		if (!Arrays.equals(frequencyRange, other.frequencyRange))
			return false;
		if (numberOfSpeakers != other.numberOfSpeakers)
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AudioDevice [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + Arrays.toString(frequencyRange) + "]";
	}
	
	

}
