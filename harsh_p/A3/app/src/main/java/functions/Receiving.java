package functions;

import employees.IForkliftOperator;

public class Receiving implements IReceiving
{
	private IForkliftOperator forkliftOperator;

	public Receiving(IForkliftOperator forkliftOperator)
	{
		this.forkliftOperator = forkliftOperator;
	}

	@Override
	public void receive(String item, int count)
	{
		forkliftOperator.storeItem(item, count);
		System.out.println("Received " + count + " " + item);
	}
}
