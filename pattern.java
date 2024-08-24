import java.util.Scanner;
public class Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);



//   Que1.   practice Class

//       * * * * *
//       * * * *
//       * * *
//       * *
//       *

        // System.out.print("enter the number :");
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }




// Que2.      Practice  Class

//      1
//      1 2
//      1 2 3
//      1 2 3 4
//      1 2 3 4 5

//     System.out.print("enter the number :");
//     int n = sc.nextInt();
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=i; j++){
//             System.out.print(j + " ");
//     }
//     System.out.println();
// }



// Que3.Character Pattern   Practice  Class

//      A
//      B C
//      D E F
//      G H I J
//      K L M N O

    // System.out.print("enter the number :");
    // int n = sc.nextInt();
    // char ch = 'A';
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print(ch + " ");
    //         ch++;
    //     }
    //     System.out.println();
    // }




//   Q1. ractangle pattern

//     *****
//     *   *
//     *   *
//     *****

        // int n = 4;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n+1; j++){
        //         if(i==1 || j==1 || i==4 || j==n+1){
        //         System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }




//  Q2.   HALF-PYRAMID pattern

//     *****
//     ****
//     ***
//     **
//     *


        // int n=5;
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



//Q3.   INVERTED & ROTATED HALF-PYRAMID pattern

//        *
//       **
//      ***
//     ****
//    *****

    // int n=5;
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=n-i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=1; k<=i; k++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //     }



// Reverse of Q3.

//     *****
//      ****
//       ***
//        **
//         *

    // int n=5;
    // for(int i=n; i>=1; i--){
    //     for(int j=1; j<=n-i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=1; k<=i; k++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //     }



// Q4.  print the Number pattern

//      1
//      2 3
//      4 5 6
//      7 8 9 10
//     11 12 13 14 15


    // int n=5;
    // int number = 1;
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print(number+" ");
    //         number++;
    //     }
    //     System.out.println();
    // }



        
//     Q5.

//     12345
//      1234
//       123
//        12
//         1

    // int n=5;
    // for(int i=n; i>=1; i--){
    //     for(int j=1; j<=n-i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=1; k<=i; k++){
    //         System.out.print(k);
    //     }
    //     System.out.println();
    //     }
    




// Q6.    print the 1 and 0 pattern

//    1
//    0 1
//    1 0 1
//    0 1 0 1
//    1 0 1 0 1

    // int n=5;
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=i; j++){
    //         if((i+j)%2==0){
    //             System.out.print("1 ");
    //         }else{
    //             System.out.print("0 ");
    //         }
    //     }
    //     System.out.println();
    // }




// Q7.

//       *        *
//       **      **
//       ***    ***
//       ****  ****
//       **********
//       **********
//       ****  ****
//       ***    ***
//       **      **
//       *        *

        // int n=5;
        
        // //uper half
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     //space
        //     for(int k=1; k<=2*(n-i); k++){
        //         System.out.print(" ");
        //     }
        //     //2nd part of uper half
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // //lower half
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     //space
        //     for(int k=1; k<=2*(n-i); k++){
        //         System.out.print(" ");
        //     }
        //     //2nd part of lower half
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }




//  Q8.  solid Rhombus

//       *****
//      *****
//     *****
//    *****
//   *****

    // int n=5;
    // for(int i=1; i<=n; i++){
    //     // space
    //     for(int j=1; j<=n-i; j++){
    //         System.out.print(" ");
    //     }
    //     //  star
    //     for(int j=1; j<=n; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }




// Q9.

//        *
//       ***
//      *****
//     *******

        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }



        sc.close();
    }
}
