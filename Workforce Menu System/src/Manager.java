class Manager { //COMPLETED

   // attributes
   private String managerFirstName;
   private String managerLastName;
   private String managerFullName = managerFirstName + " " + managerLastName;
   private int branchID;
   
   // methods
   // default + parameterized constructors
   
   public Manager() {
      managerFirstName = "";
      managerLastName = "";
      managerFullName = managerFirstName + " " + managerLastName;
      branchID = 9999;
   }
   
   public Manager(String firstName, String lastName, int id) {
      managerFirstName = firstName;
      managerLastName = lastName;
      managerFullName = firstName + " " + lastName;
      branchID = id;
   }
   
   
   // getter and setter methods
   public String getManagerFirstName() {
		return managerFirstName;
	}
   
   public void setManagerFirstName(String name) {
		managerFirstName = name;
	}
   
   
   public String getManagerLastName() {
		return managerLastName;
	}
   
   public void setManagerLastName(String name) {
		managerLastName = name;
	}
   
   
   public String getManagerFullName() {
		return managerFullName;
	}
   
   public void setManagerFullName(String name) {
		managerFullName = name;
	}
   
   
   public int getBranchID() {
		return branchID;
	}
   
   public void setBranchID(int id) {
		branchID = id;
	}
}