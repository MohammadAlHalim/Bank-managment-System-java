package project;

public class CustomerID 
{
	private Name name;
	private Date dateOfBirth;
	private String phoneNumber;
	private String companyName;
	private String address;

	public CustomerID(Name name, Date dateOfBirth, String phoneNumber, String companyName, String address) 
	{
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	    this.phoneNumber = phoneNumber;
	    this.companyName = companyName;
	    this.address = address;
	}

	public Name getName() 
	{
		return name;
	}

	public void setName(Name name) 
	{
		this.name = name;
	}

	public Date getDateOfBirth() 
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) 
	{
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() 
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	public String getCompanyName() 
	{
		return companyName;
	}

	public void setCompanyName(String companyName) 
	{
		this.companyName = companyName;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
	 	this.address = address;
	}
	
}


