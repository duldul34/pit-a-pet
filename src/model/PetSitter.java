package model;

import java.util.List;

public class PetSitter {
	private String id;
	private String applyDate;
	private String career;
	private String certification;
	private String introduction;
	private int approvalStatus;
	private List<PetKind> kinds;
	private List<Service> services;
	private int publicStatus;
	private List<Integer> availableDate;
	private int calculatedPrice;
	private List<String> tag;
	private String notes;
	private float avgRate;
	private int like;
	private int view;
	private Member applicant;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public int getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(int approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public List<PetKind> getKinds() {
		return kinds;
	}
	public void setKinds(List<PetKind> kinds) {
		this.kinds = kinds;
	}
	public List<Service> getServices() {
		return services;
	}
	public void setServices(List<Service> services) {
		this.services = services;
	}
	public int getPublicStatus() {
		return publicStatus;
	}
	public void setPublicStatus(int publicStatus) {
		this.publicStatus = publicStatus;
	}
	public List<Integer> getAvailableDate() {
		return availableDate;
	}
	public void setAvailableDate(List<Integer> availableDate) {
		this.availableDate = availableDate;
	}
	public int getCalculatedPrice() {
		return calculatedPrice;
	}
	public void setCalculatedPrice(int calculatedPrice) {
		this.calculatedPrice = calculatedPrice;
	}
	public List<String> getTag() {
		return tag;
	}
	public void setTag(List<String> tag) {
		this.tag = tag;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public float getAvgRate() {
		return avgRate;
	}
	public void setAvgRate(float avgRate) {
		this.avgRate = avgRate;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public Member getApplicant() {
		return applicant;
	}
	public void setApplicant(Member applicant) {
		this.applicant = applicant;
	}
}
