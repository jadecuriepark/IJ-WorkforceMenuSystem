class Branch { // FINISHED

   // attributes
   private String locationName;
   private int branchID;
   private String address;
   Manager manager;
   Employee[] team;
   
   
   // default constructor
   public Branch() {
      locationName = "";
      branchID = 0;
      address = "";
      manager = null;
      Employee[] team = new Employee[3];
   }
   
   // parameterized constructor
   public Branch(String locationName, int branchID, String address, Manager manager, Employee[] team) {
      this.locationName = locationName;
      this.branchID = branchID;
      this.address = address;
      this.manager = manager;
      this.team = team;
   }
   
   // getter and setter methods for the attributes
   
   public String getLocationName() {
		return locationName;
	}
   
   public void setLocationName(String name) {
		locationName = name;
	}
   
   
   public int getBranchID() {
		return branchID;
	}
   
   public void setBranchID(int id) {
		branchID = id;
	}
   
   
   public String getAddress() {
		return address;
	}
   
   public void setAddress(String address) {
		this.address = address;
	}
   
   
   public Manager getManager() {
		return manager;
	}
   
   public void setManager(Manager manager) {
		this.manager = manager;
	}
   
   
   public Employee[] getTeam() {
		return team;
	}
   
   
   // addToTeam method that takes in an Employee object and adds it to the Team array
   public void addToTeam(Employee employee) {    
      Employee[] duplicateTeam = new Employee[4];
      for (int i = 0; i < 3; i++) {
         duplicateTeam[i] = team[i];
      }
      duplicateTeam[4] = employee;
   }

   // removeFromTeam method that removes the Employee object from the Team
   public void removeFromTeam(Employee employee) {
      Employee[] duplicateTeam = new Employee[2];
      for (int i = 0; i < 3; i++) {
         for (int j = 0; i < 3; i++) {
            duplicateTeam[j++] = team[i];
         }
      }
      team = duplicateTeam;
   }
   
   // displayBranchInfo method to display the supervisor and team information, as well as the number of employees on the team
   
   public void displayBranchInfo(Employee[] array, Manager manager) { 
         
      String str = "";
      str += "\nManager's First Name: " + manager.getManagerFirstName();
      str += "\nManager's Last Name: " + manager.getManagerLastName();
      str += "\nManager's Full Name: " + manager.getManagerFullName();
      str += "\nNumber of Employees: " + array.length;
      for (int i = 0; i < 3; i++) {
         
      }
      
      for (int i = 0; i < 3; i++) {
         if (team[i].toString().equals(null)) {
            System.out.println("No Employee Here!");
         } else {
            System.out.println(team[i].toString());
         }
      }
   }
}