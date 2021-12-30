package employees;

public interface IForkliftOperatorIterator extends IEmployeeIterator {
    public ForkliftOperator getForkliftOperator();

    public void initializeForkliftOperators(int forkliftCount);

    public int iterateAndAddForkliftMinutes();
}
