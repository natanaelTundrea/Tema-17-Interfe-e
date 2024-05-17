
public class Main {

	public static void main(String[] args) {
		Banca BT = new Banca();
		
		ContBancar cl1 = new ContBancarLEI("1XEconomi", 23000F);
		ContBancar cl2 = new ContBancarLEI("1XConsum", 290F);
		Client c1 = new Client("Dani" , "Strada Mosilor", cl1);
		BT.add(c1);
		c1.addContBancar(cl2);
		
		ContBancar cl3 = new ContBancarEURO("2EEconomi", 1000F);
		ContBancar cl4 = new ContBancarLEI("2XConsum", 100F);
		Client c2 = new Client("Andrei" , "Strada Mosilor", cl3);
		BT.add(c2);
		c2.addContBancar(cl4);
		
		((ContBancarLEI) c1.getContBancar("1XConsum")).transfer(c2.getContBancar("2XConsum"), 90);
		BT.afisareClient("Dani");
		BT.afisareClient("Andrei");
	}

}
