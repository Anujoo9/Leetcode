package Questions;

public class Q_566_Reshape_The_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        int r = 1, c = 4;
        int[][] arr1 = reshape(arr,r,c);
        for(int[] val: arr1){
            for(int x : val){
                System.out.print(x+" ");
            }System.out.println();
        }
    }
    public static int[][] reshape(int[][] arr, int r,int c){
        int a = arr.length, b =arr[0].length;
        if(r*c != a*b){
            return arr;
        }
        int[][] ans = new int[r][c];
        for(int i =0 ; i<r*c;i++){
            ans[i/c][i%c] = arr[i/b][i%b];
        }
        return ans;
    }
}
