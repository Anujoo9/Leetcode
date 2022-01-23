package Questions;
public class Q_867_TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
      int[][] res=  transpose(arr);
      for(int[] arr2D : res){
          for(int arr1D : arr2D ){
              System.out.print(arr1D + " ");
          }System.out.println();
      }
    }
    public static int[][] transpose(int[][] arr){
        int[][] res = new int [arr[0].length][ arr.length];
        for(int row = 0; row<arr.length;row++){
            for(int col = 0 ; col <arr[0].length;col++){
                int temp = arr[row][col];
                arr[row][col] = res[col][row];
                res[col][row] = temp;
            }     
    }
    return res;
}
}