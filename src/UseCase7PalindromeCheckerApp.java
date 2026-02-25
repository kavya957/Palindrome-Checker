import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ===========================================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ===========================================================================
 * * Use Case 7: Deque Based Optimized Palindrome Checker
 * * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 * * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 * * - removeFirst()
 * - removeLast()
 * * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 * * This use case demonstrates optimal bidirectional
 * traversal using Deque.
 * * @author Developer
 * @version 7.0
 */
public class UseCase7PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Declare and initialize the input string
        String input = "madam";

        // Initialize Deque for bidirectional traversal
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character into the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Perform bidirectional comparison
        // If the size is 0 or 1, it's naturally a palindrome
        while (deque.size() > 1) {
            // Compare first and last characters removed from the deque
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        if (isPalindrome) {
            System.out.println("'" + input + "' is a palindrome.");
        } else {
            System.out.println("'" + input + "' is not a palindrome.");
        }
    }
}
