class Solution {
    public int missingNumber(int[] a) {
        int n=a.length;
        int b = n * (n + 1) / 2;
        int actualsum=0;
        for (int c:a){
            actualsum+=c;
        }
        return b-actualsum;

        
    }
}