public class StringLab {

    /**
     * @param str The input string
     * @return The reversed string
     */
    public String reverseString(String str) {
        //TODO
        String strings = "";
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; --i)
            strings = strings + chars[i];
        return strings;
    }

    /**
     * Makes all characters before the index value uppercase, makes all characters on the index and afterwards
     * lowercase. See test cases for a better understanding.
     *
     * @param str   The input string
     * @param index All character positions smaller than index must be uppercase. All character positions greater
     *              than index must be lowercase.
     * @return The new string
     */
    public String capitalizeAndMakeLowercase(String str, int index) {
        //TODO
        String strings = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            if (i < index) {
                if (chars[i] >= 'a' && chars[i] <= 'z')
                    chars[i] = (char)(chars[i] - 'a' + 'A');  // Convert into Uppercase
            } else {
                if (chars[i] >= 'A' && chars[i] <= 'Z')
                    chars[i] = (char)(chars[i] + 'a' - 'A');  // Convert into Lowercase
            }
            strings = strings + chars[i];
        }

        return strings;
    }

    /**
     * Counts the number of vowels in a string.
     *
     * @param str The input string
     * @return The number of vowels
     */
    public long countVowels(String str) {
        //TODO
        int count = 0;
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (aChar == 'a' || aChar == 'e' || aChar == 'i' || aChar == 'o' || aChar == 'u') {
                count += 1;
            }
        }
        return count;
    }

    /**
     * Removes a certain letter from a string
     *
     * @param str The input string
     * @param a   The letter to remove
     * @return The input string without the specified letter
     */
    public String removeLetter(String str, char a) {
        //TODO
        String strings = "";
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (aChar != a)
                strings = strings + aChar;
        }
        return strings;
    }

    /**
     * Checks if a string is a palindrome
     *
     * @param str The string to check
     * @return Whether or not the string is a palindrome
     */
    public boolean isPalindrome(String str) {
        //TODO
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            if (chars[i] != chars[(chars.length - 1) - i]) {
                return false;
            }
        }
        return true;
    }
}
