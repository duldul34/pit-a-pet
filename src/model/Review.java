package model;

public class Review {
	private String id;
	private String writeDate;
	private String content;
	private String rate;
	private Care care;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public Care getCare() {
		return care;
	}
	public void setCare(Care care) {
		this.care = care;
	}
}
