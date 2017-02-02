package seedu.addressbook.data.person;

/**
 * Represents a Person's unit in the address book.
 */
public class Unit {
	
	private String unit;
	
	public Unit(String unit_Num){
		this.unit = unit_Num;
	}
	
	public String getUnit(){
		return this.unit;
	}
	
	public void setUnit(String unit_Num){
		this.unit = unit_Num;
	}

}
