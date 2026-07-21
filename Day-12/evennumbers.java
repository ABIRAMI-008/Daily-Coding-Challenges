class Solution {
    public int findNumbers(int[] a) {
        int count=0;
        for(int b:a){
            int c=0;
            int n=b;
            while(n>0){
                n/=10;
                c=c+1;
            }
            if(c%2==0){
                count++;
            }
        }
    return count;
        
    }
}