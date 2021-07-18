package pojo;

public class Project {
	int id;
	String title;
	String author;
	String firstname;
	String lastname;
	public Project(int id, String title, String author, String firstname, String lastname) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	Project(){
		
	}
	
	

}
