package Questions;
import java.util.*;
public class Q_844_Backspace_String_Compare {
    public static void main(String[] args) {
        Q_844_Backspace_String_Compare obj = new Q_844_Backspace_String_Compare();
        System.out.println(obj.backspaceCompare( "ab#c","ad#c"));
        System.out.println(obj.backspaceCompare_( "ab#c","ad#c"));
    }
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> st1= new Stack<>();
        Stack<Character> st2= new Stack<>();
        
        for(int i = 0 ; i< s.length() ; i++){
            char c1 = s.charAt(i);
            if(c1 != '#' ){
                st1.push(c1);
            }else  if (!st1.isEmpty() && c1 == '#' ) {st1.pop();};
            }
        for(int i = 0 ; i<t.length() ; i++){
            char c2 = t.charAt(i);
            if(c2 != '#' ){
                st2.push(c2);
            }else  if (!st2.isEmpty() && c2 == '#' ) {st2.pop();};
        }
        String s1 = "";
        String t1 = "";
        while(!st1.isEmpty()){
          s1 +=st1.pop()  ;
        }
        while(!st2.isEmpty()){
          
        t1 += st2.pop();
            }
        return s1.equals(t1);
        }
    
    
    public boolean backspaceCompare_(String s, String t) {
            return res(s).equals(res(t));
        }
    public String res(String str){
            int count = 0;
            String ans = "";
            for(int i = str.length()-1 ; i>=0 ; i--){
                char c = str.charAt(i);
                if(c =='#'){
                    count ++;
                }
                else if(count == 0){
                    ans += c;
                }
                else{
                    count--;
                }
                }
                return ans;
            }
        }

