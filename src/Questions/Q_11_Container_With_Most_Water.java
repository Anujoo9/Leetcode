package Questions;

public class Q_11_Container_With_Most_Water {
    public static void main(String[] args) {
        Q_11_Container_With_Most_Water obj = new Q_11_Container_With_Most_Water();
        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(arr));
    }
    public int maxArea(int [] arr){
        int area = Integer.MIN_VALUE;

        int left = 0 ; 
        int right = arr.length -1;
        while(left < right){
            int min_h = Math.min(arr[left], arr[right]);
            area = Math.max(area, min_h*(right-left));

            if(arr[left] > arr[right]){
                right--;
            }else{
                left++;
            }
        }
        return area;
        
    }
}
