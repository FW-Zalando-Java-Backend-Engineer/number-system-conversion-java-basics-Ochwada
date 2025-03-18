# **📌 Java Assignment: Number System Conversion & Java Basics**  


## **📖 Overview**  
This assignment is designed to help you practice **Java basics** and **number system conversions**. You will complete several guided tasks related to **Binary, Octal, Decimal, and Hexadecimal** numeral systems.

✅ **By the end of this assignment, you will be able to:**  
- Write and execute **Java programs**.  
- Work with **different numeral systems** in Java.  
- Convert between **decimal, binary, octal, and hexadecimal**.  
- Understand how numbers are stored and processed in computers.

---

## **📝 Instructions**
💡 Follow each step carefully! This is a **step-by-step guide** to complete the assignment.

1. **Download the provided Java file (`Assignment.java`).**
2. **Open it in your Java IDE** (IntelliJ IDEA).
3. **Complete each part of the assignment step by step**.
4. **Run your code after completing each section** to make sure it works correctly.
5. **Save your file** and upload it as instructed (via GitHub Classroom or email).

---

## **🚀 Part 1: Java Basics (10 Points)**
### **✅ Task 1: Create Your First Java Program**
### **Step 1: Create a new Java file**
- Open your Java IDE.
- Create a new Java class called **`MyFirstJavaProgram`**.
- Inside this class, you will write your first Java program.

### **Step 2: Write a Java program that does the following:**
1. Prints `"Hello, GitHub Classroom!"` to the screen.
2. Declares three variables:  
   - **name** (your name, **String**)  
   - **age** (your age, **int**)  
   - **gpa** (your estimated GPA, **double**)  
3. Prints these values in a **formatted output**.

### **Example Output:**
```
Hello, GitHub Classroom!
My name is Alice.
I am 20 years old.
My estimated GPA is 3.85.
```

### **✅ Task 1 Code Template (Fill in Your Details)**
```java
public class MyFirstJavaProgram {
    public static void main(String[] args) {
        // Printing a welcome message
        System.out.println("Hello, GitHub Classroom!");

        // Declare variables
        String name = "YourName"; // Replace with your name
        int age = 0; // Replace with your age
        double gpa = 0.0; // Replace with your estimated GPA

        // Print the information
        System.out.println("My name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("My estimated GPA is " + gpa + ".");
    }
}
```
✅ **Run the program** and **check if the output is correct**.

---

## **🔢 Part 2: Printing Numbers in Different Bases (10 Points)**
### **✅ Task 2: Convert and Print Numbers in Binary, Octal, and Hexadecimal**
### **Step 1: Copy the following Java program**
This program allows you to **enter a decimal number**, then it **automatically converts** and prints it in **binary, octal, and hexadecimal** formats.

```java
import java.util.Scanner;

public class NumberSystems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert to other numeral systems
        String binary = Integer.toBinaryString(decimalNumber);
        String octal = Integer.toOctalString(decimalNumber);
        String hexadecimal = Integer.toHexString(decimalNumber);

        // Print the results
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
    }
}
```
✅ **Run the program and enter different decimal numbers to see their conversions.**

### **Step 2: Modify the program to also accept a Binary number and convert it to Decimal**
**Hint:** Use `Integer.parseInt(binaryString, 2);` to convert a binary string to a decimal number.

---

## **📏 Part 3: Manual Number System Conversions (20 Points)**
### **✅ Task 3: Convert Numbers Without Using Java Built-in Methods**
For each method below, **complete the missing code** so that the conversion works manually.

---

### **1️⃣ Convert Decimal to Binary (5 Points)**
### **Steps:**
1. **Divide the decimal number by 2**.
2. **Write down the remainder**.
3. **Repeat** the division process until the quotient is 0.
4. **Read the remainders from bottom to top** (this is the binary equivalent).

### **Task 3.1: Complete the Code**
```java
public static String decimalToBinary(int decimal) {
    String binary = "";
    while (decimal > 0) {
        binary = (decimal % 2) + binary; // Get remainder and add to front
        decimal /= 2;
    }
    return binary;
}
```
✅ **Test the method with different decimal numbers.**

---

### **2️⃣ Convert Binary to Decimal (5 Points)**
### **Steps:**
1. **Start with the rightmost digit** of the binary number.
2. **Multiply each digit by powers of 2** (`2^0`, `2^1`, `2^2`, …).
3. **Add up all the results**.

