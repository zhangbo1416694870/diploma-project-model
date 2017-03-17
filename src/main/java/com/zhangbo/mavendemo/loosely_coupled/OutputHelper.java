package com.zhangbo.mavendemo.loosely_coupled;

public class OutputHelper {
	
	IOutputGenerator outputGenerator;
	
	public void generateOutput(){
		this.outputGenerator.generatorOutput();
	}
	
	public void setOutputGenerator(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
}
