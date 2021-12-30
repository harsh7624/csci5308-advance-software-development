package employees;

public class Driver extends Employee implements IDriver
{
	private static final int DRIVE_TIME_MINUTES = 15;
	public Driver()
	{
		super();
	}

	public void deliver(String account, String item, int count)
	{
		logTime(DRIVE_TIME_MINUTES * count);
		System.out.println("Delivered " + item + " to " + account);
	}
}
