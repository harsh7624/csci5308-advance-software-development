package employees;

public interface IDriverIterator extends IEmployeeIterator {
    public Driver getDriver();
    public void initializeDrivers(int driverCount);
    public int iterateAndAddDriversMinutes();
}
