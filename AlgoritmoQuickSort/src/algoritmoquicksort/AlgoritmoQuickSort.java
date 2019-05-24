package algoritmoquicksort;
/**
 * @author Diego Miranda.
 * @version 1.0
 */

public class AlgoritmoQuickSort {

    /**
     * @author Diego Miranda
     * @version 1.0
     * Método main para testear el algoritmo QuickSort.
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
           int []  A = {5 , 1 , 2 , 9 , 4 , 0 };
           QuickSort ordenamiento = new QuickSort(A);
           ordenamiento.quickSort(A, 0, 5);
           ordenamiento.imprimirOrdenamiento();
    }
    
}
