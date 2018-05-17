package swerProject;

import java.util.ArrayList;

class Adminstrator extends Person {
	private String userName;
	private String password;
	public static ArrayList<String> admin = new ArrayList<String>();
	
	public Adminstrator(String userName, String password) {
		super();
		this.userName = userName;
		
		this.password = password;
		admin.add(userName.concat(password)); 
	}

	public Adminstrator() {
		super();
	 }
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<String> getAdmin() {
		return admin;
	}

	public void setAdmin(String r) {
		admin.add(r);
	}
	
}