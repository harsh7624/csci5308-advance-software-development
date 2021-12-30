package employees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PickerIterator implements IPickerIterator {

    private List<Picker> pickerList;
    private int nextPicker;

    public PickerIterator(){
        pickerList = new ArrayList<>();
        initializePickers(TOTAL_EMPLOYEES);
        nextPicker = 0;
    }

    @Override
    public int iterateAndAddPickersMinutes(){
        int minutes = 0;
        Iterator<Picker> iterator =  pickerList.iterator();
        while (iterator.hasNext()){
            minutes = minutes + iterator.next().getMinutesWorkedSinceLastPay();
        }
        return minutes;
    }

    @Override
    public Picker getPicker() {

        Picker picker = pickerList.get(nextPicker);
        nextPicker = nextEmployee(nextPicker);
        return picker;
    }

    @Override
    public void initializePickers(int driverCount){
        for (int i = 0; i < driverCount; i++) {
            pickerList.add(new Picker());
        }
    }

    @Override
    public int nextEmployee(int currentCount) {
        return (currentCount + 1) % TOTAL_EMPLOYEES;
    }
}
