package com.ustglobal.sms.dto;

import java.util.List;

public class ProductResponse {

	private int StatusCode;
	private String StatusMessage;
	private String statusDescription;
	private List<Products> productBean;
	public List<Products> getProductBean() {
		return productBean;
	}
	public void setProductBean(List<Products> productBean) {
		this.productBean = productBean;
	}
	public int getStatusCode() {
		return StatusCode;
	}
	public void setStatusCode(int statusCode) {
		StatusCode = statusCode;
	}
	public String getStatusMessage() {
		return StatusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		StatusMessage = statusMessage;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

}
