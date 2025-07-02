class Solution {
    int index = 0;

    public String decodeStr(String s) {
        StringBuilder curr = new StringBuilder();
        while (index < s.length() && s.charAt(index) != ']') {
            char ch = s.charAt(index);
            int repeat = 0;
            if (Character.isDigit(ch)) {
                while (index < s.length() && Character.isDigit(s.charAt(index))) {
                    repeat = (repeat * 10) + (s.charAt(index) - '0');
                    index++;
                }
                index++; // skip '['
                String a = decodeStr(s);
                index++; // skip ']'
                curr.append(a.repeat(repeat));
            } else {
                curr.append(ch);
                index++;
            }
        }
        return curr.toString();
    }

    public String decodeString(String s) {
        return decodeStr(s);
    }
}