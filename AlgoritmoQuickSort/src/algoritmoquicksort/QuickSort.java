package algoritmoquicksort;

/**
 * @author Diego Miranda
 * @version 1.0
 * clase QuickSort basada en CRLS que ejecuta el algoritmo QuickSort
 * está conformado por los métodos partition y quickSort.
 */

public class QuickSort {
    int[] A;
    /////////////////////////////////////////////////CONSTRUCTOR//////////////////////////////////////
     /**
     *@author Diego Miranda
     * @version 1.0
     * Constructor para la clase QuickSort
     * @param A : array unidimensional con los elementos enteros.
     */  
    public QuickSort (int [] A) { 
       this.A =A;
    }
    
    ////////////////////////////////////////MÉTODO PARTITION/////////////////////////////////////
    /**
    *@author Diego Miranda     
    * @version 1.0
    * obtenemos el pivote para el array.
    * @param A: array unidimensional con los elementos enteros
    * @param p: indice inicial del array o sub-array.
    * @param r: indice final del array o sub-array.
    * @return pivote
    */
    public int partition( int[] A , int p , int r) {
          int x = A[r];
          int i = p -1;
          for (int j = p ;  j <= r-1 ; j++) {
              if ( A[j] <= x) {
                  i++;
                  //EXCHANGE
                  int aux = A[j];
                  A[j] = A[i];
                  A[i] = aux;
              }
          }
          //EXCHANGE 
          int aux  = A[i+1];
          A[i+1] = A[r];
          A[r] = aux;
          return i + 1;
    }
    
    
    ///////////////////////////////////////MÉTODO QUICKSORT///////////////////////////////////
    /**
     * @author Diego Miranda     
     * @version 1.0
     * realiza las particiones del array en sub-arrays utilizando 
     * para ello el pivote obtenido del método partition y luego
     * ordenarlo.
     * @param A: array unidimensional con los elementos enteros
     * @param p: indice inicial del array o sub-array.
     * @param r: indice final del array o sub-array.
     */
    public void quickSort(int[] A , int p , int r) {
         if ( p < r) {
              int q = partition(A,p,r);
              quickSort(A , p , q-1);
              quickSort(A , q+1 , r);
         }
    }
    /////////////////////////////////////////MÉTODO IMPRIMIR///////////////////////////////////////
    /**
     * @author Diego Miranda      
     * @version 1.0
     *  Imprimir los elementos del array A.
     */
    public void imprimirOrdenamiento () {
        for (int i = 0 ; i < A.length ; i++ ) {
              System.out.print(" " + A[i] + " " );
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
