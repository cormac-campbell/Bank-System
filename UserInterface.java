package implementation;
import java.util.*;
public class UserInterface {
// creating the maximum number of bank clients 
	static BankClient[] clients = new BankClient[1000];
	// values declared at the top because multiple methods use them
	private static boolean idValid = false; // default value 
	private static int currentClientID = 0; // default value
	private static char inputValue = 'Z'; // default value
	private static int count = 0; // default value just used for hard coded data
	public static void main(String[] args) 
	{
		systemStartUp();
	}
//methods triggered by the start up of the program
	private static void systemStartUp()
	{
		System.out.print("Use Case 1 batch registration");
		

		int count = 0; 
		
		for(int i = 0; i < 1000; i++)
		{
		    BankClient client = new BankClient();
		  
			client.setClientId(count);
			clients[count] = client;
			count++;
		}
		
		for(int x = 0; x < 6; x++)
		{
			System.out.print("\n Registration of bank client with ID = " + clients[x].getClientId());
		}
        // checks id and displays message
		clientLogIn();

		if (idValid == false )
		{
			System.out.print("\n ID not valid");
			System.out.print("\n try enter id again");
			clientLogIn();
		}
		else
		{
			System.out.print("\n Valid ID");
		}
		//present options 
		System.out.print("\n Options");
		displayOptions();
		
	}
	
	private static void clientLogIn() 
	{
		System.out.print("\n Use Case 2");
		System.out.print("\n Please enter your bank client ID");
		//hard coded Client ID assume right ID entered
		System.out.print("\n > \n 0");
		int inputID = 0;
		// checks client id is valid 
		System.out.print("\n checks ID");
		for(int i = 0; i < 1000; i++)
		{
			if (clients[i].getClientId() == inputID)
			{
				idValid = true;
				currentClientID = inputID;
				return;
			}
		}

	}
	
	// methods are triggered by user/client
	private static void profileReg() 
	{
	
		if(clients[currentClientID].getProfile() == null)
		{
			Profile clientProfile = new Profile();
			String age = "19";
			int AgeCheck = 0; // default value
			String firstName = "cormac";
			String lastName = "campbell";
			String address = "clondallon";
			
			System.out.print("\n\nEnter first name");
			System.out.print("\n" + firstName);
			System.out.print("\nEnter last name");
			System.out.print("\n" + lastName);
			System.out.print("\nEnter Address");
			System.out.print("\n" + address);
			System.out.print("\nEnter Age");
			System.out.print("\n" + age);
			
			//checking input whether it is valid
			//checking to see if first name is empty or not a string
			try
			{
				int numberCheck = Integer.parseInt(firstName);
				System.out.print("\nFirstname must contain a String value/Not valid");
				return;
			}
			catch (Exception ex)
			{
				
				if (firstName.trim().equals(""))
				{
					System.out.print("\nFirstname must contain a String value/Not valid");
					return;
				}
				else
				{
					System.out.print("\n\n Firstname valid.");
				}
			}
			
			//checking to see if first name is empty or not a string
			try
			{
				int numberCheck = Integer.parseInt(lastName);
				System.out.print("\nLast name must contain a String value/Not valid");
				return;
			}
			catch (Exception ex)
			{
				
				if (lastName.trim().equals(""))
				{
					System.out.print("\nLast name must contain a String value/Not valid");
					return;
				}
				else
				{
					System.out.print("\n Last name valid.");
				}
			}

			//checking to see if address is empty or not a string
			try
			{
				int numberCheck = Integer.parseInt(address);
				System.out.print("\nAddress must not only be an integer value/Not valid");
				return;
			}
			catch (Exception ex)
			{
				
				if (address.trim().equals(""))
				{
					System.out.print("\nAddress must contain a String value/Not valid");
					return;
				}
				else
				{
					System.out.print("\n Address valid.");
				}
			}

			//checking to see if age is a positive integer
		
			try
			{
				 AgeCheck = Integer.parseInt(age);
				if (AgeCheck > 0)
				{
				System.out.print("\n Age valid.");
				}
				else
				{
					System.out.print("\nAge Invalid/ must be positive integer");
					return;
				}
			}
			catch (Exception ex)
			{
				System.out.print("\nAge Invalid/ must be positive integer");
				return;
			}

			clientProfile.setFirstName(firstName);
			clientProfile.setLastName(lastName);
			clientProfile.setAddress(address);
			clientProfile.setAge(AgeCheck);
			clients[currentClientID].setProfile(clientProfile);
			System.out.print("\nPrint out succesful creation of profile");
		}
		else
		{
			System.out.print("\nBank client: " + currentClientID + " already has an exisiting profile");
		}
		inputValue = 'B';
	}
	
