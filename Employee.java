public class Employee {
    
    private String name;
    private int idNumber;
    private String department;
    private String position;

public Employee(String name, int idNumber, String department, 
    String position){
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
}

public Employee(String name, int idNumber){
    this.name = name;
    this.idNumber = idNumber;
    this.department = "";
    this.position = "";
}

public Employee(){
    this.name = "";
    this.idNumber = 0;
    this.department = "";
    this.position = "";
}

//getter methods
public String getName(){
    return name;
}

public int getIdNumber(){
    return idNumber;
}

public String getDepartment(){
    return department;
}

public String getPosition(){
    return position;
}

//setter methods
public void setName(String name){
    this.name = name;
}

public void setIdNumber(int idNumber){
    this.idNumber = idNumber;
}

public void setDepartment(String department){
    this.department = department;
}

public void setPosition(String position){
    this.position = position;
}

//display method
public void displayInfo(){
    System.out.println(name + "    " + idNumber + "    " + department + "    " + position);
}

}//end of public class
