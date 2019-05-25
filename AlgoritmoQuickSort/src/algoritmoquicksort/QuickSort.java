package algoritmoquicksort;

/**
 * @author Diego Miranda
 * @version 1.1
 * clase QuickSort basada en CRLS que ejecuta el algoritmo QuickSort
 * está conformado por los métodos partition y quickSort.
 */

public class QuickSort {
    int[] A;
    int[] B;
    int numeroRotaciones;
    int numeroComparaciones;
    long tiempoEjecucion;
    
    ////////////////////////////////////////MÉTODO SET TIEMPO EJECUCIÓN////////////////////////////////////
    /**@author Diego Miranda.
     * @version 1.1
     * método set para entregar el tiempo en milisegundos que tardo quicksort en ejecutarse.
     * @param tiempoEjecucion : tiempo en milisegundos  
     */
    public void setTiempoEjecucion(long tiempoEjecucion) {
        this.tiempoEjecucion = tiempoEjecucion;
    }
    
    /////////////////////////////////////////////////CONSTRUCTOR//////////////////////////////////////
     /**
     *@author Diego Miranda
     * @version 1.1
     * Constructor para la clase QuickSort
     * asignamos a los atributos privados A y B el valor del array A
     * e inicializamos los demas atributos por defecto.
     * @param A : array unidimensional con los elementos enteros.
     */  
    public QuickSort (int [] A) { 
       this.A =A;
       this.B =A;
       numeroRotaciones = 0;
       numeroComparaciones = 0;
       tiempoEjecucion = 0;
    }
    
    ////////////////////////////////////////MÉTODO PARTITION/////////////////////////////////////
    /**
    *@author Diego Miranda     
    * @version 1.1
    * obtenemos el pivote para el array.
    * @param B: array unidimensional con los elementos enteros
    * @param p: indice inicial del array o sub-array.
    * @param r: indice final del array o sub-array.
    * @return pivote
    */
    public int partition( int[] B , int p , int r) {
          int x = B[r];
          int i = p -1;
          for (int j = p ;  j <= r-1 ; j++) {
              if ( B[j] <= x) {
                  i++;
                  //EXCHANGE
                  numeroRotaciones++;
                  int aux = B[j];
                  B[j] = B[i];
                  B[i] = aux;
              }
              numeroComparaciones++;
          }
          //EXCHANGE 
          numeroRotaciones++;
          int aux  = B[i+1];
          B[i+1] = B[r];
          B[r] = aux;
          return i + 1;
    }
    
    
    ///////////////////////////////////////MÉTODO QUICKSORT///////////////////////////////////
    /**
     * @author Diego Miranda     
     * @version 1.0
     * realiza las particiones del array en sub-arrays utilizando 
     * para ello el pivote obtenido del método partition y luego
     * ordenarlo.
     * @param B: array unidimensional con los elementos enteros
     * @param p: indice inicial del array o sub-array.
     * @param r: indice final del array o sub-array.
     */
    public void quickSort(int[] B , int p , int r) {
         if ( p < r) {
              int q = partition(B,p,r);
              quickSort(B , p , q-1);
              quickSort(B , q+1 , r);
         }
    }
    ////////////////////////////////////////MÉTODO IMPRIMIR ORDENAMIENTO ////////////////////////////
    /**
     * @author Diego Miranda
     * @version 1.1
     *  Imprimir los elementos del array A y B.  
     */
    public void imprimirOrdenamiento () {
        System.out.println("\nArray Inicial : ");
        for (int i = 0 ; i < A.length ; i++) {
             System.out.print(" " + A[i] + " ");
        }
        System.out.println("\nArray Ordenado : ");
        for (int i = 0 ; i < B.length ; i++ ) {
              System.out.print(" " + B[i] + " " );
        }
    }
    ////////////////////////////////////////MÉTODO IMPRIMIR INFORMACIÓN/////////////////////////////////
    /**
     *  @author Diego Miranda
     *  @version 1.1
     *  Imprimir la información acerca de la ejecución del algoritmo.
     *  para que el tiempo de ejecución sea diferente de 0 debe llamarse primero
     *  al método setTiempoEjecución.
     */
    public void imprimirInformacion () {
       System.out.println("Información de la ejecución actual del algoritmo : ");
       System.out.println("Número de rotaciones : " + numeroRotaciones);
       System.out.println("Número de comparaciones : " + numeroComparaciones);
       System.out.println("Tiempo de ejecucion en milisegundo : " + tiempoEjecucion );
       System.out.println("Tiempo de ejecucion en segundos : " + tiempoEjecucion/1000);
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
