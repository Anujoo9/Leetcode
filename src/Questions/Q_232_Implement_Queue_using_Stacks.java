package Questions;
import java.util.*;
public class Q_232_Implement_Queue_using_Stacks {
    
    class MyQueue {
        Stack<Integer> mainS;
        Stack<Integer> helperS;
    
        public MyQueue() {
            mainS = new Stack<>();
          helperS = new Stack<>();
        }
        
        public void push(int x) {
             mainS.push(x);
        }
        
        public int pop() {
              if(mainS.size()==0){
               System.out.println("Queue underflow");
               return -1;
           }else{
               while(mainS.size() > 1){
                   helperS.push(mainS.pop());
               }
               int val = mainS.pop();
               while(helperS.size() !=0){
                   mainS.push(helperS.pop());
               }
               return val;
           }
            
        }
        
        public int peek() {
             if(mainS.size()==0){
                System.out.println("Queue underflow");
                return -1;
            }else{
                while(mainS.size() > 1){
                    helperS.push(mainS.pop());
                }
                int val = mainS.pop();
                helperS.push(val);
                while(helperS.size() !=0){
                    mainS.push(helperS.pop());
                }
                return val;
            }
            
        }
        
        public boolean empty() {
            return mainS.isEmpty();
             // return value.isEmpty();
            
        }
    }
    
    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
}
