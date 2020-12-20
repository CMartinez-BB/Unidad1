public class Arreglos {
    public static void main(String[] args) {
        int arrgloA[]={2,3,8,7,1};
        int suma=0;
        int multiplicación=1;
        int numero_par=0;

        for(int contador=0;contador<arrgloA.length;contador++){//imprimir multiplicación y suma
            suma+=arrgloA[contador];
            multiplicación=multiplicación*arrgloA[contador];
            if(contador%2==0){
                System.out.println("Los numero pares son; "+contador); //numeros pares

            }

        }
        System.out.println("La suma es igual a; "+suma);

        for (int contador=arrgloA.length-1;contador>=0; contador--){//numero en reversa
            System.out.println("EL orden inverso es; "+arrgloA[contador]);
        }

        System.out.println("La multiplicación total es: "+multiplicación);

        for ( int dato : arrgloA ) {
            System.out.println (dato);
        }
    }
}
