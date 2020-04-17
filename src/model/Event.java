package model;

import java.util.ArrayList;

/**
 * Represents a generic event.
 * @author Dan Martineau
 * @version 0.0
 */

public class Event {
	protected ArrayList<String> keywords;
	protected ArrayList<String> relatedEvents;
	protected ArrayList<Milestone> milestones;
	protected YearRange range;
	protected String name;
	protected String uid;
	protected int age;
	private int year;
	//people (relationships)
	//weather
	
	public Event(ArrayList<String> keywords, ArrayList<String> relatedEvents, ArrayList<Milestone> milestones, YearRange range, String name, String uid, int age, int year) {
		this.keywords = keywords;
		this.relatedEvents = relatedEvents;
		this.milestones = milestones;
		this.range = range;
		this.name = name;
		this.uid = uid;
		this.age = age;
		this.year = year;
	}
	
	// TODO:
	/*TO IMPLEMENT*/
	// method to search all fields for keywords
	
	// method to search keywords for keyword

	// method to search relationships from people
	/* ********** */
	
	/**
	 * Fetch related events
	 * @return relatedEvents
	 */
	public ArrayList<String> getRelatedEvents() {
		return relatedEvents;
	}
	
	/**
	 * Adds a related event to the list
	 * @param uid of a related event
	 * @return true if uid not already in list
	 */
	public boolean addRelatedEvent(String event) {
		boolean added = false;
		
		if(!relatedEvents.contains(event)) {
			relatedEvents.add(event);
			added = true;
		}
		
		return added;
	}
	
	/**
	 * Determine if an event is related to this one
	 * @param uid of a potentially related event
	 * @return true if related
	 */
	public boolean isRelated(String event) {
		return relatedEvents.contains(event);
	}
	
	/**
	 * Add a milestone to the list if not already present
	 * @param Milestone to add
	 * @return true if not already in list
	 */
	public boolean addMilestone(Milestone milestone) {
		boolean added = false;
		
		if(!milestones.contains(milestone)) {
			milestones.add(milestone);
			added = true;
		}
		
		return added;
	}
	
	/**
	 * Remove a milestone from the list if it is present
	 * @param milestone to remove
	 * @return true if milestone was present
	 */
	public boolean removeMilestone(Milestone milestone) {
		boolean removed = false;
		
		if(milestones.contains(milestone)) {
			milestones.remove(milestone);
			removed = true;
		}
		
		return removed;
	}
	
	/**
	 * Returns true if event is specific milestone in list
	 * @return true if milestone in list
	 */
	public boolean isParticularMilestone(Milestone milestone) {
		boolean isParticularMilestone = false;
		
		if(milestones.contains(milestone)) {
			isParticularMilestone = true; 
		}
		
		return isParticularMilestone;
	}

	/**
	 * @return the range
	 */
	public YearRange getRange() {
		return range;
	}

	/**
	 * @param range the range to set
	 */
	public void setRange(YearRange range) {
		this.range = range;
	}

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
