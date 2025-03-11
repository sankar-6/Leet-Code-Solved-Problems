class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            if(arr[i]-arr[i+1]!=arr[i+1]-arr[i+2]){
                return false;
            }
        }
        return true;
    }
}
