package Questions;

public class Q_189_Rotate_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k =4;
        for(int val : arr){
            System.out.print(val + " ");
        }
        rotate(arr,k);
        System.out.println();
        System.out.println("Answer");
        for(int val : arr){
            System.out.print(val+ " ");
        }
    }
    public static void rotate(int[] arr, int k){
        if(k>=arr.length){
            k=k%arr.length;
        }
        int[] narr = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            int x = arr.length - k;
            x = (x + i)% arr.length;
            narr[i] = arr[x];
                }
        for(int i = 0; i < arr.length ; i++){
            arr[i] = narr[i];
        }
    }
}
