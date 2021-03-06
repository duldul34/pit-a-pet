package model;

import java.util.List;

public class Care {
	private String id;
	private String startDate;
	private String endDate;
	private int totalPrice;
	private String notes;
	private int status;
	private List<CareDetails> careList;
	private Member companion;
	private PetSitter sitter;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public List<CareDetails> getCareList() {
		return careList;
	}
	public void setCareList(List<CareDetails> careList) {
		this.careList = careList;
	}
	public Member getCompanion() {
		return companion;
	}
	public void setCompanion(Member companion) {
		this.companion = companion;
	}
	public PetSitter getSitter() {
		return sitter;
	}
	public void setSitter(PetSitter sitter) {
		this.sitter = sitter;
	}
}
