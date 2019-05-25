package algoritmoquicksort;
/**
 * @author Diego Miranda.
 * @version 1.1
 */

public class AlgoritmoQuickSort {

    /**
     * @author Diego Miranda
     * @version 1.1
     * Método main para testear el algoritmo QuickSort.
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
           int []  A = {5 , 1 , 2 , 9 , 4 , 0 };
           long tiempoInicial = 0 , tiempoFinal = 0; 
           QuickSort ordenamiento = new QuickSort(A);
           tiempoInicial = System.currentTimeMillis();
           ordenamiento.quickSort(A, 0, 5);
           tiempoFinal = System.currentTimeMillis();
           ordenamiento.imprimirOrdenamiento();
           ordenamiento.setTiempoEjecucion( tiempoFinal - tiempoInicial);
           ordenamiento.imprimirInformacion();
    }
    
}
