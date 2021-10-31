package SRP;

public class CalcVAT21 implements CalcVATInterface {

	float VAT = (float) 0.21;

	public float calcVAT(float billAmount) {
		return (float) (billAmount * VAT);
	}
}
