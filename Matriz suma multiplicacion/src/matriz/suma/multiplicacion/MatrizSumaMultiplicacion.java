
package matriz.suma.multiplicacion;


public class MatrizSumaMultiplicacion {
   
    public static void main(String[] args) {
      
        int M_1 [][] = new int [2][2];
        int M_2 [][] = new int [2][2];
        int M_3 [][] = new int [2][2];
        int M_RESULTANTE [][] = new int [2][2];
        
        for (int i = 0; i < M_1.length; i++){
            for (int j = 0; j < M_1.length; j++){
                M_1[i][j] = (int) (Math.random() * 3);
            }
        }
        
        
         for (int i = 0; i < M_2.length; i++){
            for (int j = 0; j < M_2.length; j++){
                M_2[i][j] = (int) (Math.random() * 3);
            }
        }
        
         for (int i = 0; i < M_3.length; i++){
            for (int j = 0; j < M_3.length; j++){
                M_3[i][j] = (int) (Math.random() * 3);
            }
        }
        
        
        // OPERACION = M_RESULTANTE = (M_1 + M_2) * M_3
            // SUMA
         for (int i = 0; i < M_3.length; i++){
            for (int j = 0; j < M_3.length; j++){
                M_RESULTANTE[i][j] = M_1[i][j] + M_2[i][j];
        
            }
         }
         
         
        //MULTIPLICACION 
        int posicion1 = (M_RESULTANTE[0][0] * M_3[0][0]) 
                + (M_RESULTANTE[0][1] * M_3[1][0]);
        
        M_RESULTANTE[0][0] = posicion1;
         
        int posicion2 = (M_RESULTANTE[0][0] * M_3[0][1]) 
                + (M_RESULTANTE[0][1] * M_3[1][1]);
         
        M_RESULTANTE[0][1] = posicion2;
         
        int posicion3 = (M_RESULTANTE[1][0] * M_3[0][0]) 
                + (M_RESULTANTE[1][1] * M_3[1][0]);
         
        M_RESULTANTE[1][0] = posicion3;
         
        int posicion4 = (M_RESULTANTE[1][0] * M_3[0][1]) 
                + (M_RESULTANTE[1][1] * M_3[1][1]);
         
        M_RESULTANTE[1][1] = posicion4;
         
         
        
        //imprimir matriz
        System.out.print("hola");
        for (int i = 0; i < M_RESULTANTE.length; i++) {
            System.out.println("");
            for (int j = 0; j < M_RESULTANTE.length; j++) {
                System.out.print(" [ " + M_RESULTANTE[i][j] + " ]");
              
           
                
            }
        }
        
        
         
        
         
         
         
    }
    
}
