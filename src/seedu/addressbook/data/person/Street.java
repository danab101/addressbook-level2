package seedu.addressbook.data.person;

/**
 * Represents a Person's street in the address book.
 */
public class Street {

	private String street;
	
	public Street(String street_Num){
		this.street = street_Num;
	}
	
	public String getStreet(){
		return this.street;
	}
	
	public void setStreet(String street_Num){
		this.street = street_Num;
	}
}
