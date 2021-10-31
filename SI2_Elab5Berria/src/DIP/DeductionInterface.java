package DIP;

import java.util.HashMap;

public interface DeductionInterface {

	int calcDeduction(String sex, String year);

	boolean isPosible(String subject, HashMap<String, Integer> subjectRecord);
}
