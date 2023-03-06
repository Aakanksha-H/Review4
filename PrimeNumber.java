import java.util.Scanner;

public class PrimeNumber {
    public static int[] removeDuplicateElements(){
        int[] input = {3, 1, 5, 6, 2, 3, 4, 1, 4, 5, 6, 7, 8, 3, 2, 29};
        int n = input.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (input[i] != input[i+1]){
                temp[j++] = input[i];
            }
        }
        temp[j++] = input[n-1];
        for (int i = 0; i < j; i++) {
            input[i] = temp[i];
        }
        return temp;
    }
    public static void primeNumber() {

        int[] input = removeDuplicateElements();

        for (int i = 0; i < input.length; i++) {
            boolean isPrime = true;
            if (input[i] == 1)
                isPrime = false;
            else {
                for (int j = 2; j <= input[i] / 2; j++) {
                    if (input[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                if (input[i] == 0) {
                } else {
                    System.out.print(input[i] + " , ");
                }
            }
        }
        System.out.println(" Are the prime number in the array ");
    }
}
