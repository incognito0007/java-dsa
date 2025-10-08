package Patterns;

/*
Print a pattern of asterisks in the shape mentioned below:

1. Rectangle Pattern
*****
*****
*****
*****
*****

2. Right-Angled Triangle Pattern
*
**
***
****
*****

3. Inverted Right-Angled Triangle Pattern
*****
****
***
**
*

4. Pyramid Pattern
    *
   ***
  *****
 *******

5. Inverted Pyramid Pattern
 *******
  *****
   ***
    *

6.
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

7.
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

8.
    *
   **
  ***
 ****
*****

9.
*****
 ****
  ***
   **
    *

10. Diamond Pattern
    *
   * *
  * * *
 * * * *
* * * * *

11.
* * * * *
 * * * *
  * * *
   * *
    *

12.
* * * * *
 * * * *
  * * *
   * *
    *
    *
   * *
  * * *
 * * * *
* * * * *

13.      *
        * *
       *   *
      *     *
     *********

14.  *********
      *     *
       *   *
        * *
         *

15.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *

16.           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1

*/

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Pattern 1:");
        pattern1(n);
        System.out.println("Pattern 2:");
        pattern2(n);
        System.out.println("Pattern 3:");
        pattern3(n);
        System.out.println("Pattern 4:");
        pattern4(n);
        System.out.println("Pattern 5:");
        pattern5(n);
        System.out.println("Pattern 6:");
        pattern6(n);
        System.out.println("Pattern 7:");
        pattern7(n);
        System.out.println("Pattern 8:");
        pattern8(n);
        System.out.println("Pattern 9:");
        pattern9(n);
        System.out.println("Pattern 10:");
        pattern10(n);
        System.out.println("Pattern 11:");
        pattern11(n);
        System.out.println("Pattern 12:");
        pattern12(n);
        System.out.println("Pattern 13:");
        pattern13(n);
        System.out.println("Pattern 14:");
        pattern14(n);
        System.out.println("Pattern 15:");
        pattern15(n);
        System.out.println("Pattern 16:");
        pattern16(n);
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for(int k = 1; k <= (2*i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for(int k = (2*n - 1); k >= (2*i - 1); k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for(int i = 1; i <= n; i++) {
            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for(int i = 1; i <= n; i++) {
            for(int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        pattern11(n);
        pattern10(n);
    }

    static void pattern13(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            if(i == 1) {
                System.out.println("*");
            } else if(i == n) {
                for(int k = 1; k <= (2*i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            } else{
                System.out.print("*");
                for(int l = 1; l <= (2*i - 3); l++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }

    static void pattern14(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            if(i == n) {
                System.out.println("*");
            } else if(i == 1) {
                for(int k = 1; k <= (2*n - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            } else{
                System.out.print("*");
                for(int l = 2*n - 3; l >= 2*i - 1; l--) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }

    static void pattern15(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }
            if(i == 1) {
                System.out.println("*");
            } else{
                System.out.print("*");
                for(int k = 1; k <= (2*i - 3); k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
        for(int l = 1; l <= n-1; l++) {
            for(int j = 1; j <= l; j++) {
                System.out.print(" ");
            }
            if(l == n-1) {
                System.out.println("*");
            } else{
                System.out.print("*");
                for(int m = n; m >= 2*l - 1; m--) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

    }

    static void pattern16(int n) {
        int num = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }
            String val = Integer.toString(num);
            for(int k = 0; k < i; k++) {
                System.out.print(val.charAt(k) + " ");
            }
            num *= 11;
            System.out.println();
        }

    }
}
