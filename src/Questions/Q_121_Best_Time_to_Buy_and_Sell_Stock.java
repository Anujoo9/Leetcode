package Questions;

public class Q_121_Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(Best_Time(arr));
    }
    public static int Best_Time(int[] arr){
        int result = 0 ;
        int min = arr[0] ;
        for(int i = 1 ;i<arr.length;i++){
            result =Math.max(result ,arr[i] - min );
            min = Math.min(min,arr[i]);
        }
        return result;
    }
    
}
