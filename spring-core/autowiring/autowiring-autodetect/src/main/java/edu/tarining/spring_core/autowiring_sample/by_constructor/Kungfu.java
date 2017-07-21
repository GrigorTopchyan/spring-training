package edu.tarining.spring_core.autowiring_sample.by_constructor;

public class Kungfu {
	private String name;

	public Kungfu(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Kungfu [name=" + name + "]";
	}
}
