
public class Dollar 
{
	int amount = 10;
	
	public Dollar(int amount) 
	{
		this.amount = amount;
	}

	public boolean equals(Object object) 
	{
		Dollar dollar= (Dollar) object;
		return amount == dollar.amount;
	}

}
