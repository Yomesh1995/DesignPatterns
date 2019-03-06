package com.designpatterns.builderpattern.example1;

public class PersonalDetail {
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String phoneNumber;
	private String idType;
	private String idNumber;
	
	private PersonalDetail(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.mobileNumber = builder.mobileNumber;
		this.phoneNumber = builder.phoneNumber;
		this.idType = builder.idType;
		this.idNumber = builder.idNumber;
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

	static class Builder {
		private String firstName;
		private String lastName;
		private String mobileNumber;
		private String phoneNumber;
		private String idType;
		private String idNumber;
		
		public Builder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public Builder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public Builder setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
			return this;
		}
		public Builder setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		public Builder setIdType(String idType) {
			this.idType = idType;
			return this;
		}
		public Builder setIdNumber(String idNumber) {
			this.idNumber = idNumber;
			return this;
		}
		public PersonalDetail build() {
			return new PersonalDetail(this);
		}
		
	}

	@Override
	public String toString() {
		return "PersonalDetail [firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
				+ ", phoneNumber=" + phoneNumber + ", idType=" + idType + ", idNumber=" + idNumber + "]";
	}
	
}