	private static void updateProfile() 
	{
		Profile clientProfile = clients[currentClientID].getProfile();
		String newAge = "20";
		int newAgeCheck = 0; // default value
		String newAddress = "clondallon drive";
		
		if(clients[currentClientID].getProfile() != null)
		{
		System.out.print("\nEnter Address");
		System.out.print("\n" + newAddress);
		System.out.print("\nEnter Age");
		System.out.print("\n" + newAge);

		//checking to see if age is a positive integer
		
		try
		{
			 newAgeCheck = Integer.parseInt(newAge);
			if (newAgeCheck > 0)
			{
			System.out.print("\n Age valid.");
			}
			else
			{
				System.out.print("\nAge Invalid/ must be positive integer");
				return;
			}
		}
		catch (Exception ex)
		{
			System.out.print("\nAge Invalid/ must be positive integer");
			return;
		}
		
		//checking to see if address is empty or not a string
		try
		{
			int numberCheck = Integer.parseInt(newAddress);
			System.out.print("\nAddress must not only be an integer value/Not valid");
			return;
		}
		catch (Exception ex)
		{
			
			if (newAddress.trim().equals(""))
			{
				System.out.print("\nAddress must contain a String value/Not valid");
				return;
			}
			else
			{
				System.out.print("\n Address valid.");
			}
		}
		
		clientProfile.setAddress(newAddress);
		clientProfile.setAge(newAgeCheck);
		System.out.print("\nPrint out succesful update of profile");
		}
		else
		{
			System.out.print("\nBank client: " + currentClientID + "Needs to register first");
		}
		inputValue = 'C';
	}
	
