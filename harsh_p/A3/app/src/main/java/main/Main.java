package main;

import employees.IDriver;
import employees.IForkliftOperator;
import employees.IPicker;
import functions.HumanResources;
import functions.IReceiving;
import functions.IShipping;
import functions.Receiving;
import functions.Shipping;


import java.io.BufferedReader;
import java.io.FileReader;

public class Main
{
	private static HumanResources humanResources;
	private static IReceiving receiving;
	private static IShipping shipping;
	private static IDriver driver;
	private static IForkliftOperator forkliftOperator;
	private static IPicker picker;

	public static void main(String[] args)
	{
		System.out.println("Welcome to the warehouse!");
		initialize();
		try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"));)
		{
			String currentDIR = new java.io.File(".").getCanonicalPath();
			System.out.println("Current directory:" + currentDIR);
			String line = reader.readLine();
			while (line != null)
			{
				if (line.length() > 0)
					executeInstruction(line);
				line = reader.readLine();
			}
		}
		catch (Exception e)
		{
			System.out.println("Error working with filesystem: " + e.getMessage());
		}
		System.out.println("Human resources reports " + humanResources.getTotalMinutesEmployeesWorked() + " minutes worked.");
	}

	private static void initialize()
	{
		humanResources = new HumanResources();
		forkliftOperator = humanResources.getForkliftOperatorIterator().getForkliftOperator();
		driver = humanResources.getDriverIterator().getDriver();
		picker = humanResources.getPickerIterator().getPicker();
		shipping = new Shipping(driver,picker);
		receiving = new Receiving(forkliftOperator);
	}

	private static void executeInstruction(String line)
	{
		String[] instruction = line.split(" ");
		if (instruction[0].equals("RECEIVE"))
			receiving.receive(instruction[1], Integer.parseInt(instruction[2]));
		else if (instruction[0].equals("SHIP"))
			shipping.ship(instruction[1], instruction[2], Integer.parseInt(instruction[3]));
	}
}
