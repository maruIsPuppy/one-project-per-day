//Turn 6 bit to decimal
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        // import Scanner and take input
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter 6-bit Number: ");
        String bitInput = scnr.nextLine();
        if (bitInput.length() == 6) {
            // Split String input for every letter
            String[] arrayOfBit = bitInput.split("");

            // Split the String and assign them to variables
            int firstBit = Integer.parseInt(arrayOfBit[0]);
            int secondBit = Integer.parseInt(arrayOfBit[1]);
            int thirdBit = Integer.parseInt(arrayOfBit[2]);
            int fourthBit = Integer.parseInt(arrayOfBit[3]);
            int fifthBit = Integer.parseInt(arrayOfBit[4]);
            int sixthBit = Integer.parseInt(arrayOfBit[5]);

            // Will be used to check if input is in binary digits
            int bitProduct = firstBit * secondBit * thirdBit * fourthBit * fifthBit * sixthBit;
            int bitSum = firstBit + secondBit + thirdBit + fourthBit + fifthBit + sixthBit;

            if (firstBit > 1 || secondBit > 1 || thirdBit > 1 || fourthBit > 1 || fifthBit > 1 || sixthBit > 1) {
                System.out.println("Input is not in binary digits!");
            } else {
                // decimal calc: msb * 2^5 + 2nd bit * 2^4 + ... + lsb * 2^0
                double decimalNotation = firstBit * Math.pow(2, 5) + secondBit * Math.pow(2, 4) + thirdBit * Math.pow(2, 3) + fourthBit * Math.pow(2, 2) + fifthBit * Math.pow(2, 1) + sixthBit * Math.pow(2, 0);
                System.out.print("The Decimal Notation is: " + decimalNotation);
            }
        } else {
            System.out.println("Input is not 6 digits!");
        }

    }
}
