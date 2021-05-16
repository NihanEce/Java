package kodlamaIO;

public class Instructor extends User {
	private String givenCourse;
	private String experiance;
	
	public Instructor() {
		
	}

	public Instructor(String givenCourse, String experiance) {
		this.givenCourse=givenCourse;
		this.experiance=experiance;
	}

	public String getgivenCourse() {
		return givenCourse;
	}

	public void setgivenCourse(String givenCourse) {
		this.givenCourse = givenCourse;
	}

	public String getExperiance() {
		return experiance;
	}

	public void setExperiance(String experiance) {
		this.experiance = experiance;
	}
	
	
}
