class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        String word = "balloon";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch:text.toCharArray()) {
            if (word.indexOf(ch) != -1) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        int count = Integer.MAX_VALUE;
        for (char ch:word.toCharArray()) {
            if (map.get(ch) == null) return 0;
            if (ch == 'l' || ch == 'o') {
                count = Math.min(count, map.get(ch) / 2);
            } else {
                count = Math.min(count, map.get(ch));
            }
        }
        return count;
    }
}