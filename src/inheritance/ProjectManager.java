package inheritance;

public class ProjectManager {

	
	public void revisionChange(Project[] projects) {
		
		for (Project project : projects) {
			
			System.out.println(project.getProjectName() + " is changed revision number. New revision number: " + project.getRevisionNumber()+1);
		}
		
		
	}
	
	public void addDocuments(Project[] projects) {
		
          for (Project project : projects) {

      		System.out.println(project.getProjectName() + " project documentatation is perapered.");
			
		}
			
	}
	
	public void confirmDocuments(Project[] projects) {
		
		for (Project project : projects) {
               

			System.out.println(project.getProjectName() +  " project documentation is confirmed by " + project.getDepartmentDirector());
			
		}
		
	}
}
