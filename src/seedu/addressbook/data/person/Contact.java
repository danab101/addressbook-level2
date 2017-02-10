package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's contact in the address book. Which also has subclasses Address, Email, and Name. 
 */

public class Contact {

	public String value;
	private boolean isPrivate;

	/**
	 * Validates given contact.
	 *
	 * @throws IllegalValueException if given contact string is invalid.
	 */

	public Contact(String contact, boolean isPrivate, String messageConstraints, String validRegex) throws IllegalValueException {
		String trimmedContact = contact.trim();
		this.isPrivate = isPrivate;
		if (!isValid(trimmedContact, validRegex)) {
			throw new IllegalValueException(messageConstraints);
		}
		this.value = trimmedContact;
	}

	/**
	 * Returns true if a given string is a valid contact.
	 */
	public static boolean isValid(String test, String validRegex) {
		return test.matches(validRegex);
	}

	@Override
	public String toString() {
		return value;
	}

	@Override
	public boolean equals(Object other) {
		return other == this // short circuit if same object
				|| (other instanceof Contact // instance of handles nulls
						&& this.value.equals(((Contact) other).value)); // state check
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}

}
