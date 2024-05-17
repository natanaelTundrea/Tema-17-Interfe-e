
public class ContBancarLEI extends ContBancar {

	public static final String TYPE = "LEI";
	public ContBancarLEI(String numarCont, float suma) {
		super(numarCont, suma);
		// TODO Auto-generated constructor stub
	}

	//getters and setters
	public float getSumaTotala() {
		return this.getSuma();
	}
	
	//methods
	public void transfer(ContBancar contDestinatie, float suma) {
		if(contDestinatie instanceof ContBancarLEI)
			if(this.getSuma()<=suma)
				System.out.println("Founduri insuficiente");
			else {
				this.subtractSuma(suma);
				((ContBancarLEI) contDestinatie).receive(this, suma);
			}
		else
			System.out.println("Nu se paote efectua transfer dintr-un alt cont decat de LEI");
	}
	
	public void receive(ContBancar contExpeditor, float suma) {
		this.addSuma(suma);
	}
	
	public String getType() {
		return ContBancarLEI.TYPE;
	}

}
