package ejercicio3;

import java.util.Scanner;

public class Main {
    public static String decimalToHexadecimal(int decimal){
        String hexadecimal = "";
        int resto;
        while (decimal > 0){
            resto = decimal % 16;
            if (resto < 10){
                hexadecimal = resto + hexadecimal;
            }else{
                switch (resto){
                    case 10:
                        hexadecimal = "A" + hexadecimal;
                        break;
                    case 11:
                        hexadecimal = "B" + hexadecimal;
                        break;
                    case 12:
                        hexadecimal = "C" + hexadecimal;
                        break;
                    case 13:
                        hexadecimal = "D" + hexadecimal;
                        break;
                    case 14:
                        hexadecimal = "E" + hexadecimal;
                        break;
                    case 15:
                        hexadecimal = "F" + hexadecimal;
                        break;
                }
            }
            decimal = decimal / 16;
        }
        return hexadecimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero decimal: ");
        int decimal = sc.nextInt();
        System.out.println(decimalToHexadecimal(decimal));
    }
}