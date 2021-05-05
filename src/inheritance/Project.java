package inheritance;

public class Project {
    
	private int projectId;
	private int revisionNumber;
	private String projectDepartment;
	private String departmentDirector;
	private String ProjectNumber;
	private String ProjectName;
	private String customerCompanyName;
	
	public Project() {
		
	}
	
	public int getRevisionNumber() {
		return revisionNumber;
	}

	public void setRevisionNumber(int revisionNumber) {
		this.revisionNumber = revisionNumber;
	}

	public String getCustomerCompanyName() {
		return customerCompanyName;
	}

	public void setCustomerCompanyName(String customerCompanyName) {
		this.customerCompanyName = customerCompanyName;
	}
	public int getProjectId() {
		
		return projectId;
	}
	
	public void setProjectId(int projectId ) {
		
		this.projectId = projectId;
		System.out.println("Project ID: " + projectId );
	}

	public String getProjectDepartment() {
		return projectDepartment;
	}

	public void setProjectDepartment(String projectDepartment) {
		this.projectDepartment = projectDepartment;
		System.out.println("Project Department: " + projectDepartment);
	}

	public String getDepartmentDirector() {
		return departmentDirector;
	}

	public void setDepartmentDirector(String departmentDirector) {
		this.departmentDirector = departmentDirector;
		System.out.println("Project Director: " + departmentDirector);
	}

	public String getProjectNumber() {
		return ProjectNumber;
	}

	public void setProjectNumber(String projectNumber) {
		ProjectNumber = projectNumber;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	
	
}
