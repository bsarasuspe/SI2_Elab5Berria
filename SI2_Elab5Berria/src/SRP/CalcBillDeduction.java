package SRP;

public class CalcBillDeduction implements CalcBillDeductionInterface {

	public int deductionPercentage;
	
	@Override
	public float CalcBillDeduction(float billAmount) {
		return (billAmount * deductionPercentage) / 100;
	}
}
