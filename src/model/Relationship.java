package model;

/**
 * Immutable -- Represents a relationship between author and another person.
 * @author Dan Martineau
 * @version 0.1
 */

public class Relationship {
	String name;
	String uid;
	boolean family;
	
	public Relationship(String name, String uid, boolean family) {
		this.name = name;
		this.uid = uid;
		this.family = family;
	}
	
	public boolean equals(Relationship relationship) {
		boolean match = false;
		
		if (relationship.getUid().equals(uid)) {
			match = true;
		}
		
		return match;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * @return the family
	 */
	public boolean isFamily() {
		return family;
	}

	public String toString() {
		return null;
	}
}
