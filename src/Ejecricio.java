public class Ejecricio {
    private static int comprararVectores(int [] vector1, int[]vector2, int indice){
        int sumaDiferencias ;
        if(indice == vector1.length-1){
            sumaDiferencias = Math.abs(vector1[indice]-vector2[indice]);
        }
        else {
            sumaDiferencias = Math.abs(vector1[indice]-vector2[indice])+comprararVectores(vector1,vector2,indice+1);
        }

        return sumaDiferencias;
    }
    public static boolean comprararVectores(int [] vector1, int[]vector2){
        return comprararVectores(vector1,vector2,0)== 0;
    }
}
