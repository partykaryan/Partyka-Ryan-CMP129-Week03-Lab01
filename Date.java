public class Date {

    private int month; 
    private int day;
    private int year;


    //Constructor that accepts month, day and year
    public Date(int month, int day, int year){
    this.month = month;
    this.day = day;
    this.year = year;
    }
    
    public void setMonth(int month){
    //while statement for input validation
    while(month < 1 || month > 12){
        System.out.println("Invalid Input: Please enter a number between 1 & 12");
    }
        this.month = month;
    }//end of setter method for month

    public void setDay(int day){
    //while statement for input validaton
    while(day < 1 || day > 31){
        System.out.println("Ivalid Input: Please enter a number between 1 & 31");     
    }
        this.day = day;
    }//end of setter method for day


    //setter method for year
    public void setYear(int year){
        this.year = year;
    }

//Display methods

//for displaying in format 12/25/2014
public void displayNumeric(){
     System.out.println(month + "/" + day + "/" + year);
}

//for displaying in format December 25,2014
public void displayMonthFirst(){
     System.out.println(month + " " + day + ", " + year);
}

//for displaying in format 25 December 2014
public void displayDayFirst(){
     System.out.println(day + " " + month + year);
}
}//end of public class
