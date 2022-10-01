package Questions;
import java.util.*;
public class Q_46_Permutaions {
    
    public static void main(String[] args) {
    //    int[] str  = {1,2,3};
       List<Integer> str = new ArrayList<>();
       str.add(1);
       str.add(2);
       str.add(3);
        print_permuation(str,"");
    }
    public static void print_permuation(List<Integer> str , String ans){
        if(str.size()==0){
            System.out.println();
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i<str.size();i++){
            int ch = str.get(i);
            // String ros = str.replace(ch, '');// won't work
        //    int[] ros = str.substring(0,i) + str.substring(i+1);//rest of String
               str.remove(ch);
               for(Integer val : str){
                   System.out.print(val+ " ");
               }
            print_permuation(str, ans+ch);
            
        }
    }
    
}

    

