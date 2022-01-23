package Questions;
import java.util.*;
public class Q_54_SpiralMatrix {
    public static void main(String[] args) {
        int [][] arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> l1 = new ArrayList<Integer>();
        l1=spiral(arr);
        System.out.println(l1);
    }
   public static List<Integer> spiral(int [][] arr){
    List<Integer> l2 = new ArrayList<Integer>();
    int minr = 0 ;
    int minc = 0;
    int maxr = arr.length-1;
    int maxc = arr[0].length-1;
    int total = arr.length*arr[0].length;
    int count = 0;
    while(count<total){
        for(int c = minc ; c<=maxc && count<total;c++){
            l2.add(arr[minr][c]);
            count++;
        }minr++;
        for(int r = minr ; r<=maxr && count<total;r++){
            l2.add(arr[r][maxc]);
            count++;
        }maxc--;
        for(int c = maxc ; c>=minc && count<total;c--){
            l2.add(arr[maxr][c]);
            count++;
        }maxr--;
        for(int r= maxr ; r>=minr && count<total;r--){
            l2.add(arr[r][minc]);
            count++;
        }minc++;
        
    }
    return l2;
   }

    
}
