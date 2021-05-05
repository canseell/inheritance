package inheritance;

public class DetectorProject extends Project {
	
	

	private String materialColor;
	private String country;


	public String getMaterialColor() {
		return materialColor;
	}
	
	public void setMaterialColor(String materialColor) {
		this.materialColor = materialColor;
		System.out.println( "Material Color: " + getMaterialColor());
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
		System.out.println( "Countr: " +  getCountry());
	}
	
	
	

}
