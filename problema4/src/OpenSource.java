
public class OpenSource extends Project {

	String mailingList;
	
	//constructor
	public OpenSource(String titlu, String obiectiv, long fonduri, Member manager, String mailingList) {
		super(titlu, obiectiv, fonduri, manager);
		this.mailingList = mailingList;
	}

	//getters
	public String getMailingList() {
		return mailingList;
	}
	
	public String toString() {
		return getTitlu() + " (" + getObiectiv() + " - $" + getFonduri() + "). Manager: " + getManager() + ". MailingList: " + getMailingList();
	}
	
	//methods
	public double getRisky() {
		// TODO Auto-generated method stub
		return getMembers().size()/getFonduri();
	}

	public void addMember(Member newMember) {
		getMembers().add(newMember);
	}

}
