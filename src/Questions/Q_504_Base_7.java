package Questions;

public class Q_504_Base_7 {
   public static class Solution {
        public String convertToBase7(int num) {
           int sum = 0;
             int mul =1;
            int x =7;
            while(num!=0){
                int rem = num%x;
                sum= sum + rem*mul;
                mul*=10;
                num/=x;
            }
            String a =""+sum;
           return a; 
        }
        public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println( s.convertToBase7(34));

        }
    }
}