	private static void createBankAccount() 
	{

		System.out.print("\n Use Case 5. Create a bank account");
		char type = 'A'; // default value
		int id = 0; // default value
		boolean availableAccountCheck = false; // default value because if no free accounts value stays false and used for check
		// getting the id of the bank account
		for (int i = 0; i < 5; i++)
		{
			if(clients[currentClientID].getClientAccount(i) == null)
			{
				id = i;
				availableAccountCheck = true;
				i = 5;
			}
		}
		if(availableAccountCheck == false)
		{
			System.out.print("\n You have reached the maxium number of accounts");
			return;
		}
		else
		{
			System.out.print("\n Ask for account type: A. basic B. premium");
			
			if (count == 2) // this is only used for the hard coded data to change
			{
				type = 'B';
				inputValue = 'D';
			}
			
			System.out.print("\n check account type");
			System.out.print("\n" + type);
			//char check
			
			if (type == 'A')
			{
				String balance = "300.00"; // take in as a string so a number check can happen
				String cashAmount = "300.00";
				BasicAccount ac1 = new BasicAccount();
				ac1.setAccountId(id); // no check needed should be generated automatically
				try
				{
					double balanceCheck = Double.parseDouble(balance);
					double cashAmountCheck = Double.parseDouble(cashAmount);
				// if successful integer check happens checks if its positive
					if (balanceCheck >= 0 && cashAmountCheck >= 0)
					{
						ac1.setBalance(balanceCheck);
						ac1.setCashAmount(cashAmountCheck);
					}
					else
					{
						System.out.print("\n Balance and Cash Amount must be positive doubles");
						return;
					}
				
				}
				catch(Exception ex)
				{
					System.out.print("\n Balance and Cash Amount must be positive doubles");
					return;
				}
				// adding to clients account information
				clients[currentClientID].setAccount(ac1, count);
				System.out.print("\nprint out creation of basic account");
				
			}
			else if (type == 'B')
			{
				String balance = "450";
				String cashAmount = "450";
				String cashBack = "200";
				String fee = "130";
				
				PremiumAccount ac2 = new PremiumAccount();
				ac2.setAccountId(id);
				try
				{
					double balanceCheck = Double.parseDouble(balance);
					double cashAmountCheck = Double.parseDouble(cashAmount);
					double cashBackCheck = Double.parseDouble(cashBack);
					float feeCheck = Float.parseFloat(fee);
					
					if (balanceCheck >= 0 && cashAmountCheck >= 0 && cashBackCheck >= 0 && feeCheck >=0)
					{
					ac2.setBalance(450);
					ac2.setCashAmount(450);
					ac2.setCashBack(200);
					ac2.setFee(130);
					}
					else
					{
						System.out.print("\nAll Values must be positive doubles(float for fee)");
						return;
					}
				}
				catch(Exception ex)
				{
					System.out.print("\nAll Values must be positive doubles");
					return;
				}
				// all info is checked and then added to client account info
				clients[currentClientID].setAccount(ac2, count);
				System.out.print("\nprint out creation of premium account");
			}
			count++;
		}
	}
	
	private static void deleteBankAccount() 
	{
		System.out.print("\n Use Case 6. Delete Bank Account");
		System.out.print("\n Ask for ID of the bank account");
		System.out.print("\n 0");
		int position = 0; // hard coded value 

		//check for bank account id
		if (clients[currentClientID].getClientAccount(position) == null)
		{
			System.out.print("\n This bank account is already null.");
		}
		else
		{
			clients[currentClientID].setAccount(null, position);
			System.out.print("\n print out successful deletion of bank account.");
		}
		
		inputValue = 'E';
	}
	
	private static void transferMoney() 
	{
		//default values
		int sourceID = 0;
		Double cashAmount = 0.0;
		int targetID = 0;
		int targetClID = 0;
		//hard coded values and check values
		String sourceIDCheck = "1";
		String cashAmountCheck = "200";
		String targetIDCheck = "2";
		String targetClIDCheck = "0";
		
		// check if values will convert to integer and are positive
		try 
		{
		 sourceID = Integer.parseInt(sourceIDCheck);
		 cashAmount = Double.parseDouble(cashAmountCheck);
		 targetID = Integer.parseInt(targetIDCheck);
		 targetClID = Integer.parseInt(targetClIDCheck);
		 if (sourceID >= 0 && cashAmount > 0 && targetID >= 0 && targetClID >= 0)
		 {
			 System.out.print("\n values acceptable data");
		 }
		 else
		 {
			 System.out.print("\n values  not acceptable data");
			 return;
		 }
		}
		catch (Exception ex)
		{
			 System.out.print("\n values not acceptable data");
		}
		//check values entered is valid
		
		System.out.print("\n Use Case 7. Transfering Money");
		System.out.print("\n Ask for ID of the source bank account");
		System.out.print("\n1");
		System.out.print("\n Ask for ID of the target bank account");
		System.out.print("\n2");
		System.out.print("\n Ask for ID of the bank client of target bank account");
		System.out.print("\n0");
		System.out.print("\n Ask for the cash amount");
		System.out.print("\n200");
		
		// check if the source bank account is valid
		if (clients[currentClientID].getClientAccount(sourceID) == null)
		{
			System.out.print("\n This bank account is not valid.");
		}
		else
		{
			System.out.print("\n check id of source bank account");
		}
		
		// check if the target client account is valid
		if (clients[targetClID] == null)
		{
			System.out.print("\n Client account doesnt exist.");
			return;
		}
		else
		{
			System.out.print("\n check id of target client account");
		}
		
		// check if the target bank account is valid
		if (clients[targetClID].getClientAccount(targetID) == null)
		{
			System.out.print("\n This bank account is not valid.");
			return;
		}
		else
		{
			System.out.print("\n check id of target bank account");
		}

		//check if balance can transfer money
		if (clients[currentClientID].getClientAccount(sourceID).getBalance() > cashAmount)
		{
			clients[currentClientID].getClientAccount(sourceID).setBalance(clients[currentClientID].getClientAccount(sourceID).getBalance() - cashAmount);
			clients[targetClID].getClientAccount(targetID).setBalance(clients[targetClID].getClientAccount(targetID).getBalance() + cashAmount);
			System.out.print("\n check cash amount");
			System.out.print("\n check whether transfer has been made");
			System.out.print("\n Print out successful transfer");
			inputValue = 'F';
		}
		else
		{
			System.out.print("\n Not enough money to transfer.");
		    return;
		}

	}
	
