class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuilder result = new  StringBuilder();
        for(int i = words.length - 1; i >= 0; i--) {  //loop that goes from last word to first
            result.append(words[i]);
            if(i != 0)
                result.append(" ");
        }
        return result.toString().trim();
    }
}     
