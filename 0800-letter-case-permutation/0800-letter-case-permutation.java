class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        backtrack(list,s,0,new StringBuilder());
        return list;

    }
    static void backtrack(List<String> list,String s,int index,StringBuilder current){
        if(index == s.length()){
            list.add(current.toString());
            return;
        }
        char c = s.charAt(index);
        current.append(c);
        backtrack(list,s,index+1,current);
        current.deleteCharAt(current.length() -1);

        if(Character.isLetter(c)){
            char c1 = Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
            current.append(c1);
            backtrack(list,s,index+1,current);
            current.deleteCharAt(current.length() -1);
        }
    }
}