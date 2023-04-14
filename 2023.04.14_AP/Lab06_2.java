import java.lang.annotation.Retention;

public class Lab06_2 {
    public static void main(String[] args){

        String word1 = "Hello";
        String word2 = "123";
        String identifier1 = "myVariableName";
        String identifier2 = "5invalidIdentifier";
    
        // Testowanie metody isOnlyLetters
        System.out.println(isOnlyLetter(word1)); // true
        System.out.println(isOnlyLetter(word2)); // false
    
        // Testowanie metody isValidJavaIdentifier
        System.out.println(isValidJavaIdentifier(identifier1)); // true
        System.out.println(isValidJavaIdentifier(identifier2)); // false

    }

    public static boolean isOnlyLetter(String s){
        return s.codePoints().allMatch(Character::isAlphabetic);
    }

    public static boolean isValidJavaIdentifier(String s) {
        if (s.isEmpty() || !Character.isJavaIdentifierStart(s.codePointAt(0))) {
            return false;
        }
        for (int i = 1; i < s.length(); i++) {
            if (!Character.isJavaIdentifierPart(s.codePointAt(i))) {
                return false;
            }
        }
        return true;
    }
    
}
