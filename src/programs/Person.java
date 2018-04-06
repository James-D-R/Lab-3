/**
 * 
 */
package programs;

/**
 * @author remjamd
 *
 */
public class Person {
	
	protected String name;
	protected String address;
	protected String id;
	
	public Person (String name, String address, String id) {
		
		this.name = name;
		this.address = address;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
