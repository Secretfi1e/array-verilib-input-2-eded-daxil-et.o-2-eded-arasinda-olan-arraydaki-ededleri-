import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = {15, 250, 23, 457, 456, 321, 875, 246, 190, 234, 800, 9837, 12351};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int a = scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int b = scanner.nextInt();


        for (int num : array) {
            if (num >= Math.min(a, b) && num <= Math.max(a, b)) {

                int sumOfDigits = 0;
                int tempNum = Math.abs(num);
                while (tempNum > 0) {
                    sumOfDigits += tempNum % 10;
                    tempNum /= 10;
                }

                if (sumOfDigits > 7) {
                    System.out.println(num);
                }
            }
        }
    }
    }
