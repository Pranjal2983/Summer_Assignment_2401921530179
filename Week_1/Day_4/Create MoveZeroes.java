class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        for(int i =0;i<n;i++){
            int x =0;
            for (int j = 0; j <n-1-i; j++) {
                if(arr[j]==0){
                    arr[j] = arr[j]^arr[j+1];
                    arr[j+1] = arr[j]^arr[j+1];
                    arr[j] = arr[j]^arr[j+1];
                    x=1;
                }
            }
            if(x==0) break;
        }
    }
}
