import java.util.ArrayList;
public class InvestmentCompany {
	private ArrayList<Project> projects;
	
	//constructor
	public InvestmentCompany() {
		this.projects = new ArrayList<Project>();
	}
	
	public InvestmentCompany(ArrayList<Project> projects) {
		this.projects = projects;
	}
	
	//methods
	public void addProject(Project newProject) {
		projects.add(newProject);
	}
	
	public Project getBestInvestment() {
		Project leastRisky = projects.get(0);
		for(Project project: projects) {
			if(leastRisky.getRisky() > project.getRisky())
				leastRisky = project;
		}
		return leastRisky;
	}
	
	public String listProjects() {
		String output = "Proiectele disponibile sunt:";
		for(Project project : projects) {
			output += "\n>>> " + project.toString();
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Project> aFewProjects = new ArrayList<Project>();
		aFewProjects.add(new Militar("F-16", "procesoare", 200000L, new Member("Jack", 34), "16 August", "jdoe423joNO@o2neo@"));
		aFewProjects.add(new Comercial("Google", "GemimiAI", 10000000L, new Member("Daniel", 21), "18 Noiembrie", 2));
		aFewProjects.add(new OpenSource("kalilinux", "perfectionare", 14000L, new Member("Joe", 50), "mailinglist"));
		
		InvestmentCompany a = new InvestmentCompany(aFewProjects);
		
		System.out.println(a.listProjects());
		System.out.println("--dintre care cel mai sigur este: ");
		System.out.println(a.getBestInvestment().toString());
	}

}
