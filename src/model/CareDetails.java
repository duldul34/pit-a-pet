package model;

public class CareDetails {
	private String id;
	private Pet carePet;
	private Service service;
	private int check;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Pet getCarePet() {
		return carePet;
	}
	public void setCarePet(Pet carePet) {
		this.carePet = carePet;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public int getCheck() {
		return check;
	}
	public void setCheck(int check) {
		this.check = check;
	}
}
