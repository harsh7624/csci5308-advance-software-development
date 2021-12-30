package employees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DriverIterator implements IDriverIterator {

    private List<Driver> driverList;
    private int nextDriver;

    public DriverIterator(){
        driverList = new ArrayList<>();
        initializeDrivers(TOTAL_EMPLOYEES);
        nextDriver = 0;
    }

    @Override
    public int iterateAndAddDriversMinutes(){
        int minutes = 0;
        Iterator<Driver> iterator =  driverList.iterator();
        while (iterator.hasNext()){
            minutes = minutes + iterator.next().getMinutesWorkedSinceLastPay();
        }
        return minutes;
    }

    @Override
    public Driver getDriver() {
        Driver driver = driverList.get(nextDriver);
        nextDriver = nextEmployee(nextDriver);
        return driver;
    }

    @Override
    public void initializeDrivers(int driverCount){
        for (int i = 0; i < driverCount; i++) {
            driverList.add(new Driver());
        }
    }

    @Override
    public int nextEmployee(int currentCount) {
        return (currentCount + 1) % TOTAL_EMPLOYEES;
    }
}
