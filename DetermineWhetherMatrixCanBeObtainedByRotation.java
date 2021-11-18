class DetermineWhetherMatrixCanBeObtainedByRotation {
    public static int[][] rotateOnce(int[][] matrix){
     int length=matrix.length;
        
        for(int i=0;i<length;i++)
        {
            for(int j=i;j<length;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        
        for(int i=0;i<length;i++)
        {
            for(int j=0;j<(length/2);j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][length-1-j];
                matrix[i][length-1-j]=temp;
            }
        }
        return matrix;
    }

    
    public boolean findRotation(int[][] mat, int[][] target) {

    int length=mat.length;
        boolean flag = true;
        for(int k=0;k<4;k++)
        {
             rotateOnce(mat);
           
             flag=true;
             for(int i = 0; i < length; i++){    
                for(int j = 0; j < length; j++){    
                  if(mat[i][j] != target[i][j]){   
                      flag=false;
                      break;       
                  }    
                }
             }
            
            if(flag==true)
            {
                return true;
            }     
        }
        return flag;
    }
}