package A1;

import java.util.ArrayList;
import java.util.List;

public class Validation {

	public List<String> validateDecimal(String... values){
		
		String[] input = values;
		List<String> tempList = new ArrayList<>();
		for (int i = 0; i < input.length;i++) {
			String[] str1Parts = input[i].split("[.]");
			int length = str1Parts[1].length();
			if(length <= 2) {
			}
			else {
				String message = "Too many decimal places for value "  + input[i];
				tempList.add(message);
			}
		}
		return tempList;
	}

 
}
