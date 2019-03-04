package com.designpatterns.builderpattern;

public class Form {
	
	private String organizationName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String pitNumber;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String phoneNumber;
	private String idType;
	private String idNumber;
	private String securityQuestion;
	private String securityAnswer;
	
	static class FormBuilder {
		
		private String organizationName;
		private String address1;
		private String address2;
		private String city;
		private String state;
		private String pitNumber;
		private String firstName;
		private String lastName;
		private String mobileNumber;
		private String phoneNumber;
		private String idType;
		private String idNumber;
		private String securityQuestion;
		private String securityAnswer;
		
		public FormBuilder(String organizationName, String address1, String city, String state, String pitNumber,
				String firstName, String lastName, String idType, String idNumber, String securityQuestion,
				String securityAnswer) {
			this.organizationName=organizationName;
			this.address1=address1;
			this.city=city;
			this.state=state;
			this.pitNumber=pitNumber;
			this.firstName=firstName;
			this.lastName=lastName;
			this.idType=idType;
			this.idNumber=idNumber;
			this.securityQuestion=securityQuestion;
			this.securityAnswer=securityAnswer;
		}
		
		public FormBuilder setAddress2(String address2) {
			this.address2=address2;
			return this;
		}
		
		public FormBuilder setMobileNumber(String mobileNumber) {
			this.mobileNumber=mobileNumber;
			return this;
		}
		
		public FormBuilder setPhoneNumber(String phoneNumber) {
			this.phoneNumber=phoneNumber;
			return this;
		}
		
		public Form build() {
			return new Form(this);
		}
	}
	
	private Form (FormBuilder builder) {
		this.organizationName=builder.organizationName;
		this.address1=builder.address1;
		this.address2=builder.address2;
		this.city=builder.city;
		this.state=builder.state;
		this.pitNumber=builder.pitNumber;
		this.firstName=builder.firstName;
		this.lastName=builder.lastName;
		this.mobileNumber=builder.mobileNumber;
		this.phoneNumber=builder.phoneNumber;
		this.idType=builder.idType;
		this.idNumber=builder.idNumber;
		this.securityQuestion=builder.securityQuestion;
		this.securityAnswer=builder.securityAnswer;
	}
	
	public String getOrganizationName() {
		return organizationName;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getPitNumber() {
		return pitNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getIdType() {
		return idType;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	@Override
	public String toString() {
		return "Form [organizationName=" + organizationName + ", address1=" + address1 + ", address2=" + address2
				+ ", city=" + city + ", state=" + state + ", pitNumber=" + pitNumber + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + ", phoneNumber=" + phoneNumber
				+ ", idType=" + idType + ", idNumber=" + idNumber + ", securityQuestion=" + securityQuestion
				+ ", securityAnswer=" + securityAnswer + "]";
	}
	
}
