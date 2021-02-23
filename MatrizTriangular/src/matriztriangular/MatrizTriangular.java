
package matriztriangular;
import java.util.Scanner;
        

public class MatrizTriangular {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int Matriz [][] = new int [3][3];
        
        for (int i = 0; i < Matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < Matriz.length; j++){
        
                System.out.print("ingrese los numeros de la fila " + i + "columna" + j + ": ");
                int posicion = in.nextInt();
                Matriz[i][j] = posicion;
            }
        }
        
         if (Matriz[0][0] == 0 && Matriz[0][1] == 0 && Matriz[1][0] == 0){
            System.out.print(" es una matriz triangular superior");
            
            }else if (Matriz[0][1] == 0 && Matriz[0][2] == 0 && Matriz[1][2] == 0){
                System.out.print(" es una matriz triangular superior");
                    
            
            
              }else System.out.print(" no es una matriz triangular superior");
         
         for (int i = 0; i < Matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < Matriz.length; j++){
            
        
        System.out.print(" [" + Matriz[i][j] + "]");
            }
        }
        
    }
    
}
