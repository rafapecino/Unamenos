package ejercicio2;


import java.util.function.IntBinaryOperator;

public class Factorizar{
    //Algoritmo iterativo
    public static void f_iterative(int num, int div) {
        while (num > 1) {
            if (num % div == 0) {
                System.out.println(div);
                num = num / div;
            } else {
                div = div + 1;
            }
        }
    }


    //Algoritmo como el anterior pero con lambda
    public static void f_lambda(int num, int div) {
        IntBinaryOperator f = (x, y) -> {
            while (x > 1) {
                if (x % y == 0) {
                    System.out.println(y);
                    x = x / y;
                } else {
                    y = y + 1;
                }
            }
            return y;
        };
        f.applyAsInt(num, div);
    }




    void f(int num, int div)
    {
        if (num>1) {
            if ((num%div) == 0) {
                System.out.println(div);
                f(num/div,div);
            } else {
                f(num,div+1);
            }
        }
    }
    //programa principal
    public static void main(String[] args){
;
        int n = 100;
        int i = 2;
        //llama al algoritmo iterativo
        f_iterative(n, i);
        //llama al algoritmo lambda
        f_lambda(n, i);



    }

}