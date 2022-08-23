//public class Recursion1 {
//    public static void printNumber(int n){
 //       if(n ==0){
 //           return;
  //      }
  //      System.out.println(n);
  //      printNumber(n-1);
  //  }
 //   public static void main(String[] args) {
 //      int n=5;
 //      printNumber(n);//n=5
 //   }
//}
//**********************************************************
//public class Recursion1 {
 //   public static void printNumber(int n){
 //       if(n == 6){
 //           return;
 //       }
  //      System.out.println(n);
  //      printNumber(n+1);
 //   }
  //  public static void main(String[] args) {
 //       int n=1;
 //       printNumber(n);//n=5
 //   }
//}
//***********************************************************************

//Qs print sum of first natural numbers

//public class Recursion1 {
   // public static void printSum(int i,int n,int sum){
     //  if(i==n){
     //      sum+=i;
    //       System.out.println(sum);
    //       return;
    //   }
    //   sum+=i;
    //   printSum(i+1,n,sum);
  //  }
  //  public static void main(String[] args) {
  //      printSum(1,5,0);
 //   }
//}
//***********************************************************
//public class Recursion1 {
   // public static void printSum(int i,int n,int sum){
    //    if(i==n){
    //        sum+=i;
    //        System.out.println(sum);
    //        return;
  //      }
  //      sum+=i;
   //     printSum(i+1,n,sum);
   //     System.out.println(i);
   // }
   // public static void main(String[] args) {
   //     printSum(1,5,0);
   // }
//}
//*****************************************************************
//print factorial of number n
//public class Recursion1 {
   // public static int calcfactorial (int n){
     //   if (n==1 || n==0){
     //       return 1;
     //   }
      //  int fact_nm1=calcfactorial(n-1);
     //   int fact_n=n*fact_nm1;
     //  return fact_n;

   // }
    //public static void main(String[] args){
     //   int n =5;
    //    int ans = calc factorial(n);
    //    System.out.println(ans);
   // }
//}
//****************************************************************
//print the fibonacci sequence till nth term

  // public class Recursion1 {
  //  public static void printFib(int a,int b,int n){
   //     if(n==0){
    //        return;
    //    }
    //    int c= a+b;
    //    System.out.println(c);
    //    printFib(b,c,n-1);
   // }
  //  public static void main(String args[]){
    //    int a=0,b=1;
    //    System.out.println(a);
    //    System.out.println(b);
    //    int n=7;
   //     printFib(a,b,n-2);
   // }
   //}
//***************************************************************
//QS- print x^n(stack hight=n)

  //public class Recursion1 {
     // public static int calcPower(int x,int n){
        //  if (n == 0) {//base case 1
        //      return 1;
        //  }
         // if (x == 0) {//base case 2
         //     return 0;

        //  }
        //  int xPownm1 = calcPower(x,n-1);
        //  int xPown=x * xPownm1;
       //   return xPown;
     // }
     // public static void main(String args[]){
     //    int x = 2,n=5;
     //    int ans = calcPower(x,n);
     //    System.out.println(ans);
   //   }
  //}
//**********************************************************************

        public class Recursion1 {
 public static int calcPower(int x,int n) {
     if (n == 0) {//base case 1
         return 1;
     }
     if (x == 0) {//base case 2
         return 0;

     }

//if n is even
     if (n % 2 == 0) {
         return calcPower(x, n / 2) * calcPower(x, n / 2);
     } else {//n is odd
         return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
     }
 }
 public static void main(String args[]){
    int x = 2,n=5;
   int ans = calcPower(x,n);
   System.out.println(ans);
  }
}




