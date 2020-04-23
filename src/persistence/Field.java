package persistence;

/**
 * Represents a field of an item--Key value pair
 * @author Dan Martineau
 * @version 0.1
 */

public class Field {
	private String name;
	private String value;
	
	public Field(String name, String value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * @return the name of the field
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return value as a string
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * @return value as a prim. integer
	 */
	public int getValueAsInt() {
		return Integer.parseInt(value);
	}
	
	/**
	 * @return value as a prim. long
	 */
	public long getValueAsLong() {
		return Long.parseLong(value);
	}
	
	/**
	 * @return value as a prim double
	 */
	public double getValueAsDouble() {
		return Double.parseDouble(value);
	}
}
