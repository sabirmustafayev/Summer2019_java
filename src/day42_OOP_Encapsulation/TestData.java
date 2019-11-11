package day42_OOP_Encapsulation;

public class TestData {
	/*
	 Name
	 ID
	 */
	public String Name = "Bekir";
	
	private String LastName = "Cakir"; //the data is invisibale to any other classes
	private int ID = 897;
	
	//getter:   Read the data
	public String getName() { //read the private data only
		return Name;
	}
	
	public int getID() {
		return ID;
	}
	
	//setter:    Modify the data
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}

}
