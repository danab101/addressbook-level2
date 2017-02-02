package seedu.addressbook.data.person;

/**
 * Represents a Person's PostalCode in the address book.
 */
public class PostalCode {
	
	private String postalCode;
	
	public PostalCode(String postal_Code){
		this.postalCode = postal_Code;
	}
	
	public String getPostalCode(){
		return this.postalCode;
	}
	
	public void setPostalCode(String postal_Code){
		this.postalCode = postal_Code;
	}

}
	