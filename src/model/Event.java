package model;

import java.util.ArrayList;

/**
 * Represents a generic event.
 * @author Dan Martineau
 * @version 0.0
 */

public class Event {
	protected ArrayList<String> keywords;
	protected ArrayList<Object> milestones;
	protected String name;
	protected String uid;
	protected int age;
	private int year;
	//related events
	//people (relationships)
	//weather
	//year range
	
	public Event(ArrayList<String> keywords, ArrayList<Object> milestones, String name, String uid, int age, int year) {
		this.keywords = keywords;
		this.milestones = milestones;
		this.name = name;
		this.uid = uid;
		this.age = age;
		this.year = year;
	}
	
	/*TO IMPLEMENT*/
	// method to search all fields for keywords
	
	// method to search keywords for keyword

	// method to search relationships from people
	/* ********** */
	
	/**
	 * Get the name of the event.
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the unique ID of the event
	 * @return uid
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * Get author's age
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Set author's age
	 * @param age of author
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Sets the year event occurred
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return true if event is milestone
	 */
	public boolean isMilestone() {
		return milestones != null && milestones.size() > 0;
	}

	public String toString() {
		return null;
	}
}
