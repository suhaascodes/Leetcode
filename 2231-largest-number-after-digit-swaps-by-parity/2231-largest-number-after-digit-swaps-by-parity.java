class Solution {
    public int largestInteger(int num) {
        int temp = num;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        while (num>0) {
            int digit = num%10;
            if (digit%2 == 0) even.add(digit);
            else odd.add(digit);
            num/=10;
        }
        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());
        String s = String.valueOf(temp);
        int o = 0, e = 0, ans = 0;
        for (int i=0; i<s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit % 2 ==0) {
                ans = (ans*10) + even.get(e++);
            } else {
                ans = (ans*10) + odd.get(o++);
            }
        }
        return ans;
    }
}