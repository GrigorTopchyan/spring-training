package edu.training.spring_core_factory_method_di.bean;

public class PrinterFactory {
	public static Printer createPrinter(String type){
		if(type.equals("simple")){
			return new Printer(); 
		}
		else 
			throw new RuntimeException("there is no printer with the " + type + " type");
	}
}
