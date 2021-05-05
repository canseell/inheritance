package inheritance;

public class GeneratorProject extends Project{
   
	
	private String generatorType;
	private String maximumAmper;
	private String material;
	private String outputPower;
	
	public GeneratorProject() {
		
	}
	
	public String getOutputPower() {
		return outputPower;
	}
	
	public void setOutputPower(String outputPower) {
		this.outputPower = outputPower;
		System.out.println( "Output Power: " +  outputPower);
	}
	
	public String getGeneratorType() {
		return generatorType;
	}
	
	public void setGeneratorType(String generatorType) {
		this.generatorType = generatorType;
		System.out.println( "Generator Tye: " +  generatorType);
	}
	
	public String getMaximumAmper() {
		return maximumAmper;
	}
	
	public void setMaximumAmper(String maximumAmper) {
		this.maximumAmper = maximumAmper;
		System.out.println( "Maximum Amper: " +  maximumAmper);
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
		Project project = new Project();
		System.out.println(project.getProjectName() + "is made from material of " +  material);
	}
	

}
