public class unaryoperator1 {
    public static void main(String args[]){
    int x = 10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
    }
}
// Step-by-step explanation:
// int x = 10;

// The variable x is initialized to 10.
// System.out.println(x++); (Line 1)

// Post-increment (x++):
// The current value of x (which is 10) is printed first.
// After printing, the value of x is incremented by 1.
// Output: 10
// Now, x = 11.
// System.out.println(++x); (Line 2)

// Pre-increment (++x):
// The value of x is incremented first by 1 (from 11 to 12).
// Then, the incremented value is printed.
// Output: 12
// Now, x = 12.
// System.out.println(x--); (Line 3)

// Post-decrement (x--):
// The current value of x (which is 12) is printed first.
// After printing, the value of x is decremented by 1.
// Output: 12
// Now, x = 11.
// System.out.println(--x); (Line 4)

// Pre-decrement (--x):
// The value of x is decremented first by 1 (from 11 to 10).
// Then, the decremented value is printed.
// Output: 10
// Now, x = 10.
