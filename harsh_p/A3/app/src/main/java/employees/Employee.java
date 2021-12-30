package employees;

public class Employee
{
	private int minutesWorkedSinceLastPay;

	public Employee()
	{
		minutesWorkedSinceLastPay = 0;
	}

	protected void logTime(int minutes) {
		minutesWorkedSinceLastPay += minutes;
	}

	public int getMinutesWorkedSinceLastPay()
	{
		return minutesWorkedSinceLastPay;
	}
}
