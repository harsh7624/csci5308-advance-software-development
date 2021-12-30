package employees;

public class ForkliftOperator extends Employee implements IForkliftOperator
{
	private static final int FORKLIFT_TIME_MINUTES = 20;
	public ForkliftOperator()
	{
		super();
	}

	public void storeItem(String item, int count)
	{
		logTime(FORKLIFT_TIME_MINUTES * count);
		System.out.println("Stored " + count + " " + item);
	}
}
