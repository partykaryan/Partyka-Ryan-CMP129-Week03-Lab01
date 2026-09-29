public class Date {

    private int month; 
    private int day;
    private int year;


    //Constructor that accepts month, day and year
    public Date(int month, int day, int year){
    setMonth(month); 
    setDay(day);
    setYear(year);
    }
    
    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }
 
    public int getYear(){
        return year;
    }

    public void setMonth(int month){
    //while statement for input validation
    while(month < 1 || month > 12){
        System.out.println("Invalid Input: Please enter a number between 1 & 12 for Month");
        month = 1;

    }
        this.month = month;
    }//end of setter method for month

    public void setDay(int day){
    //while statement for input validaton
    while(day < 1 || day > 31){
        System.out.println("Ivalid Input: Please enter a number between 1 & 31 for Day");    
        day = 1;
    }
        this.day = day;
    }//end of setter method for day


    //setter method for year
    public void setYear(int year){
        this.year = year;
    }

//Converting to month name using array    
private String convertMonthName() {
String [] monthNames = { "January" , "February" , "March" , "April" , "May" , 
"June" , "July" , "August" , "September" , "October" , "November" , "December"
};
 return monthNames[month-1];
}

//Display methods

//for displaying in format 12/25/2014
public void displayNumeric(){
     System.out.println(month + "/" + day + "/" + year);
}

//for displaying in format December 25,2014
public void displayMonthFirst(){
     System.out.println(convertMonthName() + " " + day + ", " + year);
}

//for displaying in format 25 December 2014
public void displayDayFirst(){
     System.out.println(day + " " + convertMonthName() + " " + year);
}
}//end of public class
