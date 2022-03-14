package implementation;

public class PremiumAccount extends BasicAccount
{
//variables 
	private float fee;
	private double cashBack;
	
	//setters 
	public void setFee(float fee)
	{
		this.fee = fee;
	}
	
	public void setCashBack(double cashBack)
	{
		this.cashBack = cashBack;
	}
	
	//getters
	public float getFee()
	{
		return this.fee;
	}
	
	public double getCashBack()
	{
		return this.cashBack;
	}

}
