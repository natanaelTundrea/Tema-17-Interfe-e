public class Militar extends Project {
	
	private String deadline, parola;
	private int maxMembers = 15;
	
	//constructor
	public Militar(String titlu, String obiectiv, long fonduri, Member manager, String deadline, String parola) {
		super(titlu, obiectiv, fonduri, manager);
		this.deadline = deadline;
		this.parola = parola;
	}

	//getters and setters
	public String getDeadline() {
		return deadline;
	}

	public String getParola() {
		return parola;
	}
	
	public String toString() {
		return getTitlu() + " (" + getObiectiv() + " - $" + getFonduri() + "). Manager: " + getManager() + ". Deadline: " + getDeadline() + ". Parola: ***" + getParola() + "***";
	}
	
	//methods
	public double getRisky() {
		if(getMembers().size() == 0 || getFonduri() == 0)
			return 0;
		if(getParola().length() == 0)
			return getMembers().size()/getFonduri();
		return getMembers().size()/getParola().length()/getFonduri();
	}

	public void addMember(Member newMember) {
		if(getMembers().size() < maxMembers)
			getMembers().add(newMember);
	}

}
