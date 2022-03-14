package implementation;

public class BasicAccount extends Account
{
	//variables

		private double cashAmount;
		
		//setter methods

		public void setCashAmount(double cashAmount)
		{
			this.cashAmount = cashAmount;
		}
		
		//getter methods

		public double getCashAmount()
		{
			return this.cashAmount;
		}
}
