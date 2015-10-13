package com.company;

import javax.swing.*;

/**
 * Created by yamir on 10/05/15.
 * diga el numero de mes a consultar
 * nombre de mes igual
 * cantidad de dias que tiene el mes =
 * mes lluvioso o seco
 * nov abril = seco
 * abril nov = lluvioso
 */
public class Numerodemes {

    public static void main(String[] args){
        //declaracion de arreglos
        String meses [];

        //declarar e iniciar valores
        int dias [] = {31, 28 , 31, 30, 31 ,30, 31, 31, 30, 31, 30, 31 };

        //instancia del arreglo
        meses =  new String [12];


        //inicializacion de valores
        meses[0]="enero";
        meses[1]="febrero";
        meses[2]="Marzo";
        meses[3]="Abril";
        meses[4]="Mayo";
        meses[5]="Junio";
        meses[6]="Julio";
        meses[7]="Agosto";
        meses[8]="Septiembre";
        meses[9]="Octubre";
        meses[10]="Noviembre";
        meses[11]="Diciembre";

        String name = JOptionPane.showInputDialog("introduzca el numero del mes");
        int x = Integer.parseInt(name);
        System.out.println("el nombre del mes es: "  +meses[x-1]);
        System.out.println("la cantidad de dias que tiene "  +meses[x-1]+ " es " +dias[x-1]);
        String msg = "el nombre del mes es: "  +meses[x-1] ;
        JOptionPane.showMessageDialog(null, msg);
        String msg2 = "la cantidad de dias que tiene "  +meses[x-1]+ " es " +dias[x-1] ;
        JOptionPane.showMessageDialog(null, msg2);
        if (x > 4 && x <=11) {
            String msg4 = meses[x-1]+" es un mes lluvioso";
            JOptionPane.showMessageDialog(null, msg4);
            System.out.println(meses[x-1]+" es un mes lluvioso");
        }

        else {
                String msg23 = meses[x-1]+" es un mes seco";
            JOptionPane.showMessageDialog(null, msg23);
            System.out.println(meses[x-1]+" es un mes seco");
        }
    }





    }