### **Task 3.2: Complete the Code**
```java
public static int binaryToDecimal(String binary) {
    int decimal = 0;
    int power = 0;

    for (int i = binary.length() - 1; i >= 0; i--) {
        if (binary.charAt(i) == '1') {
            decimal += Math.pow(2, power);
        }
        power++;
    }
    return decimal;
}
```
✅ **Test this method by converting `1010` (binary) to decimal.**

---

### **3️⃣ Convert Decimal to Octal (5 Points)**
**Steps:**  
1. **Divide the decimal number by 8**.  
2. **Write down the remainder**.  
3. **Repeat** until the quotient is 0.  
4. **Read the remainders from bottom to top**.

✅ **Write the Java method to do this manually.**

---

### **4️⃣ Convert Decimal to Hexadecimal (5 Points)**
**Steps:**  
1. **Divide the decimal number by 16**.  
2. **Write down the remainder**.  
3. **Repeat** until the quotient is 0.  
4. **Convert remainders 10-15 to A-F**.  
5. **Read remainders bottom to top**.

✅ **Write the Java method to do this manually.**

---

## **⚡ Part 4: Bonus Challenge (10 Points)**
**✅ Task 4: Create a Simple Number System Converter**
1. The program should **ask the user to choose a conversion**:
   - `1. Decimal to Binary`
   - `2. Binary to Decimal`
   - `3. Decimal to Octal`
   - `4. Decimal to Hexadecimal`
2. Based on the user’s choice, **call the appropriate method**.

✅ **Example Output:**
```
Select a conversion:
1. Decimal to Binary
2. Binary to Decimal
3. Decimal to Octal
4. Decimal to Hexadecimal

Enter your choice: 1
Enter decimal number: 45
Binary: 101101
```
---


## 📝 How You Will Use the provided Java file (`Assignment.java`).
💡 Follow these steps to complete the assignment:

1️⃣ **Open the `Assignment.java` file** in your **Java IDE** (IntelliJ IDEA, VS Code, Eclipse, or BlueJ).  
2️⃣ **Complete each `TODO` section** inside the provided methods by implementing the missing logic.  
3️⃣ **Test your program** by running it and providing different inputs.  
4️⃣ **Verify your outputs** match the expected results.  
5️⃣ **Once all conversions work correctly, submit your final `Assignment.java` file** following the provided instructions.

---

## **🎯 What This File Includes**
✔ **Java Basics** (`Hello World`, Variables).  
✔ **User Input Handling** (`Scanner` for interactive input).  
✔ **Methods for Each Number System Conversion** (Manual implementations with instructions).  
✔ **Bonus:** A **Menu-Driven Number Converter** (For extra challenge).  

---

## **📌 Next Steps ...**
💡 **Follow these steps to complete your assignment smoothly:**

1️⃣ **Run the program as it is** to see the initial output.  
2️⃣ **Implement the `decimalToBinary` method** and test it.  
3️⃣ **Implement the `binaryToDecimal` method** and test it.  
4️⃣ **Implement the `decimalToOctal` and `decimalToHexadecimal` methods** and verify their correctness.  
5️⃣ **Run the interactive menu** and confirm that all conversions work as expected.  
6️⃣ **Submit your completed `Assignment.java` file** through GitHub Classroom (or as instructed).  

---

## **🚀 Submission Instructions**
Once you have completed all tasks:
1. **Save your final `Assignment.java` file.**  
2. **Upload the file to GitHub Classroom** (or follow alternative submission instructions).  
3. **Double-check that all functions work before submitting.**  

---

### **❓ Need Help?**
If you have questions:
- **Revisit the class lessons and examples.**
- **Ask your instructor or teammates for guidance.**
- **Debug by adding print statements to understand how your code executes.**

---


## **📊 Grading Criteria**
| Section | Points |
|---------|--------|
| Java Basics (Hello World, Variables) | 10 |
| Printing Numbers in Different Bases | 10 |
| Decimal to Binary (Manual) | 5 |
| Binary to Decimal (Manual) | 5 |
| Decimal to Octal (Manual) | 5 |
| Decimal to Hexadecimal (Manual) | 5 |
| Bonus Challenge | 10 |
| **Total** | **50 Points** |

---

🚀 **Good luck, and happy coding!** 🎉 Let me know if you have any questions. 😊
