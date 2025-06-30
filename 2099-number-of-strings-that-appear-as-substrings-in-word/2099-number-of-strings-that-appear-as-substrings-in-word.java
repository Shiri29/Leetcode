class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int counter = 0;

        for (String pat : patterns) {
            if (word.contains(pat)) {
                counter += 1;
            }
        }
        return counter;
    }
}