package model;

import java.util.List;

public class CareRecord {
	private String id;
	private List<CareDetails> checkList;
	private String writeDate;
	private String title;
	private String content;
	private Care care;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<CareDetails> getCheckList() {
		return checkList;
	}
	public void setCheckList(List<CareDetails> checkList) {
		this.checkList = checkList;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Care getCare() {
		return care;
	}
	public void setCare(Care care) {
		this.care = care;
	}
}
