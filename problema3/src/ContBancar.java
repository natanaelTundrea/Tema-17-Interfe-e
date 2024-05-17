
public abstract class ContBancar implements SumaTotala {
	private String numarCont;
	private float suma;
	
	//constructor
	public ContBancar(String numarCont, float suma) {
		this.numarCont = numarCont;
		this.suma = suma;
	}
	
	//getters and setters
	public float getSuma() {
		return suma;
	}

	private void setSuma(float suma) {
		this.suma = suma;
	}

	public String getNumarCont() {
		return numarCont;
	}
	
	//methods
	public void addSuma(float suma) {
		setSuma(this.suma + suma);
	}
	
	public void subtractSuma(float suma) {
		setSuma(this.suma - suma);
	}
	
	public abstract String getType();
}
