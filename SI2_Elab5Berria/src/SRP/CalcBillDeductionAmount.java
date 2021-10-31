package SRP;

public class CalcBillDeductionAmount implements CalcBillDeductionInterface {

	public int deductionPercentage;
	
	@Override
	public float CalcBillDeduction(float billAmount) {
		float billDeduction;
		if (billAmount >50000)
			 billDeduction = (billAmount * deductionPercentage +5) / 100;
		else billDeduction = (billAmount * deductionPercentage) / 100;
		return billDeduction;
	}
}
