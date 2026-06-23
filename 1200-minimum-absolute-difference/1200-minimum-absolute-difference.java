class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i=0; i<n-1; i++) {
            int diff = Math.abs(arr[i+1] - arr[i]);
            minDiff = Math.min(diff, minDiff);
        }
        for (int i=0; i<n-1; i++) {
            if (arr[i+1] - arr[i] == minDiff) {
                res.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return res;
    }
}