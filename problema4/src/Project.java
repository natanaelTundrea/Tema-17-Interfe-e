import java.util.ArrayList;

public abstract class Project implements Risky {
	
	private String titlu, obiectiv;
	private long fonduri;
	private Member manager;
	private ArrayList<Member> members;
	
	//constructors
	public Project(String titlu, String obiectiv, long fonduri, Member manager) {
		this.titlu = titlu;
		this.obiectiv = obiectiv;
		this.fonduri = fonduri;
		this.manager = manager;
		this.members = new ArrayList<Member>();
	}
	
	//getters and setters
	public String getTitlu() {
		return titlu;
	}

	public String getObiectiv() {
		return obiectiv;
	}

	public long getFonduri() {
		return fonduri;
	}

	public Member getManager() {
		return manager;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}
	
	public abstract String toString();

	//methods
	public abstract void addMember(Member newMember);

}
