import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1️⃣ Print Hello World and Personal Info
        System.out.println("Hello, GitHub Classroom!");

        // Declare variables for name, age, and GPA (Replace with your values)
        String name = "Linda Ochwada"; // TODO: Replace with your name
        int age = 36; // TODO: Replace with your age
        double gpa = 2.3; // TODO: Replace with your estimated GPA

        // Print the variables
        System.out.println("My name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("My estimated GPA is " + gpa + ".");

        // 2️⃣ Number System Conversion: User Input
        System.out.print("\nEnter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert and display in different bases
        System.out.println("Binary: " + decimalToBinary(decimalNumber));
        System.out.println("Octal: " + decimalToOctal(decimalNumber));
        System.out.println("Hexadecimal: " + decimalToHexadecimal(decimalNumber));
        // System.out.println("Hexadecimal: " + decimalToHexadecimal(decimalNumber).toUpperCase());

        // 3️⃣ Bonus: Convert Binary to Decimal
        System.out.print("\nEnter a binary number: ");
        String binaryInput = scanner.next();

        // Convert binary to decimal
        System.out.println("Decimal equivalent: " + binaryToDecimal(binaryInput));

        // 4️⃣ Challenge: Build a simple Number System Converter
        runNumberSystemConverter();

        scanner.close();
    }

    // ✅ Task 1: Convert Decimal to Binary (Without Built-in Methods)
    public static String decimalToBinary(int decimal) {
        //☑️ TODO: Implement manual conversion (Repeated Division by 2)

        // create an empty Array to store the Binary Values
        int[] binary = new int[32]; // space for 32 bits -> initializing an array
        int i = 0; // starting index

        // handling 0 values
        if (decimal == 0) {
            return "0";
        }

        while (decimal != 0) {
            binary[i] = decimal % 2; // store the reminder
            decimal = decimal / 2;
            i = i + 1;
        }

        String result = "";

        // Reading from Bottom to Top
        for (
                int j = i - 1;
                j >= 0;
                j--)
        {
            result += binary[j];
        }
        return result;

        //return "Not Implemented"; // Replace with actual binary result
    }

    // ✅ Task 2: Convert Binary to Decimal (Without parseInt)
    public static int binaryToDecimal(String binary) {
        // TODO: Implement manual conversion using Positional Value method

        int decimal = 0;
        int base = 1; // base --> 2^0 = 1

        // Loop from right to left
        for (
                int i =  binary.length() -1;
                i >= 0;
                i--)
        {
            if (binary.charAt(i) == '1') //
            {
                decimal += base;
            }
            base *= 2; // base doubles each time (2^1, 2^2, 2^3...)
            // base = base * 2;
        }

        return decimal;
    }

    // ✅ Task 3: Convert Decimal to Octal (Without Built-in Methods)
    public static String decimalToOctal(int decimal) {
        // TODO: Implement manual conversion (Repeated Division by 8)
        return "Not Implemented"; // Replace with actual octal result
    }

    // ✅ Task 4: Convert Decimal to Hexadecimal (Without Built-in Methods)
    public static String decimalToHexadecimal(int decimal) {
        // TODO: Implement manual conversion (Repeated Division by 16)
        return "Not Implemented"; // Replace with actual hexadecimal result
    }

    // ✅ Bonus: Interactive Number System Converter
    public static void runNumberSystemConverter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelect a conversion:");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Binary to Decimal");
        System.out.println("3. Decimal to Octal");
        System.out.println("4. Decimal to Hexadecimal");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a decimal number: ");
                int dec = scanner.nextInt();
                System.out.println("Binary: " + decimalToBinary(dec));
                break;
            case 2:
                System.out.print("Enter a binary number: ");
                String bin = scanner.next();
                System.out.println("Decimal: " + binaryToDecimal(bin));
                break;
            case 3:
                System.out.print("Enter a decimal number: ");
                int decOct = scanner.nextInt();
                System.out.println("Octal: " + decimalToOctal(decOct));
                break;
            case 4:
                System.out.print("Enter a decimal number: ");
                int decHex = scanner.nextInt();
                System.out.println("Hexadecimal: " + decimalToHexadecimal(decHex));
                break;
            default:
                System.out.println("Invalid choice! Please select 1-4.");
        }
    }
}
