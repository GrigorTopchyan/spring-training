package edu.tarining.spring_core.autowiring_sample.by_constructor;

public class Panda {
	private Kungfu kungfo;
	
	

	public Panda(Kungfu kungfo) {
		System.out.println("Autowiring by constructr...");
		this.kungfo = kungfo;
	}

	public Kungfu getKungfo() {
		return kungfo;
	}

	public void setKungfo(Kungfu kungfo) {
		this.kungfo = kungfo;
	}

	@Override
	public String toString() {
		return "Panda [kungfo=" + kungfo + "]";
	}
}
