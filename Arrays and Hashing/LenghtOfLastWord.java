public class LenghtOfLastWord{

    public int lengthOfLastWord(String s) {
        int desiredIndex = 0;
        int desired = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isDigit(s.charAt(i)) || Character.isAlphabetic(s.charAt(i))) {
                desiredIndex = i;
                break; // Added a break statement to exit the loop once desired index is found
            }
        }
        for (int i = desiredIndex; i >= 0; i--) {
            if (Character.isDigit(s.charAt(i)) || Character.isAlphabetic(s.charAt(i))) {
                desired++;
            } else {
                break;
            }
        }
        return desired;
    }

}
