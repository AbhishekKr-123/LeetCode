class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> s2t = new HashMap<>();
        HashMap<Character, Character> t2s = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if(s2t.containsKey(charS)){
                if(s2t.get(charS) != charT){
                    return false;
                }
            } else{
                s2t.put(charS, charT);
            }

            if(t2s.containsKey(charT)){
                if(t2s.get(charT) != charS){
                    return false;
                }
            } else{
                t2s.put(charT, charS);
            }
        }
        return true;
    }
}