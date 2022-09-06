package packages.math;

import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class ArithmeticOperation {
    public static int subtract(int no1, int no2){
        return no1 - no2;
    }
    public static int multiply(int no1, int no2){
        return no1 * no2;
    }
    public static int divide(int no1, int no2){
        return no1 / no2;
    }
    public static int factorial(int no){
        int fact = 1;
        for (int i = 1; i < no; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static int reverse(int no){
        int digit;
        int rev = 0;
        while (no != 0){
            digit = no % 10;
           rev = rev * 10 + digit;
           no = no / 10;
        }
        return rev;
    }
}
