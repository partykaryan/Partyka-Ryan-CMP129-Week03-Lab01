public class DateTest {
    public static void main(String[] args) {
        
        Date date = new Date(12, 25, 2014);
        Date dateTwo = new Date(9, 25, 2026);
   
        date.displayNumeric();
        date.displayMonthFirst();
        date.displayDayFirst();
        System.out.println();
   
        dateTwo.displayNumeric();
        dateTwo.displayMonthFirst();
        dateTwo.displayDayFirst();
        System.out.println();
   
    //testing invalid inputs
    Date invalidDate = new Date(14, 36, 2026);
    
   
    //updating dateTwo with setter methods
    dateTwo.setMonth(10);
    dateTwo.setDay(15);
    dateTwo.setYear(2025);
    
    //retrieving udpated dateTwo data with getter methods
    System.out.println();
    System.out.println("Updated Month for Date Two is " + dateTwo.getMonth());
    System.out.println("Updated Day for Date Two is " + dateTwo.getDay()); 
    System.out.println("Updated Year for Date Two is " + dateTwo.getYear());

    }//end of main method
}//end of public class
