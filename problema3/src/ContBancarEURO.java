
public class ContBancarEURO extends ContBancar {

	public static final String TYPE = "EURO";
	private float dobanda = 0.3F, limitaDobanda = 500F, rataSchimbValutarEuroLei = 36000F;
	
	//constructor
	public ContBancarEURO(String numarCont, float suma) {
		super(numarCont, suma);
		// TODO Auto-generated constructor stub
	}

	//getters and setters
	public float getDobanda() {
		if(getSumaTotala()<=limitaDobanda)
			return 0;
		else
			return dobanda;
	}
	
	public float getSumaTotala() {
		return this.getSuma()*rataSchimbValutarEuroLei;
	}
	
	//methods
	public String getType() {
		return ContBancarEURO.TYPE;
	}
}
