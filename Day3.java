public class Day3 {
    public static void main(String[]args){

 //for loop
    //    System.out.println("print numbers 100 to 1");

    //    for(int g=1;g<=100;g++)
    //        {
    //        System.out.print(g + " ");
    //    }
    //    System.out.println();

//while loop
    //   System.out.println("numbers 100 to 1 while loop");
        
//    int g=1;
//    while(g<=100);
//    {
//        System.out.print(g +" ");
//        g++;
//    }
 //  System.out.println();


//   System.out.println("all even numbers 1 to 100");

//    int g=1;
//    while(g<=100){
//        if(g % 2== 0){
//            System.out.print(g);
//        }
//        g++;
// }
     

// System.out.print("all odd numbers 1 to 100 ");

//    int g=1;
//    while(g<=100){
//    if (g % 2!=0){
 //      System.out.print(g);
//    }
//    g++;
 //  }
    


// System.out.println("---Sum Of N Natural Number Using Do While Loop---");

//        int N1 = 100;
//        System.out.println("Number : "+N1);
//      int A1=1,A2=0; 
//        do{
//            A2+=A1;
//            A1++;
 //       }
//        while(A1<=N1);
//        System.out.println("Answer : "+A1);
//        System.out.println();

  //  System.out.println("----------factorial number------------");

   // int fact=1;
   // for(int g=1; g<=10; g++){
   //     fact*=g;
   //     System.out.println("step by-"+fact);
   // }
    // System.out.println("Answer - "+ fact );


    //    System.out.println("---------------reverse number-----------");
        
        //   int p=20;
          // for(int p=20; p>=1; p--) {
          //    for(int k=1; k<=20; k++);
         //   System.out.print(p + " ");
         //  }
           

     // System.out.println("--------------palindrome number--------------");
    //      int a = 1331;
    //    int original = a;
    //    int reverse = 0;

     //   for (; a > 0; a = a / 10) {
     //       int digit = a % 10;
     //       reverse = reverse * 10 + digit;
     //   }

     //   if (original == reverse) {
    //        System.out.println(original + " is a Palindrome");
     //   } else {
     //       System.out.println(original + " is Not a Palindrome");
     //   }


     // System.out.println("count the number digits given integer");
    //      int a = 1234567;
    //    int count = 0;

    //    for (; a > 0; a = a / 10) {
    //        count++;
    //    }
    //    System.out.println("Number of digits = " + count);

  

    // System.out.println("sum of the digits of a given number. ") 
    //    int num = 1234;
    //    int sum = 0;
           
    // for (; num > 0; num = num / 10) {
    //        int digit = num % 10;
    //        sum = sum + digit;
    //    }
     //    System.out.println("Sum of digits = " + sum);


   //  System.out.println("-----------multiple table------------");
   // int num = 7;

   //     for (int i = 1; i <= 10; i++) {
   //         System.out.println(num + " x " + i + " = " + (num * i));
    //    }


    //System.out.println("------------- Fibonacci series up to N terms.---------");

    //   int n=10;
    //   int a=0, b=1;
    //   System.out.print("fibonacii series");

    //   for(int i=1; i<=n; i++);{
    //   // System.out.println(a +" ");
    //
       
     
   // System.out.println("----------prime number-------------");

     // int num = 16;
     //   int count = 0;

     //   for (int i = 1; i <= num; i++) {
      //      if (num % i == 0) {
     //           count++;
     //       }
     //   }

      //  if (count == 2) {
          //  System.out.println(num + " is a Prime Number");
            
      //  }



     System.out.println("---------------all prime numbers-------------");
       for (int num = 2; num <= 100; num++) {
            int count = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(num + " ");
            }
        }


}



    }
