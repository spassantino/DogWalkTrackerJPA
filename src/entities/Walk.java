package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Walk {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String dogName;
	private double walkDistance;
	private double lengthTime;
	private String location;

	public Walk(String dogName, double walkDistance, double lengthTime, String location) {
		this.dogName = dogName;
		this.walkDistance = walkDistance;
		this.lengthTime = lengthTime;
		this.location = location;
	}

	public Walk() {
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public double getWalkDistance() {
		return walkDistance;
	}

	public void setWalkDistance(double walkDistance) {
		this.walkDistance = walkDistance;
	}

	public double getLengthTime() {
		return lengthTime;
	}

	public void setLengthTime(double lengthTime) {
		this.lengthTime = lengthTime;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Walk [id=" + id + ", dogName=" + dogName + ", walkDistance=" + walkDistance + ", lengthTime="
				+ lengthTime + ", location=" + location + "]";
	}
}
