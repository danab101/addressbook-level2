package seedu.addressbook.data.person;

/**
 * This class will represent an adding or deleting of a tag for a specific person that happened during that session.
 */

import seedu.addressbook.data.tag.Tag;

public class Tagging {
	
	private String taggingLabel;
	
	public Tagging(String symbol,Person person, Tag tag){	
		taggingLabel = symbol+person.getName() + " ["+tag.tagName+"] ";
	}

	public String getTaggingLabel() {
		return taggingLabel;
	}

}