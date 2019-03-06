package com.designpatterns.builderpattern.example1;

public class OrganizationDetail {
	private String organizationName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String panNumber;

	private OrganizationDetail(Builder builder) {
		this.organizationName = builder.organizationName;
		this.address1 = builder.address1;
		this.address2 = builder.address2;
		this.city = builder.city;
		this.state = builder.state;
		this.panNumber = builder.panNumber;
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

	public String getPanNumber() {
		return panNumber;
	}

	static class Builder {
		private String organizationName;
		private String address1;
		private String address2;
		private String city;
		private String state;
		private String panNumber;

		public Builder setOrganizationName(String organizationName) {
			this.organizationName = organizationName;
			return this;
		}
		public Builder setAddress1(String address1) {
			this.address1 = address1;
			return this;
		}
		public Builder setAddress2(String address2) {
			this.address2 = address2;
			return this;
		}
		public Builder setCity(String city) {
			this.city = city;
			return this;
		}
		public Builder setState(String state) {
			this.state = state;
			return this;
		}
		public Builder setPanNumber(String panNumber) {
			this.panNumber = panNumber;
			return this;
		}
		
		public OrganizationDetail build() {
			return new OrganizationDetail(this);
		}
	}

	@Override
	public String toString() {
		return "OrganizationDetail [organizationName=" + organizationName + ", address1=" + address1 + ", address2="
				+ address2 + ", city=" + city + ", state=" + state + ", panNumber=" + panNumber + "]";
	}
	
}