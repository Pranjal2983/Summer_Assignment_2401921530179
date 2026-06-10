class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans= new ArrayList<>();
        int m = arr.length,n= arr[0].length;
        int minR=0,maxR=m-1,maxC=n-1,minC=0;
        while(minR<=maxR && minC<=maxC){
            for(int i =minC ;i<=maxC;i++){
                ans.add(arr[minR][i]);
            }
            minR++;
            if(minR > maxR || minC>maxC ) break;
            for (int j = minR ; j <= maxR ; j++) {
                ans.add(arr[j][maxC]);
            }
            maxC--;
            if(minR > maxR || minC>maxC ) break;
            for (int i = maxC ; i >= minC; i--) {
                ans.add(arr[maxR][i]);
            }
            
            maxR--;
            if(minR > maxR || minC>maxC ) break;
            for (int j = maxR; j >=minR ; j--) {
                ans.add(arr[j][minC]);
            }
            minC++;
            
        }
        return ans;    
    }
}
