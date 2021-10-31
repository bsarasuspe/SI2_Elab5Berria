package SRP;

import java.util.Date;

public class Bill implements BillInterface {
	public String code;
	public Date billDate;
	public float billAmount;
	public float billDeduction;
	public float VAT;
	public float billTotal;
	
	//public CalcBillDeductionInterface b = new CalcBillDeduction();
	//public CalcVATInterface c = new CalcVAT16();
	
	public Bill(String pCode, double pBillAmount) {
		this.code = pCode;
		this.billAmount = (float) pBillAmount;
	}
	
	// Fakturaren totala kalkulatzen duen metodoa.
	@Override
	public void totalCalc(CalcVATInterface c, CalcBillDeductionInterface b) {
		// Dedukzioa kalkulatu
		billDeduction = b.CalcBillDeduction(billAmount);
		// VAT kalkulatzen dugu
		VAT = c.calcVAT(billAmount);
		// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction) + VAT;
		}
}
