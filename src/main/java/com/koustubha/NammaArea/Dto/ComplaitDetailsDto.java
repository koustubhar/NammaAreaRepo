package com.koustubha.NammaArea.Dto;

/**
 * @author koustubha
 */

import java.util.Date;

public class ComplaitDetailsDto {

	private int complaintId;

	private String name;

	private int wardNumber;

	private String address;

	private String complaintDescription;

	private byte[] complaintImage;

	private Date createdDate;

	private Date updatedDate;

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWardNumber() {
		return wardNumber;
	}

	public void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getComplaintDescription() {
		return complaintDescription;
	}

	public void setComplaintDescription(String complaintDescription) {
		this.complaintDescription = complaintDescription;
	}

	public byte[] getComplaintImage() {
		return complaintImage;
	}

	public void setComplaintImage(byte[] complaintImage) {
		this.complaintImage = complaintImage;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
