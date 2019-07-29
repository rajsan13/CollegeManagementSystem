package CollegeManagementProject.src.training.project;


import java.util.HashMap;

public class Admin {
	
	static HashMap<String ,String >  map = new HashMap<String,String>();
		public void addAdmin() {
			map.put("Udit", "Password");
		}
	
		
	
	public boolean authenticate(String name,String pass) {
		if(map.containsKey(name)&&map.containsValue(pass)) {
			return true;
		}else {
			return false;
		}
	}

	
		
	}
	

