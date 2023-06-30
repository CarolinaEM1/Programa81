// Desplazar n posiciones en un arreglo -> N es el número digitado por el usuario

package video81;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class Video81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[] = new int[10];
        int n_posicion,ultimo;
        
        System.out.println("Llenar el arreglo");
        for (int i=0;i<10;i++){
            System.out.print(i+". Digite un numero: ");
            arreglo[i] = teclado.nextInt();
        }
        
        System.out.print("Digite la cantidad de posiciones a desplazar");
        n_posicion = teclado.nextInt();
        
        for (int vuelta=1;vuelta<=n_posicion;vuelta++){
            ultimo = arreglo[9];
            for (int i=8;i>=0;i--){
                arreglo[i+1] = arreglo[i];
            }
            
            arreglo[0] = ultimo;
        }
        
        System.out.println("\nEl arreglo resultante es:");
        for (int i=0;i<10;i++){
            System.out.println(i+". Elemento: "+arreglo[i]);
        }
        
       
        
    }
    
}
