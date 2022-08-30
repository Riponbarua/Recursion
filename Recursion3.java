//public class Recursion3 {
  //  public static void printPerm(String str,String permutation){
 //       if(str.length()==0){
 //           System.out.println(permutation);
  //          return;
  //      }
  //      for( int i=0; i<str.length();i++){
  //          char currChar=str.charAt(i);
  //          //"abc" ->"ab"
    //        String newStr=str.substring(0,i)+str.substring(i+1);
  // //         printPerm(newStr,permutation+currChar);
  //      }
 //   }
 //   public static void main(String args[]){
   //     String str="abc";
  //      printPerm(str,"");
  //  }

//}
//************************************************************************
 //Qs-Count total paths in a maze to move from (0,0) to (n,n)
//public class Recursion3 {
  //  public static int countPaths(int i,int j,int n,int m) {
   //     if (i == n || j == m) {
   //         return 0;
   //     }
   //     if(i==n-1 && j== m-1){
   //         return 1;
   //     }
        //move downwards
  //      int downPaths = countPaths(i+1,j,n,m);
        //mpve right
  //      int righPaths = countPaths(i, j+1, n, m);
   //     return downPaths+righPaths;
   // }
  //  public static void main (String args[]){
  //      int n=3,m=3;
  //      int totalPaths=countPaths(0 ,0,n,m);
  //      System.out.println(totalPaths);
  //  }
//}
//******************************************************************************
//place Tiles of size 1xm in a floor of size nxm(n=4,m=2)
//public class Recursion3 {
   // public static int pleaseTiles(int n,int m){
   //     if(n==m){
  //  }
 //   if( n<m){
 //       return 1;
 //   }
    //vertically
 //       int vertPlacements = pleaseTiles(n-m,m);
    //horizontally
   //     int horPlacments =pleaseTiles(n-1,m);

   //     return vertPlacements+horPlacments;
//}
//public static void main(String args[]){

  //  int n=3,m=3;
  //  System.out.println(pleaseTiles(n,m));

//}
// }

import java.util.ArrayList;

//*************************************************************
//Find the number of ways in which you can invite n people to your party,single or pairs
//public class Recursion3 {
  //public static int callGuests(int n){
  //    if(n<=1){
  //        return 1;
  //    }
      //single
  //    int way1=callGuests(n-1);
      //pair
   //   int way2 = (n-1)*callGuests(n-2);
   //   return way1+way2;
  //}
 // public static void main(String args[]){
//int n=4;
//System.out.println(callGuests(n));
//  }
//}
//*****************************************************************
//Qs- Print all the subsets of a set of first n natural numbers(n=3)
public class Recursion3 {
    public static void printSubset(ArrayList<Integer>subset){
        for (int i=-0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubsets(int n,ArrayList<Integer>subset){
        if (n==0){
            printSubset(subset);
            return;
        }
        //add
        subset.add(n);
        findSubsets(n-1,subset);
        //not add
        subset.remove(subset.size()-1);
        findSubsets(n-1,subset);
    }
    public static void main (String args[]){
        int n=3;
        ArrayList<Integer>subset =new ArrayList<>();
        findSubsets(n,subset);
    }
}
