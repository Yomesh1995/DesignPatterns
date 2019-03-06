/**
 * 	Builder Pattern Large Form Example  
 */
package com.designpatterns.builderpattern.example1;

/**
 * @author yrr
 * 04/03/2019
 *
 */
public class BuilderPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* 
		 * If We don't use builder pattern to create form class object then
		 * we have to create Form class object with either all fields (OrganizationDetail and PersonalDeatil)
		 * constructor or using setters.
		 */
		/*Form form = new Form("abc", "sector 24", "gurgoan", "haryana", "abc12XYZ", "ABC", "XYZ", "DL",
				"DL2019", "Name ?", "yomesh");
		System.out.println(form.toString());*/
		
		
		/*
		 * Using Builder Pattern we can modularized Form and can get Organization and Personal Detail immutable object 
		 */
		OrganizationDetail orgDetail = new OrganizationDetail.Builder()
											.setOrganizationName("abc")
											.setAddress1("sector 24")
											.setAddress2("dlf")
											.setCity("gurgaon")
											.setPanNumber("abc12XYZ")
											.build();
		
		PersonalDetail personalDetail = new PersonalDetail.Builder()
											.setFirstName("ABC")
											.setLastName("XYZ")
											.setIdType("DL")
											.setIdNumber("DL2019")
											.setMobileNumber("123546789")
											.setPhoneNumber("987654321")
											.build();
		
		Form form = new Form.Builder().setOrganizationDetail(orgDetail)
									.setPersonalDetail(personalDetail)
									.build();
		System.out.println(form.toString());
		
	}

}
