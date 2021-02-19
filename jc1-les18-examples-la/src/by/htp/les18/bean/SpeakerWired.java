package by.htp.les18.bean;

import java.io.Serializable;

public class SpeakerWired extends AudioDevice implements Serializable{

	private static final long serialVersionUID = 1L;
	private int cordLenght;
	
	public SpeakerWired() {
		super();
	
	}
	
	
	public SpeakerWired(int powerConsumption, int numberOfSpeakers, double[] frequencyRange) {
		super(powerConsumption, numberOfSpeakers, frequencyRange);
		
	}
	
	
	public SpeakerWired(int powerConsumption, int numberOfSpeakers, double[] frequencyRange, int cordLenght) {
		super(powerConsumption, numberOfSpeakers, frequencyRange);
		this.cordLenght = cordLenght;
	}
	
	
	
	public int getCordLenght() {
		return cordLenght;
	}
	public void setCordLenght(int cordLenght) {
		this.cordLenght = cordLenght;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + cordLenght;
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
		SpeakerWired other = (SpeakerWired) obj;
		if (cordLenght != other.cordLenght)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "SpeakerWired [cordLenght=" + cordLenght + "]";
	}
	
	
	
}
