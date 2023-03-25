class Solution {
    public void setZeroes(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
    return;
  }
    int m = matrix.length;
    int n = matrix[0].length;
   
     
    
    for (int i=0; i<m; i++){
        for(int j=0; j<n; j++){
           if(matrix[i][j]==0){
                    for(int k=0; k<m; k++){
                         if (matrix[k][j] != 0)
                         matrix[k][j]=-12345;
                    }
                    for(int k=0; k<n;k++){
                        if (matrix[i][k] != 0)
                            matrix[i][k]=-12345;    
                    }
                }
            }
    }
            for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
               if (matrix[i][j]==-12345){
                    matrix[i][j]=0;
               }
        }
    }
    }
    }









//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                 if (matrix[i][j]==0){

//                     for(int k=0; k<matrix.length; k++){
//                         matrix[k][j]=0;
//                     }
//                     break;
//                 }
//             for(int j=0; j<matrix[0].length; j++){
//             for(int i=0; i<matrix.length; i++){
//                 if (matrix[i][j]==0){
//                     for(int k=0; k<matrix[0].length; k++){
//                         matrix[i][k]=0;
//                     }
//                     break;
//         }
//     }
//             }
//     }
// }


