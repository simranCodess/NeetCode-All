public class ValidPalindrome {
    public boolean isPalindrome(String s){
       StringBuilder newstr=new StringBuilder();
        for(int i=0; i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))||Character.isDigit(s.charAt(i))){
                newstr.append(s.charAt(i));
            }
        }
        StringBuilder newstrrev= new StringBuilder();
        newstrrev.append(newstr);
        newstrrev.reverse();
        if(newstrrev.toString().toLowerCase().equals(newstr.toString().toLowerCase())){
            return true;
        }
        return false;
    }
}
