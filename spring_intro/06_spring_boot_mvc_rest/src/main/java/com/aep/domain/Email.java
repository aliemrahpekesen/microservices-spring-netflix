package com.aep.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Email {

	private String Id;
	private String address;
	private boolean isValid;

	public Email() {
		super();
	}

	public Email(String id, String address, boolean isValid) {
		this();
		Id = id;
		this.address = address;
		this.isValid = isValid;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
}
