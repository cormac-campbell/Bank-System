package implementation;

public class Profile 
{
//variables 
	private String firstName;
	private String lastName;
	private String address;
	private int age;
	
	// setter methods 
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	//getter methods 
	
	public String getFirstName()
	{
		return  this.firstName;
	}
	
	public String getLastName()
	{
		return  this.lastName;
	}
	
	public String getAddress()
	{
		return  this.address;
	}
	
	public int getAge()
	{
		return  this.age;
	}
}
