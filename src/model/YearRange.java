package model;

/**
 * Immutable -- Represents a range of years
 * @author Dan Martineau
 * @version 0.1
 */

public class YearRange {
	private int start;
	private int end;
	
	public YearRange(int start, int end) {
		assert end >= start : "Year range should not be negative!";
		
		this.start = start;
		this.end = end;
	}

	/**
	 * @return the start
	 */
	public int getStart() {
		return start;
	}

	/**
	 * @return the end
	 */
	public int getEnd() {
		return end;
	}
	
	/**
	 * Fetch the number of years between start and end
	 * @return range
	 */
	public int getRange() {
		return end - start;
	}
	
	public String toString() {
		return null;
	}
}
