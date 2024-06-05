import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers: ");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter another number: ");
        int n = scanner.nextInt();


        printArray(numbers);

        boolean numIsInArray = searchNumInArray(numbers, n);

        int sum = sumOfEvenIndexes(numbers);

        int sumOfEvenNumsInArray = sumOfEvenNumsInArray(numbers);
        System.out.println("\n The sum of all the even numbers in your array is: " + sumOfEvenNumsInArray(numbers));


        boolean duplication = checkForDuplication(numbers);
    }


    public static void printArray(int[] array) {
        System.out.println("Your array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static boolean searchNumInArray(int[] array, int num) {
        boolean numIsInArray = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                numIsInArray = true;
            } else {
                numIsInArray = false;
            }
        }
        return numIsInArray;
    }


    public static int sumOfEvenIndexes(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum += array[i];
        }
        return sum;
    }


    public static int sumOfEvenNumsInArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }


    public static boolean checkForDuplication(int[] array){
        boolean duplication = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]){
                    duplication = true;
                }
            }
        }
        return duplication;
    }



}