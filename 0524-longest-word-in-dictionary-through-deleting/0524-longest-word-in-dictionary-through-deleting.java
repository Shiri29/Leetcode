class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String longestWord = "";

        for (String currentWord : dictionary) {
            int stringPointer = 0;
            int wordPointer = 0;
            int currentWordLength = currentWord.length();
            int longestWordLength = longestWord.length();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(stringPointer) == currentWord.charAt(wordPointer)) {
                    wordPointer++;
                }

                stringPointer++;

                if (wordPointer == currentWordLength) {
                    if (currentWordLength > longestWordLength
                            || (currentWordLength == longestWordLength && currentWord.compareTo(longestWord) < 0)) {
                        longestWord = currentWord;
                    }

                    break;
                }
            }
        }

        return longestWord;
    }
}