package ejercicio2;


public class Factorizar{
    //Algoritmo iterativo
    public static int[] factorizar(int n){
        int[] factores = new int[2];
        int i = 2;
        while (i <= n){
            if (n % i == 0){
                factores[0] = i;
                factores[1] = n / i;
                return factores;
            }
            i++;
        }
        return factores;
    }
    //Algoritmo con lambda
    public static int[] factorizarLambda(int n){
        int[] factores = new int[2];
        int i = 2;
        while (i <= n){
            if (n % i == 0){
                factores[0] = i;
                factores[1] = n / i;
                return factores;
            }
            i++;
        }
        return factores;
    }
    //programa principal
    public static void main(String[] args){
        int n = 80;
        int[] factores = factorizarLambda(n);
        System.out.println("Los factores de " + n + " son " + factores[0] + " y " + factores[1]);
    }

}