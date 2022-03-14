package implementation;

public class BankClient 
{
//variables
	private int clientId;
	private Profile clientProfile;
	private Account[] clientAccounts = new Account[5];
	
	//setters
	public void setClientId(int clientId)
	{
		this.clientId = clientId;
	}
	
	public void setProfile(Profile clientProfile)
	{
		this.clientProfile = clientProfile;
	}
	
	public void setAccount(Account clientAccount, int position)
	{
		this.clientAccounts[position] = clientAccount;
	}
	
	//getters
	public int getClientId()
	{
		return this.clientId;
	}
	
	public Profile getProfile()
	{
		return this.clientProfile;
	}
		
	public Account getClientAccount(int position)
	{
		return this.clientAccounts[position];
	}

}
