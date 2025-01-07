public class unaryoperator3 {
    public static void main(String args[]){
        int a =10;
        int b = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(!c);
        System.out.println(!d);
    }
}
// Step-by-Step Execution:
// int a = 10; and int b = -10;

// a = 10 in binary (32-bit representation): 00000000 00000000 00000000 00001010.
// b = -10 in binary (32-bit, 2's complement representation): 11111111 11111111 11111111 11110110.
// System.out.println(~a);

// The ~ operator inverts all the bits of a:
// a = 10 → Binary: 00000000 00000000 00000000 00001010.
// Inverting the bits: 11111111 11111111 11111111 11110101.
// This represents -11 in decimal (as per 2's complement representation).
// Output: -11.
// System.out.println(~b);

// The ~ operator inverts all the bits of b:
// b = -10 → Binary: 11111111 11111111 11111111 11110110.
// Inverting the bits: 00000000 00000000 00000000 00001001.
// This represents 9 in decimal.
// Output: 9.
// boolean c = true; and boolean d = false;

// c = true, d = false.
// System.out.println(!c);

// The ! operator negates the value of c:
// !true → false.
// Output: false.
// System.out.println(!d);

// The ! operator negates the value of d:
// !false → true.
// Output: true.
// Final Output:
// arduino
// Copy code
// -11
// 9
// false
// true
// Key Takeaways:
// Bitwise Complement (~):

// Inverts all bits of an integer.
// ~n = -(n + 1).
// Logical NOT (!):

// Reverses the boolean value:
// true → false.
// false → true.
// Let me know if you have further questions! 😊