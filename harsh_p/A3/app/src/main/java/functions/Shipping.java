package functions;

import employees.IDriver;
import employees.IPicker;

public class Shipping implements IShipping
{
	private IDriver driver;
	private IPicker picker;

	public Shipping(IDriver driver, IPicker picker)
	{
		this.driver = driver;
		this.picker = picker;
	}

	@Override
	public void ship(String item, String account, int count)
	{
		picker.retrieve(item, count);
		driver.deliver(account, item, count);
		System.out.println("Shipped " + count + " " + item + " to " + account);
	}
}
