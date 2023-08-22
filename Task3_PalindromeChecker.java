public class Task3_PalindromeChecker {
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "hello";

        System.out.println(str1 + " является палиндромом: " + isPalindrome(str1));
        System.out.println(str2 + " является палиндромом: " + isPalindrome(str2));
    }

    public static boolean isPalindrome(String str) {
        // В условии не было сказано про регистр, поэтому его не учитывал
        //str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;  // Если символы не совпадают, строка не является палиндромом
            }
        }
        return true;  // Если цикл завершился без возврата из-за несовпадающих символов, строка является палиндромом
    }
}
