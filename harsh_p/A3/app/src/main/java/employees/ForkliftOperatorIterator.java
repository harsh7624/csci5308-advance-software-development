package employees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForkliftOperatorIterator implements IForkliftOperatorIterator {
    private List<ForkliftOperator> forkliftOperatorList;
    private int nextForkliftOperator;

    public ForkliftOperatorIterator(){
        forkliftOperatorList = new ArrayList<>();
        initializeForkliftOperators(TOTAL_EMPLOYEES);
        nextForkliftOperator = 0;
    }

    @Override
    public int iterateAndAddForkliftMinutes(){
        int minutes = 0;
        Iterator<ForkliftOperator> iterator =  forkliftOperatorList.iterator();
        while (iterator.hasNext()){
            minutes = minutes + iterator.next().getMinutesWorkedSinceLastPay();
        }
        return minutes;
    }

    @Override
    public ForkliftOperator getForkliftOperator() {
        ForkliftOperator forkliftOperator = forkliftOperatorList.get(nextForkliftOperator);
        nextForkliftOperator = nextEmployee(nextForkliftOperator);
        return forkliftOperator;
    }

    @Override
    public void initializeForkliftOperators(int forkliftOperatorCount){
        for (int i = 0; i < forkliftOperatorCount; i++) {
            forkliftOperatorList.add(new ForkliftOperator());
        }
    }

    @Override
    public int nextEmployee(int currentCount) {
        return (currentCount + 1) % TOTAL_EMPLOYEES;
    }
}
