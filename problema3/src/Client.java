import java.util.ArrayList;
public class Client {
	private String nume, adresa;
	private int maxNrConturi = 5;
	ArrayList<ContBancar> conturiBancare;
	
	//constructor
	public Client(String nume, String adresa, ContBancar primulContBancar) {
		this.nume = nume;
		this.adresa = adresa;
		conturiBancare = new ArrayList<ContBancar>();
		conturiBancare.add(primulContBancar);
	}
	
	//getters and setters
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAddresa(String adresa) {
		this.adresa = adresa;
	}
	
	public ContBancar getContBancar(String numarCont) {
		for(ContBancar contBancar : conturiBancare) {
			if(numarCont.equals(contBancar.getNumarCont()))
				return contBancar;
			}
		System.out.println("Nu s-a gasit contul bancar " + numarCont);
		return new ContBancarLEI("0", 0);
	}
	
	//methods
	public void addContBancar(ContBancar newContBancar) {
		if(conturiBancare.size() <= maxNrConturi)
			conturiBancare.add(newContBancar);
	}
	
	public void deleteContBancar(ContBancar oldContBancar) {
		conturiBancare.remove(oldContBancar);
	}
	
	//methods afisare
	public String toString() {
		String output = getNume() + " (" + getAdresa() + "):\n";
		for(ContBancar contBancar : conturiBancare) {
			output += "\t" + contBancar.getNumarCont() + "(" + contBancar.getType() + "): " + contBancar.getSuma() + " " + contBancar.getType() + "\n";
		}
		return output;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
}
