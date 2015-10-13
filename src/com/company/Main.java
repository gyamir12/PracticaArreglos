/*Yamir Gudino
 *lunes 5 de octubre de 2015
 * arreglos
 */
package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int vector1 [];
        int vector2 [] = {1,2,3,4,5,6,7,8,9,10};
        vector1  = new int [10];
        for(int j = 0; j<=9 ; j++)
            vector1 [j] = j + vector2[j];

        for ( int k = 0; k <= 9 ; k++){
            System.out.println( "el elemento " +k + " = " + vector1[k]);
            System.out.println( "En vector 2 esta celda es: " + vector2[k]);
        }

    }
}
