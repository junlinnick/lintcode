package DP;

public class triangle1 {

	 public int minimumTotal(int[][] triangle) {
	        // write your code here
	        if(triangle == null || triangle.length == 0 || triangle[0].length == 0){
	            return 0;
	        }
	        int n = triangle.length;
	        int [][] f = new int[n][n];
	         f[0][0] = triangle[0][0];
	         for(int i = 1; i < n; i++){
	             f[i][0] = f[i-1][0] + triangle[i][0];
	              f[i][i] = f[i-1][i-1] + triangle[i][i];
	         }
	         for(int i = 1; i < n; i ++){
	             for(int j = 1; j < i; j ++){
	                 f[i][j] = triangle[i][j] + Math.min(f[i-1][j-1],f[i-1][j]);
	             }
	         }
	         int min = f[n-1][0];
	         for(int i = 0; i < n; i++){
	             min = Math.min(min,f[n-1][i]);
	         }
	         return min;
	        
	    }

}
