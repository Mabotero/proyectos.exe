
package matrizidentidad;

import java.util.Scanner;

public class Matrizidentidad {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int Matriz [][] = new int [2][2];
        int posicion;
        
        for (int i = 0; i < Matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < Matriz.length; j++){
        
                System.out.print("ingrese los numeros de la fila " + i + "columna" + j);
                posicion = in.nextInt();
                Matriz[i][j] = posicion;
            }
        }

        
        if (Matriz[0][0] != 1){
            System.out.print("esta matriz no es identidad");
            
            }else if (Matriz[0][1] != 0){
                System.out.print("no es una mtriz identidad");
                    
            }else if (Matriz[1][0] != 0){
                System.out.print("no es un matriz identidad");
                    
            }else if (Matriz[1][1] != 1){
                    
                System.out.print(" no es una matriz identidad");
            
                    
            }else System.out.print(" es una matriz identidad");
        
    
        
        for (int i = 0; i < Matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < Matriz.length; j++){
            
        
        System.out.print(" [" + Matriz[i][j] + "]");
            }
        }
     }
}


