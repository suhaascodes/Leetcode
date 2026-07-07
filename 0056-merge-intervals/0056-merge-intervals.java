class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n == 1) return intervals;
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int[] curr = intervals[0];
        for (int i=1; i<n; i++) {
            if (intervals[i][0] <= curr[1]) {
                curr[1] = Math.max(curr[1], intervals[i][1]);
            } else {
                ans.add(curr);
                curr = intervals[i];
            }
        }
        ans.add(curr);
        int[][] merged = ans.toArray(new int[ans.size()][]);
        return merged;
    }
}