package model;

import java.util.ArrayList;

/**
 * Represents a generic event.
 * @author Dan Martineau
 * @version 0.1
 */

public class Event {
	protected ArrayList<String> keywords;
	protected ArrayList<String> relatedEvents;
	protected ArrayList<Person> people;
	protected ArrayList<Milestone> milestones;
	protected YearRange range;
	protected String name;
	protected String uid;
	protected int age;
	protected int year;
	
	public Event(ArrayList<String> keywords, ArrayList<String> relatedEvents, ArrayList<Person> people,
			ArrayList<Milestone> milestones, YearRange range, String name, String uid, int age, int year) {
		this.keywords = keywords;
		this.relatedEvents = relatedEvents;
		this.people = people;
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
	public boolean isEventRelated(String event) {
		return relatedEvents.contains(event);
	}
	
	/**
	 * @return the people
	 */
	public ArrayList<Person> getPeople() {
		return new ArrayList<Person>(people);
	}
	
	/**
	 * Add a person
	 * @param person to add
	 * @return true if added, false if already present
	 */
	public boolean addPerson(Person person) {
		boolean added = false;
		boolean match = false;
		
		for (Person i : people) {
			if(i.equals(person)) {
				match = true;
				break;
			}
		}
		
		if(!match) {
			people.add(person);
			added = true;
		}
		
		return added;
	}
	
	/**
	 * Remove a person if present
	 * @param person to remove
	 * @return true if removed, false if not present
	 */
	public boolean removePerson(Person person) {
		boolean removed = false;
		
		for(int i = 0; i < people.size(); i++) {
			if(people.get(i).equals(person)) {
				people.remove(i);
				removed = true;
			}
		}
		
		return removed;
	}
	
	/**
	 * Tells if person is present
	 * @param person to check presence of
	 */
	public boolean hasPerson(Person person) {
		boolean match = false;
		
		for (Person i : people) {
			if(i.equals(person)) {
				match = true;
				break;
			}
		}
		
		return match;
	}
	
	/**
	 * Tells if this event involves any person with a given relationship
	 * @param relationship 
	 * @return true if present
	 */
	public boolean hasRelationshipPersonal(Relationship relationship) {
		boolean isPresent = false;
		
		for (Person person : people) {
			if(person.hasRelationship(relationship)) {
				isPresent = true;
			}
		}
		
		return isPresent;
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
