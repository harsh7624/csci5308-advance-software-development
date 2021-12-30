package functions;

import employees.*;

public class HumanResources
{

	private DriverIterator driverIterator;
	private ForkliftOperatorIterator forkliftOperatorIterator;
	private PickerIterator pickerIterator;

	public HumanResources()
	{
		driverIterator = new DriverIterator();
		forkliftOperatorIterator = new ForkliftOperatorIterator();
		pickerIterator = new PickerIterator();

	}

	public DriverIterator getDriverIterator() {
		return driverIterator;
	}

	public ForkliftOperatorIterator getForkliftOperatorIterator() {
		return forkliftOperatorIterator;
	}

	public PickerIterator getPickerIterator() {
		return pickerIterator;
	}

	public int getTotalMinutesEmployeesWorked() {
		return driverIterator.iterateAndAddDriversMinutes() + pickerIterator.iterateAndAddPickersMinutes()
				+ forkliftOperatorIterator.iterateAndAddForkliftMinutes();
	}

}
