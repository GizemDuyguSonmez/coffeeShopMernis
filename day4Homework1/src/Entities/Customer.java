package Entities;

import java.time.LocalDate;

public class Customer {
    
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate DateOfBirth;
	private String NationalityId;
	
	public Customer(String FirstName, String LastName, LocalDate DateOfBirth,  String NationalityId) {
		
		setDateOfBirth(DateOfBirth);
	    setFirstName(FirstName);
	    setLastName(LastName);
	    setNationalityId(NationalityId);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

}
