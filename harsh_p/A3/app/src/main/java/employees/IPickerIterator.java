package employees;

public interface IPickerIterator extends IEmployeeIterator {
    public Picker getPicker();
    public void initializePickers(int pickerCount);
    public int iterateAndAddPickersMinutes();
}
