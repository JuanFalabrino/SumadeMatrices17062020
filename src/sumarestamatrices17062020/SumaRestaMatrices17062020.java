
package sumarestamatrices17062020;

public class SumaRestaMatrices17062020 {

    public static void main(String[] args) {
        int matriz_uno [][] = new int [3][3];
        int matriz_dos [][] = new int [3][3];
        int matriz_resultante [][] = new int [3][3];
        int contador2=0;
        int contador1=0;
        
        //llenado de la primera matriz 
        for (int i = 0; i < matriz_uno.length; i++ ){
            for(int j=0;j< matriz_uno.length;j++){
             
                matriz_uno[i][j] = contador1 ;
                contador1 ++;
            }
        //llenado de la segunda matriz 
        }
        for (int i = 0 ; i < matriz_dos.length; i++){
            for(int j=0; j< matriz_dos.length; j++){
                
                matriz_dos[i][j] = contador2;
                contador2 ++;
                }
        }
         
       // Suma o Resta de matrices
       for (int i = 0; i < matriz_uno.length; i++){
           for(int j = 0; j < matriz_dos.length; j++){
               matriz_resultante[i][j] = matriz_uno[i][j] + matriz_dos[i][j];
                     
           }
         
       }
       

//Imprimiendo las matrices
       
       for (int i =0 ; i < matriz_uno.length; i ++){
           
           for (int j = 0; j < matriz_uno.length; j ++){
                System.out.print ("[" + matriz_uno[i][j] + "]");
                  
           }
               
       if (i == 1) {
           System.out.print("   +   ");
       } else {
           System.out.print("       ");
              
       }
       
       for (int j= 0 ; j < matriz_dos.length; j ++){
                System.out.print("[" + matriz_dos [i][j] + "]");
                    
       }
        if (i == 1) {
           System.out.print("   =   ");
       } else {
           System.out.print("       ");
              
       }
        
        for (int j =0; j < matriz_resultante.length; j++) {
            System.out.print("[" + matriz_resultante[i][j] + "]");
                   
        }
        System.out.println("");
       }
/*
        //imprimir matriz
        for (int j = 0;j < matriz_uno.length;j++){
            if (j==1) {
              System.out.print("   +   ");
          }else { 
              System.out.print("       ");
          }   
            for(int i = 0; i< matriz_uno.length;i++){
            System.out.print("[" + matriz_uno[j][i] + "]");
            System.out.print("[" + matriz_dos[j][i] + "]");
            }
            
                   
          System.out.println("");
        }
  */      
        

    }
}
