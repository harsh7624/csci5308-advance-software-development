package employees;

public class Picker extends Employee implements IPicker
{
	private static final int RETRIEVE_TIME_MINUTES = 5;
	public Picker()
	{
		super();
	}

	public void retrieve(String item, int count)
	{
		logTime(RETRIEVE_TIME_MINUTES * count);
		System.out.println("Picked " + count + " " + item);
	}
}
