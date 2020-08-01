package com.luv2code.springdemo.mvc.model;

import java.util.LinkedHashMap;

public class Student {
String firstName;
String lastName;
String country;
private String favourateLanguage;
private LinkedHashMap<String, String> countryOptions;
private LinkedHashMap<String, String> favouriteLanguageOptions;
private String[] operatingSystems;
public Student() {
	countryOptions = new LinkedHashMap<>();
	countryOptions.put("Brazil", "Brazil");
	countryOptions.put("India", "India");
	countryOptions.put("USA", "USA");
	countryOptions.put("France", "France");
	countryOptions.put("England", "England");
	
	favouriteLanguageOptions = new LinkedHashMap<>();
	favouriteLanguageOptions.put("Java", "Java");
	favouriteLanguageOptions.put("Ruby", "Ruby");
	favouriteLanguageOptions.put("C#", "C#");
	favouriteLanguageOptions.put("Pythan", "Pythan");
	favouriteLanguageOptions.put("dotNet", "dotNet");
	
	
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public LinkedHashMap<String, String> getCountryOptions() {
	return countryOptions;
}
public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
	this.countryOptions = countryOptions;
}
public String getFavourateLanguage() {
	return favourateLanguage;
}
public void setFavourateLanguage(String favourateLanguage) {
	this.favourateLanguage = favourateLanguage;
}
public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
	return favouriteLanguageOptions;
}
public void setFavouriteLanguageOptions(LinkedHashMap<String, String> favouriteLanguageOptions) {
	this.favouriteLanguageOptions = favouriteLanguageOptions;
}
public String[] getOperatingSystems() {
	return operatingSystems;
}
public void setOperatingSystems(String[] operatingSystems) {
	this.operatingSystems = operatingSystems;
}


}
