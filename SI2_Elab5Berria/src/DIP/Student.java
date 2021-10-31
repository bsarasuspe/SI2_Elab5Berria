package DIP;

import java.util.HashMap;

public class Student {
	
	
	public String name;
	public String sex;
	public String year;
	
	// matrikulatuta dagoen espedientea
	public HashMap<String,Integer> subjectRecord;
	
	// ikasleak ordaindu behar duena
	public String toCharge;
	
	private DeductionInterface deduction;
	private PreconditionsInterface preconditions;
	private SubjectQuotesInterface subjectQuotes;
	
	// Irakasgai batean matrikulatzen duen metodoa.
	public void register(String subject) {
		
		// Aurrebaldintzak konprobatzen dira
		
		boolean isPosible = deduction.isPosible(subject , subjectRecord);
		
			if (isPosible) {
				
				// Dedukzioa kalkulatu sex eta edadearen arabera
				int percentage = deduction.calcDeduction(sex, year);
				
				// Irakasgaiaren prezioa lortu
				int quote = subjectQuotes.getPrice(subject);
				
				// HashMap batean gordetzen du eta ordaindu behar duen balioa eguneratu
				subjectRecord.put(subject,null);
				toCharge = toCharge+(quote-percentage*quote/100); 
			
			}	
	}

}
