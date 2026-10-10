class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();

        for (int i = 0; i < s.length(); i++){

            char c = s.charAt(i); 

            if(Character.isLetterOrDigit(c)){
                filtered.append(Character.toLowerCase(c));
            }
        }
        String cleaned = filtered.toString();

        for (int i = 0; i < cleaned.length(); i++) {
            if (cleaned.charAt(i) !=    cleaned.charAt(cleaned.length() - 1 - i)) {
                return false;
            }

        

        
    }
    return true;
    }
}
