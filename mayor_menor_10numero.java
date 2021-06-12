/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steve
 */
public class mayor_menor_10numero {

    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     
     System.out.println("Ingrese el Primero Numero");
     int Num1=scn.nextInt();
     System.out.println("Ingrese segundo Numero");
     int Num2=scn.nexInt();
      System.out.println("Ingrese El Tercer Numero");
     int Num3=scn.nexInt();
        
    
     if(Num1>Num2 && Num2>Num3){
     System.out.println("Mayor o menor "+Num1 +","+Num2+","+Num3);
     } else if (Num1>Num3 && Num3>Num2){
         System.out.println("Mayor o menor"+Num1 +","+Num3+","+Num2);
     }else if (Num2>Num1 && Num1>Num3)
     { System.out.println("Mayor o menor"+Num2 +","+Num1+","+Num3);
      }else if (Num2>Num3 && Num3>Num1){
          System.out.println("Mayor o menor"+Num2 +","+Num3+","+Num1);
      }else if (Num3>Num1 && Num1>Num2){
           System.out.println("Mayor o menor"+Num3 +","+Num1+","+Num2);
      }else if (Num3>Num2 && Num2>Num1)
      {System.out.println("Mayor o menor"+Num3 +","+Num2+","+Num1);
     
     
    }}}
    
