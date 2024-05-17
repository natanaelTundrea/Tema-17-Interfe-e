
public class Comercial extends Project {
	
	private String deadline;
	private int maxMembers = 15, nrEchipe;
	long fonduriMarketing;
	//constructor
	public Comercial(String titlu, String obiectiv, long fonduri, Member manager, String deadline, int nrEchipe) {
		super(titlu, obiectiv, fonduri, manager);
		this.deadline = deadline;
		this.nrEchipe = nrEchipe;
		this.fonduriMarketing = fonduri/2;
	}
	
	//getters and setters
	public String getDeadline() {
		return deadline;
	}

	public int getNrEchipe() {
		return nrEchipe;
	}

	public long getFonduriMarketing() {
		return fonduriMarketing;
	}
	
	public String toString() {
		return getTitlu() + " (" + getObiectiv() + " - $" + getFonduri() + " din care $" + getFonduriMarketing() + " pentru marketing). Manager: " + getManager() + " peste " + getNrEchipe() + " echipe. Deadline: " + getDeadline();
	}

	//methods
	public double getRisky() {
		if(getMembers().size() != 0 && getFonduri() != 0)
			return getNrEchipe()*3/getMembers().size()/(getFonduri() - getFonduriMarketing());
		return 0;
	}

	public void addMember(Member newMember) {
		if(getMembers().size() < maxMembers)
			getMembers().add(newMember);
	}

}
