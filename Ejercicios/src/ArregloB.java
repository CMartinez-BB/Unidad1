public class ArregloB {
    public static void main(String[] args) {
        int[] arreglo2={1,3,5,7,9,2,3,1,9,8,8,7,6,5,4};
       int suma=0;
       for (int contador=0;contador<arreglo2.length;contador++){
           suma+=arreglo2[contador];
           int divisor=suma%arreglo2.length;
           System.out.println("El promedio total es; "+divisor);
       }
        System.out.println("La suma total es; "+suma);
        for (int contador=arreglo2.length-1;contador>=0; contador--){//numero en reversa
            System.out.println("EL orden inverso es; "+arreglo2[contador]);
        }

    }
}
