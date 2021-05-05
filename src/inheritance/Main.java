package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Project project = new Project();
		
		GeneratorProject generatorProject1 = new GeneratorProject();
		generatorProject1.setProjectId(100);
		generatorProject1.setCustomerCompanyName("A Company");
		generatorProject1.setProjectName("Çevik");
		generatorProject1.setRevisionNumber(1);
		generatorProject1.setDepartmentDirector("Cansel");
		generatorProject1.setOutputPower("200kW");
		generatorProject1.setGeneratorType("X Type");
		
	    GeneratorProject generatorProject2 = new GeneratorProject();
		generatorProject2.setProjectId(101);
		generatorProject2.setCustomerCompanyName("B Company");
		generatorProject2.setProjectName("Korkmaz");
		generatorProject2.setRevisionNumber(1);
		generatorProject2.setDepartmentDirector("Cansel");
		generatorProject2.setOutputPower("200kW");
		generatorProject2.setGeneratorType("Y Type");
		
		DetectorProject detectorProject1 = new DetectorProject();
		detectorProject1.setProjectId(102);
		detectorProject1.setCustomerCompanyName("C Company");
		detectorProject1.setProjectName("Brave");
		detectorProject1.setRevisionNumber(1);
		detectorProject1.setDepartmentDirector("Nihal");
		detectorProject1.setCountry("Afrika");
		
		
		DetectorProject detectorProject2 = new DetectorProject();
		detectorProject2.setProjectId(102);
		detectorProject2.setCustomerCompanyName("D Company");
		detectorProject2.setProjectName("Strong");
		detectorProject2.setRevisionNumber(1);
		detectorProject2.setCountry("Amerika");
		detectorProject2.setDepartmentDirector("Nihal");

		
		
		Project[] projects = { generatorProject1 , generatorProject2 , detectorProject1 , detectorProject2 };
		
		ProjectManager projectManager = new ProjectManager();
		
		projectManager.addDocuments(projects);
		
		projectManager.confirmDocuments(projects);
		
		projectManager.revisionChange(projects);

}

}