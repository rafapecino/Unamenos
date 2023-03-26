package ejercicio5;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class EUCLIDES {
    public static int mcdRecursivo(int m, int n) {
        if(n == 0) {
            return m;
        } else {
            return mcdRecursivo(n, m % n);
        }
    }
    public static int mcdIterativo(int m, int n) {
        int resto;
        while(n != 0) {
            resto = m % n;
            m = n;
            n = resto;
        }
        return m;
    }

    public static int mcdLambda(int a , int b){
        BiFunction<Integer, Integer, Integer> mcdLambda = (x, y) -> {
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }
            return x;
        };
        return mcdLambda.apply(a, b);
    }
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        System.out.println("MCD recursivo: " + mcdRecursivo(m, n));
        System.out.println("MCD iterativo: " + mcdIterativo(m, n));
        System.out.println("MCD lambda: " + mcdLambda(12, 8));
    }

}
