package edu.training.spring_core_factory_method_di.bean;

public class ATM {
	private Printer printer;

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public void printBalanceInformation(String accountNumber){
		getPrinter().printBalanceInformation(accountNumber);
	}
}
