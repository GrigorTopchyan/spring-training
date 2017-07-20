package edu.training.spring_core.constructor_di.output;

public class OutputHelper {
	OutputGenerator outputGenerator;

	public OutputHelper(OutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
	
	public void genertaeOutput(){
		outputGenerator.generateOutput();
	}
}
