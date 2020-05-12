package com.koustubha.NammaArea.Entity;

/**
 * @author koustubha
 */

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

@Entity
public class ComplaintDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int complaintId;

	@Column(name="NAME")
	@NotNull
	private String name;

	@Column(name="WARD_NUMBER")
	@NotNull
	private int wardNumber;

	@Column(name="ADDRESS")
	@NotNull
	private String address;

	@Column(name="COMPLAINT_DESCRIPTION")
	@NotNull
	private String complaintDescription;

	@Lob
	@Column(name="COMPLAINT_IMAGE")
	private byte[] complaintImage;

	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="UPATED_DATE")
	private Date updatedDate;

	public ComplaintDetails() {

	}

	public ComplaintDetails(int complaintId, String name, int wardNumber, String address, String complaintDescription,
			byte[] complaintImage, Date createdDate, Date updatedDate) {
		super();
		this.complaintId = complaintId;
		this.name = name;
		this.wardNumber = wardNumber;
		this.address = address;
		this.complaintDescription = complaintDescription;
		this.complaintImage = complaintImage;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

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
