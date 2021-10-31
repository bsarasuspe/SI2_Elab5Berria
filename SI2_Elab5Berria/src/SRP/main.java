package SRP;

public class main {

	public static void main(String[] args) {
		
		String code;
		double billAmount;
		
		System.out.println("Lehenego proba:");
		code = "1";
		billAmount = 920.1;
		
		Bill b = new Bill(code, billAmount);
		b.totalCalc(new CalcVAT16(), new CalcBillDeduction());
		System.out.println(b.billAmount);
		
		System.out.println("Bigarrengo proba:");
		code = "0";
		billAmount = 920.1;
		
		BillInterface b2 = new Bill(code, billAmount);
		b.totalCalc(new CalcVAT18(), new CalcBillDeductionAmount());
		
		System.out.println("Hirugarrengo proba:");
		code = "3";
		billAmount = 920.1;
		
		BillInterface b3 = new Bill(code, billAmount);
		b.totalCalc(new CalcVAT16(), new CalcBillDeduction());
		
	}
	
}
