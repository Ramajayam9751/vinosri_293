public class Day2 {
        
     public static void main (String args []){

        //celcius to fahrenheit
    
        System.out.println("------------------CELSIUS TO FAHRENHEIT-------------");
        double celcius = 74.3;
        double fahrenheit = (celcius*(9/5))+32;
        System.out.println("Fahrenheit value  "+ fahrenheit);
        




        System.out.println("----------------KILOMETER TO MILES-------------");

        double kilometer=34.6;
        double miles = (kilometer*0.621);
        System.out.println(" Miles value  " + miles);
        




         System.out.println("---------------------MILES TO KILOMETER------------------------");

        double Miles=30.28;
        double kiloMeter=(Miles*1.609);
        System.out.println("Kilometers  value: "+kiloMeter);
        





         //speed,distance,time calculator
       
        

            System.out.println("1.------------------TIME CALCULATOR---------------------");
    
                double Speed = 10;
                double Distance = 20;
                double Time = Distance/Speed;
                System.out.println("Time : "+Time);
                


            System.out.println("2.----------------DISTANCE CALCULATOR-------------------");

                double speed=10;
                double time = 2;
                double distance = speed*time;
                System.out.println("Distance value : "+distance);
    


            
            System.out.println("3.----------------------SPEED CALCULATOR-----------------");
            
                double _Distance = 20;
                double _Time = 2;
                double _Speed = _Distance/_Time;
                System.out.println("Speed : "+Speed);
                

     

        //Salary Calculator

        System.out.println("--------------------------SALARY CALCULATOR--------------------");
       int year = 2027;
        double annual_income=200000;
        double monthly_income=annual_income/12;
        double daily_income,hourly_income;

        if((year%4==0 && year%100!=0)||year%400==0)
        {
            daily_income=annual_income/366;
            hourly_income=annual_income/(366*24);
        }
        else{
           daily_income=annual_income/365;
            hourly_income=annual_income/(365*24);

        }
        System.out.println("Annual Income : "+annual_income);
       System.out.println("Monthly Income : "+monthly_income);
        System.out.println("Daily Income : "+ daily_income);
        System.out.println("Hourly Income : "+ hourly_income);
        


        //simple intrest

        System.out.println("----------------SIMPLE INTEREST-----------------");
        int P=80000;
        double R=7.5;
        int T=12;

        System.out.println("Principle : "+P);
        System.out.println("Rate : "+R);
        System.out.println("Time : "+T);

        double Simple_Interest=P*R*T;
        System.out.println("Simple Interest : "+Simple_Interest);
    


         //Area

        System.out.println("---------------------------AREA------------------------------");
        
        System.out.println("1.Square");
        System.out.println("2.Rectangle");
        System.out.println("3.Circle");
        System.out.println("4.Triangle");
        System.out.println(" ");
        

              System.out.println("1.Square");
    
                int s = 12;
                double square_area=s*s;
                System.out.println("Area of Square : "+square_area);
                

            
             System.out.println("2.Rectangle");

                int l=12,b=3;
                double rectangle_area=l*b;
                System.out.println("Area of Rectangle : "+rectangle_area);
                

            System.out.println("3.Circle");
                double r = 12.67;
                double circle_area=3.14*r*r;
                System.out.println("Area of Circle : "+circle_area);
                

            System.out.println("4.Triangle");
                int height=12,base=12;
                double triangle_area =0.5*base*height;
                System.out.println("Area of Triangle : "+triangle_area);
                

           
        


        //VowelsChecking

    System.out.println("-------------------VOWELS CHECK---------------------");
    char txt='a';
    System.out.println("Letter : "+txt);
    if(txt=='a'||txt=='e'||txt=='i'||txt=='o'||txt=='u'){
        System.out.println("Vowel - Small letter");
        
    }
    else if(txt=='A'||txt=='E'||txt=='I'||txt=='O'||txt=='U'){
        System.out.println("Vowel - Capital letter");
    }


      //Largest of two nums

    System.out.println("---------------------LARGEST OF 2 NUMBER-------------------");
    int a1=10,a2=2;
    if(a1>a2){
        System.out.println("A is Biggest : "+a1);
    }
    else if (a1<a2){
        System.out.println("B is Biggest : "+a2);
    }
    else{
        System.out.println("A is Equal to B");
    }
    


     //Largest of 4 Numbs
   // System.out.println("------------------------LARGEST OF 4 NUMBER------------------");

    //int a1=12,a2=3,a3=1,a4=3;

    //System.out.println("A : "+a1);
    //System.out.println("B : "+a2);
   // System.out.println("C : "+a3);
   // System.out.println("D : "+a4);

   // if(a1==a2 && a2==a3 && a3==a4){
     //   System.out.println("All Values Are Same");
   // }
   // else if (a1>=a2 && a1>=a3 && a1>=a4){
     //   System.out.println("The Biggest Value : "+a1);
    //}
    //else if (a2>=a1 && a2>=a3 && a2>=a4){
      //  System.out.println("The Biggest Value : "+a2);
   // }
    //else if (a3>=a1 && a3>a2 && a3>=a4){
       // System.out.println("The Biggest Value : "+a3);
   // }
   // else{
       // System.out.println("The Biggest Value : "+a4);
   // }
    


    //Grading System
    System.out.println("------------------GRADING SYSTEM---------------");

    int mark=90;
    System.out.println("Marks secured : "+mark);
    if(mark>=90){
        System.out.println("Grade A");
    }
    else if (mark>=80){
        System.out.println("Grade B");
    }
    else if (mark>=70){
        System.out.println("Grade C");
    }
    else if (mark>=50){
        System.out.println("Grade D");

    }
    else{
        System.out.println(" Fail ");
    }

  

        //EB Bill Calculator

   // System.out.println("-----------------------EB BILL CALCULATOR-----------------");
   // int unit_consumed=1200;
   // System.out.println("Units Consumed : "+unit_consumed);
    //if(unit_consumed<=100){
    //    System.out.println("Free");
// }
   // else if(unit_consumed<=200){
  //      System.out.println("2.25 per Unit , Price : "+(unit_consumed*2.25));
  //  }
   // else if(unit_consumed<=400){
   //     System.out.println("4.50 per Unit , Price : "+(unit_consumed*4.50));
  //  }
  //  else if(unit_consumed<=500){
   //     System.out.println("6.00 per Unit , Price : "+(unit_consumed*6));
   // }
   // else{
     //   System.out.println("8.00 per Unit , Price : "+(unit_consumed*8));
   // }



    //if statements

    //Positive,Negative,Zero

    System.out.println("---CHECK +VE,-VE OR 0---");
    int n=12;
    System.out.println("Number : "+n);
    if(n>0){
        System.out.println(n+" - Positive");
    }
    if (n<0) {
        System.out.println(n+" - Negative");
      }
    if(n==0) {
        System.out.println("Zero");
    }


    //Voting Eligibility

    System.out.println("--------------------VOTING ELIGIBILITY------------------");

    int age=20;
    System.out.println("Age  "+age);
    if (age>=18){
        System.out.println("Eligible To Vote");
       } 
    
    if(age<18){
        System.out.println("Not Eligible To Vote");
        
    }

    //marks>90
    System.out.println("-------------------------CHECK MARKS > 90------------------");
    int marks=70;
    System.out.println("Mark : "+marks);
    if(marks>100){
        System.out.println("Marks greater than 70");
        
    }
    if(marks<100){
        System.out.println("Marks less than 70");
        
    }
    if (marks==100){
        System.out.println("Marks equal to 70");
    }



    //salary>50000
    System.out.println("--------------------CHECK SALARY > 50,000-----------------");

    int salary=70000;
    System.out.println("Salary  "+salary);
    if(salary>50000){
        System.out.println("Salary Greater than 50k");
    }
    if(salary<50000){
        System.out.println("Salary less than 50k");
    }
    if (salary == 50000){
        System.out.println("Salary Equal to 50k");
    }



     //temperature > 40C
    System.out.println("-----------------CHECK TEMPERATURE > 50C------------------");
    int temp=87;
    System.out.println("Temperature : "+temp+" C");
    if(temp>50){
        System.out.println("Temperature greater than 50C");
    }
    if(temp<50){
        System.out.println("Temperature less than 50C");
    }
    if(temp==50){
        System.out.println("Temperature Equal to 50C");
    }



    //if....else statements
    System.out.println("----------------------CHECK ODD OR EVEN------------------");
    int num=60;
    System.out.println("Number "+num);
    if(num%2==0){
        System.out.println("Even Number");
    }
    else{
        System.out.println("Odd Number");
    }




    //pass or fail

    System.out.println("--------------------CHECK PASS OR FAIL-------------");
    int Mark=80;
    System.out.println("Marks : "+Mark);
    if(Mark>=35){
        System.out.println("Pass");
    }
    else{
        System.out.println("Fail");
    }

    //max of two nums
    System.out.println("--------------MAX OF TWO NUMBERS----------------");

    int num1=70,num2=84;
    System.out.println("Number 1  "+num1);
    System.out.println("Number 2  "+num2);
    if(num1>num2){
        System.out.println("Number 1 is Maximum");
    }
    else{
        System.out.println("Number 2 is Maximum");
    }



     //Upper or Lower case
    //System.out.println("---------------------CHECK UPPER OR LOWER --------------");
    //char s = 'A';
   // System.out.println("Letter  "+s);
    //if(Character.isUpperCase(s)){
       // System.out.println("Upper case");
  //  }
   // else{
       // System.out.println("Lower Case");
   // }



       //leapyer or not
    System.out.println("----------------CHECK LEAP YEAR---------------");
    int Year=2026;
    System.out.println("Year : "+Year);
    if((Year%4==0 && Year%100!=0)||Year%400==0){
        System.out.println(" Leap Year ");
    }
    else{
        System.out.println("Not a Leap Year");
    }



     //if....else if statements
    //salary-high,medium,low
    System.out.println("-----------CHECK SALARY- HIGH , MEDIUM , LOW--------------");
    int Salary=80000;
    System.out.println("Salary : "+Salary);
    if(Salary>=50000){
        System.out.println(" HIGH ");
    }
    else if (Salary>=30000){
        System.out.println(" MEDIUM ");
    }
    else{
        System.out.println(" LOW ");
    }

    

    //income-Tax
    System.out.println("-----------------------------TAX CRITERIA-------------------");
    int annualIncome=100000;
    System.out.println("Annual income  "+annualIncome);
    if(annualIncome<=400000){
        System.out.println("No Tax");
    }
    else if (annualIncome<=800000){
        System.out.println(" 5% Tax "+(annualIncome*0.05));
    }
    else if (annualIncome<=1200000){
        System.out.println(" 10% Tax "+(annualIncome*(0.10)));
    }
    else if (annualIncome<=1600000){
        System.out.println(" 15% Tax "+(annualIncome*(0.15)));
    }
    else if (annualIncome<=2000000){
        System.out.println(" 20% Tax "+(annualIncome*(0.20)));
    }
    else if (annualIncome<=2400000){
        System.out.println("25% Tax "+(annualIncome*(0.25)));
    }
    else{
        System.out.println(" 30% Tax "+(annualIncome*(0.30)));
    } 

    //ticket price based on age category 

    System.out.println("-------------------------TICKET PRICE-----------------");
    int Age=18;
    System.out.println("Age : "+Age);
    if(Age<=5){
        System.out.println("Free");
    }
    else if (Age<=12){
        System.out.println("Price : 100 ");
    }
    else if (Age<=18){
        System.out.println("Price : 150 ");
    }
    else if (Age<=59){
        System.out.println("Price : 78");
    }
    

    //nested if...else
    //college admission criteria
    System.out.println("---------------------COLLEGE CRITERIA------------------");
    int Student_Age =21;
    int cutoff=125;
    System.out.println("Age  "+Student_Age);
    System.out.println("Marks Secured  "+cutoff);
    if(Student_Age>=21){
        if(cutoff>=125){
            System.out.println("Eligible ");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
    else{
        System.out.println("Not Eligible");
    }


    //loan eligibility
    System.out.println("-------------------LOAN ELIGIBILITY--------------------");
    int income = 30000;
    int credit = 300;

    System.out.println("Salary  "+income);
    System.out.println("Credit Score  "+credit);

    if(income>=30000){
        if(credit<650){
            System.out.println("Not Eligible");
        }
        else if(credit<=749){
            System.out.println("Eligible for Basic Loan ");
        }
        else if(credit<=849){
            System.out.println("Eligible for Standard Loan ");
        }
        else{
            System.out.println("Eligible for Premium Loan ");
        }
    }
    else{
        System.out.println("Not Eligile");
    }

    //Ternary operator 
    //Largest of two nums 
   // System.out.println("------------------------LARGEST OF TWO NUMBERS-----------------");
   // int a=12,b=67;
   // System.out.println("A  "+a);
   // System.out.println("B  "+b);
   // String Check=(a>b)?"A is Greater ":"B is Greatest";
    //System.out.println(Check); 


    //even or odd
   // System.out.println("---EVEN OR ODD---");
   // int A=12;
   // System.out.println("Number : "+A);
   // String CH=(A%2==0)?"Even Number":"Odd Number";
   // System.out.println(CH); 




}
}
        