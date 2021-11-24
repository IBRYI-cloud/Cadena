
public class Ejercicio {
    public Ejercicio() {
    }

    private static int maximoVector(int[] vector, int indice, int maximo) {
        if (indice == vector.length - 1) {
            if (vector[indice] > maximo) {
                maximo = vector[indice];
            }
        } else {
            if (vector[indice] > maximo) {
                maximo = vector[indice];
            }

            maximo = maximoVector(vector, indice + 1, maximo);
        }

        return maximo;
    }

    public static int maximoVector(int[] vector) {
        return maximoVector(vector, 0, 0);
    }
}
