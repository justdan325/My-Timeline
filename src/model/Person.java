package model;

import java.util.ArrayList;

/**
 * Represents an individual that is relevant to the author.
 * @author Dan Martineau
 * @version 0.1
 */

public class Person {
	private ArrayList<Relationship> relationships;
	private String nameFirst;
	private String nameLast;
	private String nameMiddle;
	private int birthYear;
	
	public Person(ArrayList<Relationship> relationships, String nameFirst, String nameLast, String nameMiddle, int birthYear) {
		this.relationships = relationships;
		this.nameFirst = nameFirst;
		this.nameLast = nameLast;
		this.nameMiddle = nameMiddle;
		this.birthYear = birthYear;
	}

	/**
	 * @return the relationships
	 */
	public ArrayList<Relationship> getRelationships() {
		return new ArrayList<Relationship>(relationships);
	}

	/**
	 * @param relationship to add
	 * @return true if added
	 */
	public boolean addRelationship(Relationship relationship) {
		boolean added = false;
		boolean match = false;

		for (Relationship i : relationships) {
			if (i.equals(relationship)) {
				match = true;
				break;
			}
		}

		if (!match) {
			relationships.add(relationship);
			added = true;
		}

		return added;
	}
	
	/**
	 * @param relationship to remove
	 * @return true if added
	 */
	public boolean removeRelationship(Relationship relationship) {
		boolean removed = false;

		for (int i = 0; i < relationships.size(); i++) {
			if (relationships.get(i).equals(relationship)) {
				relationships.remove(i);
				removed = true;
				break;
			}
		}

		return removed;
	}
	
	/**
	 * Returns true if given relationship is present
	 * @param relationship
	 * @return true if present
	 */
	public boolean hasRelationship(Relationship relationship) {
		boolean isPresent = false;

		for (int i = 0; i < relationships.size(); i++) {
			if (relationships.get(i).equals(relationship)) {
				isPresent = true;
				break;
			}
		}

		return isPresent;
	}

	/**
	 * @return the nameFirst
	 */
	public String getNameFirst() {
		return nameFirst;
	}

	/**
	 * @param nameFirst the nameFirst to set
	 */
	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}

	/**
	 * @return the nameLast
	 */
	public String getNameLast() {
		return nameLast;
	}

	/**
	 * @param nameLast the nameLast to set
	 */
	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}

	/**
	 * @return the nameMiddle
	 */
	public String getNameMiddle() {
		return nameMiddle;
	}

	/**
	 * @param nameMiddle the nameMiddle to set
	 */
	public void setNameMiddle(String nameMiddle) {
		this.nameMiddle = nameMiddle;
	}

	/**
	 * @return the birthYear
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * @param birthYear the birthYear to set
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
}
