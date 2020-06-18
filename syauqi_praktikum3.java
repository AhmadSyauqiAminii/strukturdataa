package syauqi_praktikum1;
import java.util.*;
public class syauqi_praktikum3 {
public static void main(String[] args) {
// Creating an empty Stack
Stack<String> STACK = new Stack<String>();
STACK.push("Minggu");
STACK.push("Senin");
STACK.push("Selasa");
STACK.push("Rabu");
STACK.push("Kamis");
// Displaying the Stack
System.out.println("Stack Awal: " + STACK);
// Removing elements using pop() method
System.out.println("Pop Element: " +
STACK.pop());
System.out.println("Pop Element: " +
STACK.pop());
// Displaying the Stack after pop operation
System.out.println("Update Stack "
+ STACK);
}
}