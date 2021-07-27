package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength=10 ;
	private String department;
	private String email ;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "TCS.com";
	
	// Constructor to receive the first name and last name 
	
	public Email (String firstName , String lastName)
	{
		this.firstName = firstName ;
		this.lastName = lastName ;
		//System.out.println("Email Created : "+ this.firstName + " "+ this.lastName);
		
		//Call a method asking for a department then return department 
		this.department = setDepartment();
		//System.out.println("Department : " + this.department);
		
		// Call a method that return a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is : " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() +"."+lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("YOUR EMAIL IS : " + email);
		
	}
	

	
	
	// Ask for the department 
	
	private String setDepartment ()
	{
		System.out.println("New Worker: " + firstName + lastName + " \n Enter the Department Codes:\n1 for salary\n2 for department\n3 for Accounting \n0 for none \nEnter Department code : ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if(depChoice == 1)
		{
			return "Sales" ;
			
		}
		else if (depChoice == 2)
		{
			return "dev" ;
			
		}
		else if (depChoice == 3)
		{
			return "acct" ;
			
		}
		else
		{
			return "none";
		}
	
		
		
	}
	
	//Generate a random password
	
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
		char[] password = new char[length];
		
		for(int i =0 ; i<length; i++)
		{
			int rand = (int) (Math.random() * passwordSet.length());
			password[i]= passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox Capacity
	
	public void SetMailboxCapacity(int capacity)
	{
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail = altEmail;
	}
	
	//Change the password
    public void changePassword (String password)
    {
    	this.password = password ; 
    }
    
    //
    
    
    public int getMailboxCapacity()
    {
    	return mailboxCapacity;
    }
    public String getAlternateEmail()
    {
    	return alternateEmail;
    }
    public String getPassword()
    {
    	return password;
    }
    
   
    public String showInfo()
    {
    	return "EMPLOYEE NAME : " + firstName + " " + lastName +
    		   "\nCOMPANY EMAIL :" + email +
    		   "\nMAILBOX CAPACIY : " + mailboxCapacity + "mb";
    }
    
}
