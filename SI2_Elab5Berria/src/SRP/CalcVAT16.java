package SRP;

public class CalcVAT16 implements CalcVATInterface {
	
	float VAT = (float) 0.16;

	public float calcVAT(float billAmount) {
		return (float) (billAmount * VAT);
	}
}
