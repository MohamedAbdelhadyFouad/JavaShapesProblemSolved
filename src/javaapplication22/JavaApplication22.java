/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author Abdel
 */
public class JavaApplication22 {

    
    public static void main(String[] args) {

       /* Question 1
          1*****
          12****
          123***
          1234**
          12345*
          123456
         */
        /* int x=1;
        for (int i = 1; i <= 6; i++) {
            while (x <=i) {
                System.out.print(x);
                x++;
            }
            for (int j = i+1; j <= 6; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
            x=1;
        }*/

 /* Question 2
          12345*
          1234**
          123***
          12****
          1*****
          ******
         */
 /* int x = 1;
        for (int i = 6; i >= 1; i--) {
            while (x < i) {
                System.out.print(x);
                x++;
            }
            for (int j = i; j <= 6; j++) {
                System.out.print("&");

            }
            System.out.println("");
            x = 1;
        }*/
 
 
 
 /*Qustion 3
 
@     
@@    
@ @   
@  @  
@   @ 
@@@@@@
 */
        int x = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("@");
            for (int j = 2; j <= 6; j++) {
                if ((j == i)) {
                    System.out.print("@");

                } else if (i == 6) {
                  System.out.print("@");
                   
                }else {
                System.out.print(" "); 
                
                }
                
            }
            System.out.println("");

        }
        
    }

}
