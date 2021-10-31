package SRP;

public class CalcVAT18 implements CalcVATInterface {

	float VAT = (float) 0.18;

	public float calcVAT(float billAmount) {
		return (float) (billAmount * VAT);
	}
}
