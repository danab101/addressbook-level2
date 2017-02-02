package seedu.addressbook.data.person;

/**
 * Represents a Person's block in the address book.
 */
public class Block {
	
	private String block;
	
	public Block(String block_Num){
		this.block = block_Num;
		
	}
	
	public String getBlock(){
		return this.block;
	}
	
	public void setBlock(String block_Num){
		this.block = block_Num;
	}

}