	private static void printProfile() 
	{
		System.out.print("Use Case 8 - printing the profile of a bank client");
		//gathering the clients profile data
		System.out.print("\n First Name - " + clients[currentClientID].getProfile().getFirstName()
				        	+ " Last Name - " + clients[currentClientID].getProfile().getLastName()
				        	+ " Address - " + clients[currentClientID].getProfile().getAddress()
				        	+ " Age - " + clients[currentClientID].getProfile().getAge());
		inputValue = 'G';
	}
	
	private static void printAccount()
	{
		System.out.print("Use Case 9 - printing the bank accounts of a bank client");
		int count = 0;
		for (int i = 0; i < 5; i++)
		{
			
		try
		{
			//try see if account is a premium account
			PremiumAccount account = new PremiumAccount();
			account = (PremiumAccount) clients[currentClientID].getClientAccount(count);
			//print details of account
			if (account != null)
			{
			System.out.print("\n " + account.getAccountId()
			+ " cash amount - " + account.getCashAmount()
			+ " fee - " + account.getFee()
			+ " Total cash back - " + account.getCashBack());
			}
		}
		catch (Exception ex)
		{
			//if account is not premium its basic or null
			BasicAccount account = new BasicAccount();
			account = (BasicAccount) clients[currentClientID].getClientAccount(count);
			//print details of account
			if (account != null)
			{
			System.out.print("\n " + account.getAccountId()
			+ " cash amount - " + account.getCashAmount());
			}
		}
		count++;
		}
		inputValue = 'H';
	}
	
	//method display user options reduces code duplication
	private static void displayOptions()
	{
		//first input choice, input will be changed in other methods to test all use cases
		boolean exit = false; // whilst false loop repeats
		inputValue = 'A'; // hard coded first use case
		do 
		{
		System.out.print("\n\nA. Create Profile of a bank client"
				+ "\nB. Update the Profile of a bank client"
				+ "\nC. Create a bank account"
				+ "\nD. Delete a bank account"
				+ "\nE. Money Transfer"
				+ "\nF. Printing the bank accounts of a bank client"
				+ "\nG. Printing the bank accounts of a bank client"
				+ "\nE. Exit"
				+ "\nInput Choice");

			System.out.print("\n > \n" + inputValue);
		
		 switch(inputValue)
		{
			case 'A' :  profileReg(); 
			break;
			case 'B' :  updateProfile();
			break;
			case 'C' : createBankAccount();
			break;
			case 'D' :  deleteBankAccount();
			break;
			case 'E' : transferMoney();
			break;
			case 'F' :  printProfile();
			break;
			case 'G' : printAccount();
			break;
			case 'H' : exit = true;
			break;	
			default: System.out.println("Option "+inputValue+" is invalid.");
		}
	} while (exit != true);
	        System.out.println("\n GoodBye!");
	}
	
}
