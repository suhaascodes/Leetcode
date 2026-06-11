class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> res = new ArrayList<>();
        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM";
        for (String word:words) {
            boolean r1=true, r2=true, r3=true;
            for(char ch:word.toCharArray()) {
                r1 &= s1.indexOf(ch) != -1;
                r2 &= s2.indexOf(ch) != -1;
                r3 &= s3.indexOf(ch) != -1;
            }
            if (r1 || r2 || r3) {
                res.add(word);
            }
        }
        return res.toArray(String[]::new);
    }
}