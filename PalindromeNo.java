public class PalindromeNo {

        public boolean isPalindrome(int x) {
            // Negative numbers cannot be palindromes
            if (x < 0) return false; 
    
            int original = x, reversed = 0;
            
            while (x > 0) {
                int digit = x % 10;  // Get the last digit
                reversed = reversed * 10 + digit; // Build reversed number
                x /= 10; // Remove last digit
            }
            
            return original == reversed;
        }
    
}
