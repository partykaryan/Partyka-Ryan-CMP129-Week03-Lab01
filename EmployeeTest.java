public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee employeeTwo = new Employee("Mark Jones", 39119);
        Employee employeeThree = new Employee();

        employeeTwo.setDepartment("      IT");
        employeeTwo.setPosition("     Programmer");

        employeeThree.setName("Joy Rogers");
        employeeThree.setIdNumber(81774);
        employeeThree.setDepartment("Manufacturing");
        employeeThree.setPosition("Engineer");
   
        System.out.println("------------------------------------------------");
        System.out.println("Name         ID Number    Department    Position");
        System.out.println("------------------------------------------------");
        employee.displayInfo();
        employeeTwo.displayInfo();
        employeeThree.displayInfo();
        System.out.println("------------------------------------------------");
   

}//end of main method
}//end of public class
