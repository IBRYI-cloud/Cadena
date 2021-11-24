public class Ejecricio {
    private static int compararVectores(int [] vector1, int[]vector2, int indice){
        int sumaDiferencias ;
        if(indice == vector1.length-1){
            sumaDiferencias = Math.abs(vector1[indice]-vector2[indice]);
        }
        else {
            sumaDiferencias = Math.abs(vector1[indice]-vector2[indice])+ compararVectores(vector1,vector2,indice+1);
        }

        return sumaDiferencias;
    }
    /*
    metodo auxiliar que realiza la llamada al metodo recursivo
     */
    public static boolean compararVectores(int[] vector1, int[] vector2){
            return compararVectores(vector1, vector2, 0) == 0;

    }
    /*
    metodo recursivo para calcular el maximo valor de un vector
    vector  ={2, 4, 6, 7, 6, 3, 4, 3}
     */
    private static int maximoVector(int[] vector, int indice,int maximo){
        if (indice == vector.length - 1){
            if (vector[indice] > maximo){
                maximo = vector[indice];
            }
        }else {//llamda a la recursiva
            if (vector[indice] > maximo){
                maximo = vector[indice];
        }
            maximo = maximoVector(vector, indice + 1, maximo);
        }
        return maximo;
        }
        /*
        metodo auxiliar que llama al metodo recursivo
         */
    public static int maximoVector(int[] vector){
        return maximoVector(vector, 0, 0);

       }
    }
