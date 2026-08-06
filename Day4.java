import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Day4 {
         public static void main(String[]args){

           // System.out.println("--------date---------");
           // Date today = new Date();
           // System.out.println(today);

          //---------------LocalDate-------------->

        //  LocalDate Date=LocalDate.now();

         // System.out.println(Date);
        //System.out.println(Date.getDayOfMonth());
         // System.out.println(Date.getMonth());
         // System.out.println(Date.getYear());
         // System.out.println(Date.plusDays(10));
         // System.out.println(Date.minusDays(7));
        // System.out.println(Date.minusMonths(3));
        // System.out.println(Date.plusMonths(6));
        // System.out.println(Date.getDayOfMonth());
        // System.out.println(Date.getDayOfYear());
        // System.out.println(Date.plusYears(3));
        // System.out.println(Date.minusYears(5));
        // System.out.println(Date.plusWeeks(4));
         //System.out.println(Date.minusWeeks(5));


        //------------- LocalTime--------------->

       // LocalTime Time=LocalTime.now();
       // System.out.println(Time);
       // System.out.println(Time.getHour());
       // System.out.println(Time.getMinute());
      //  System.out.println(Time.plusHours(5));
      //  System.out.println(Time.minusMinutes(9));
      //  System.out.println(Time.minusHours(6));
       // System.out.println(Time.plusMinutes(67));

      
      // LocalDateTime

     // LocalDateTime answer=LocalDateTime.now();
      //System.out.println(answer);


     // DateTimeFormatter
        
    // LocalDateTime answer=LocalDateTime.now();
    // DateTimeFormatter display=DateTimeFormatter.ofPattern("dd/mm/yyyy");
    // DateTimeFormatter display=DateTimeFormatter.ofPattern("MM-DD-YYYY");
    // DateTimeFormatter display=DateTimeFormatter.ofPattern("dd MMM yyyy");
    // DateTimeFormatter display=DateTimeFormatter.ofPattern("EEEE");
    // DateTimeFormatter display=DateTimeFormatter.ofPattern("MMM");
   // DateTimeFormatter display=DateTimeFormatter.ofPattern("HH:MM:SS");
    //DateTimeFormatter display=DateTimeFormatter.ofPattern("hh:mm:ss");
     // System.out.println(answer.format(display));



     //Period

    // LocalDate Start=LocalDate.of(2004, 11, 27);
    // LocalDate end=LocalDate.now();
    // Period answer=Period.between(Start,end);
    // System.out.println(answer.getYears());

    // LocalDate start=LocalDate.of(2009, 12, 19);
    // LocalDate end=LocalDate.now();
    // Period answer=Period.between(start, end);
    // System.out.println(answer.getMonths());


    //Duration

   // LocalTime T1=LocalTime.of(5, 56);
   // LocalTime T2=LocalTime.of(8, 43);
   // Duration answer=Duration.between(T1, T2);
   // System.out.println(answer.toHours());


  // Calendar

  //Calendar cal=Calendar.getInstance();
  //System.out.println(Cal.gettime());
  //System.out.println(cal.get(Calendar.DATE));
  //System.out.println(cal.get(Calendar.MONTH));
  //System.out.println(cal.get(Calendar.YEAR));


//Task
  //Basics questions-------------->
//---------------Display the current date-------------->
     //  Date today=new Date();
     //     System.out.println(today);

    // --------------------Display the current time------------------>
    //   LocalTime Time=LocalTime.now();
    //   System.out.println(Time);

    //-------------------Display the current date and time------------------>
     // LocalDateTime answer=LocalDateTime.now();
     // System.out.println(answer);

   // ------------ Display the current year-------------->
    //  LocalDate Date=LocalDate.now();
    //  System.out.println(Date.getYear());

   //-------------- Display the current month name------------------->
  // LocalDate Date=LocalDate.now();
  // System.out.println(Date.getMonth());
  //System.out.println(Date.getMonthValue());
  

  //Intermediate

  //  LocalDate Date=LocalDate.now();

   // System.out.println(Date.getDayOfWeek());
   // System.out.println(Date.getDayOfMonth());
   // System.out.println(Date.getDayOfYear());
  //  System.out.println(Date.getYear());
  //  System.out.println(Date.getDayOfYear());
   // System.out.println(Date.of(2004, 11, 27));
  // System.out.println(Date.plusDays(6));
   // System.out.println(Date.minusDays(15));
   //System.out.println(Date.plusMonths(6));
   //System.out.println(Date.plusYears(2));

   //---------------------Display only the current hour,minute,and second-------------->
   //LocalTime Time=LocalTime.now();
   //System.out.println(Time);

  // -----------------Format today's date as dd/mm/yyyy--------------------->
  // LocalDateTime answer=LocalDateTime.now();
   //DateTimeFormatter display=DateTimeFormatter.ofPattern("dd/mm/yyyy");
  // DateTimeFormatter display=DateTimeFormatter.ofPattern("dd-mm-yyyy");
   //DateTimeFormatter display=DateTimeFormatter.ofPattern("HH:mm:ss");
  // System.out.println(answer.format(display));
           
        }  
}
