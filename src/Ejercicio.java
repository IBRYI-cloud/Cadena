public class Ejercicio {

    private static int maximoVector(int[] vector,int indice ,int maximo){
            //caso base
        if(indice == vector.length-1){
            if(vector[indice]>maximo){
                maximo=vector[indice];
            }
        }
        //llamada a la recursividad
        else{
            if(vector[indice ] > maximo){
                maximo=vector[indice];
            }
            maximo=maximoVector(vector,indice+1,maximo);
        }




        return maximo;
    }
    //metodo auxiliar que llama al recursivo
    public static int maximoVector(int[] vector){
        return maximoVector(vector,0,0);
    }

}
