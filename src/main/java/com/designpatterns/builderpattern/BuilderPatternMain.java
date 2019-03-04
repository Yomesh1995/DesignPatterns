/**
 * 	Builder Pattern Large Form Example  
 */
package com.designpatterns.builderpattern;

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
		Form form = new Form.FormBuilder("abc", "sector 24", "gurgoan", "haryana", "abc12XYZ", "ABC", "XYZ", "DL",
				"DL2019", "Name ?", "yomesh").build();
		System.out.println(form.toString());
	}

}
