/** AddressEntry: This class use for the storing the data in another words acting as Java Bean
 * @since  4/18/2016
 * @version 1.0
**/

public class AddressEntry {
	/**
	 * Storing the First Name
	 **/
	private String firstName;           						
	/**
	 * Storing the Last Name
	 **/ 							
	private String lastName;
	/**
	 * Storing the Street
	 **/ 		
	private String street;
	/**
	 * Storing the State
	 **/ 		
	private String state;
	/**
	 * Storing the phone
	 **/ 	
	private String phone;
	/**
	 *  storing the email
	 **/ 	
	private String email;
	/**
	 *   Storing the Zip
	 **/ 	
	private Integer zip;  				 
	
	/**
	 * Constructor for initialize the variable
	 * @param FirstName:firstname of the contact
	 * @param LastName:lastname of the contact
	 * @param Street:Street of the contact
	 * @param State:State of the contact
	 * @param Phone:Phone of the contact
	 * @param Email:Email of the contact
	 * @param Zip:Zip of the contact
	 *  
	 **/
	AddressEntry(String firstName,String lastName,String street,String state,String phone,String email,Integer zip){
		this.email=email;
		this.firstName=firstName;
		this.lastName=lastName;
		this.phone=phone;
		this.state=state;
		this.zip=zip;
		
		
	}
	/**
	 * setting the first name
	 * * @param FirstName:firstname of the contact
	
	 **/
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * getting the First Name
	 **/
	public String getFirstName() {
		return firstName;
	}
	/**
	 * setting the Last name

	 * @param LastName:lastname of the contact
	
	 **/
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * getting the last name
	 **/
	public String getLastName() {
		return lastName;
	}
	/**
	 * setting the street
	 * @param Street:Street of the contact
	 
	 **/
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * getting the street
	 **/
	public String getStreet() {
		return street;
	}
	/** 
	 * setting the state value
	 * @param State:State of the contact
	 **/
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * getting the state value
	 **/
	public String getState() {
		return state;
	}
	/**
	 * setting the phone value
	
	 * @param Phone:Phone of the contact
	
	 **/
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * getting the phone
	 
	 * @param Phone:Phone of the contact
	 
	 **/
	public String getPhone() {
		return phone;
	}
	/**
	 * setting the email

	 * @param Email:Email of the contact
	 **/
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * getting the Email
	 **/
	public String getEmail() {
		return email;
	}
	/**
	 * setting the Zip 
	 
	 * @param Zip:Zip of the contact
	 **/
	public void setZip(Integer zip) {
		this.zip = zip;
	}
	/**
	 * getting the Zip
	 **/
	public Integer getZip() {
		return zip;
	}

}
