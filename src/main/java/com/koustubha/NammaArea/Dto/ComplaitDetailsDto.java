package com.koustubha.NammaArea.Dto;

public class ComplaitDetailsDto {

	private int complaintId;

	private String name;

	private int wardNumber;

	private String address;

	private String complaintDescription;

	private byte[] complaintImage;

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

}
