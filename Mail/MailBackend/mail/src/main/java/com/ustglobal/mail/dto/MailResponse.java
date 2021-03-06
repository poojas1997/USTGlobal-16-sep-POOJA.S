package com.ustglobal.mail.dto;

import java.util.List;

public class MailResponse {
	private int statuscode;
	private String message;
	private String description;
	private List<Mail> mail;

	public List<Mail> getMail() {
		return mail;
	}
	public void setMail(List<Mail> mail) {
		this.mail = mail;
	}
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
