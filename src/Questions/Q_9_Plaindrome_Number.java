package Questions;
public class Q_9_Plaindrome_Number {
    public static void main(String[] args) {
       
    }
    public static boolean isPalindrome(int x) {
        if(x<0){
        }
        int r = rev(x);
        return r ==x;  
        }
    public static int rev(int val){
        int sum = 0;
        int mul = 10;
        while(val!=0){
            int rem = val % 10;
            sum = sum*mul+ rem;
            val/=10;
        }
        return sum;
    }
        
    }
    

