package model;

/**
 * Immutable -- Represents specific milestone
 * @author Dan Martineau
 * @version 0.2
 */

public class Milestone {
	private String name;
	private String uid;
	
	public Milestone(String name, String uid) {
		this.name = name;
		this.uid = uid;
	}
	
	public boolean equals(Milestone milestone) {
		return milestone.getUid().equals(uid);
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
	
	public String toString() {
		return null;
	}
}
