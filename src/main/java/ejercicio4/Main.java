package ejercicio4;

public class Main {
    public static boolean esPalindromoRecursivo(String cadena) {
        if(cadena.length() < 2) {
            return true;
        }
        if(cadena.charAt(0) == cadena.charAt(cadena.length()-1)) {
            return esPalindromoRecursivo(cadena.substring(1, cadena.length()-1));
        }
        return false;
    }
    public static boolean esPalindromoIterativo(String cadena) {
        int longitud = cadena.length();
        for(int i = 0; i < longitud/2; i++) {
            if(cadena.charAt(i) != cadena.charAt(longitud-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String cadena = "anitalavalatina";
        System.out.println("Es palindromo recursivo: " + esPalindromoRecursivo(cadena));
        System.out.println("Es palindromo iterativo: " + esPalindromoIterativo(cadena));
    }
}
