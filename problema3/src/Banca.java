import java.util.ArrayList;

public class Banca {
	
	private ArrayList<Client> clienti;
	public Banca() {
		this.clienti = new ArrayList<Client>();
	}
	//getters and setters
	public Client getClient(String nume) {
		boolean found = false;
		for(Client client : clienti) {
			if(nume.equals(client.getNume())) {
				return client;
			}
		}
		System.out.println("Nu exista acest client");
		return null;
	}
	
	//methods
	public void add(Client newCLient) {
		for(Client client : clienti) {
			if(newCLient.getNume().equals(client.getNume())) {
				System.out.println("Acest client deja exista");
				break;
			}
		}
		clienti.add(newCLient);
	}
	
	public void afisareClient(String nume) {
		boolean found = false;
		for(Client client : clienti) {
			if(nume.equals(client.getNume())) {
				System.out.println(client.toString());
				found = true;
				break;
			}
		}
		
		if(!found)
			System.out.println("Nu exista acest client");
	}
}
