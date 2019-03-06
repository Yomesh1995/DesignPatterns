package com.designpatterns.builderpattern.example1;

public class Form {
	
	private OrganizationDetail organizationDetail;
	private PersonalDetail personalDetail;
	
	private Form(Builder builder) {
		this.organizationDetail = builder.organizationDetail;
		this.personalDetail = builder.personalDetail;
	}
	public OrganizationDetail getOrganizationDetail() {
		return organizationDetail;
	}
	public PersonalDetail getPersonalDetail() {
		return personalDetail;
	}
	
	static class Builder {
		private OrganizationDetail organizationDetail;
		private PersonalDetail personalDetail;
		
		public Builder setOrganizationDetail(OrganizationDetail organizationDetail) {
			this.organizationDetail = organizationDetail;
			return this;
		}
		
		public Builder setPersonalDetail(PersonalDetail personalDetail) {
			this.personalDetail = personalDetail;
			return this;
		}
		public Form build() {
			return new Form(this);
		}
	}

	@Override
	public String toString() {
		return "Form [organizationDetail=" + organizationDetail + ", personalDetail=" + personalDetail + "]";
	}
	
}
