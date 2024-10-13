package POJONew;

public class createUserPojo2 {
	
//	public createUserPojo2() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	private String name ;
	private String job ;
	
	
	public createUserPojo2() { }
	

	public createUserPojo2(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}
