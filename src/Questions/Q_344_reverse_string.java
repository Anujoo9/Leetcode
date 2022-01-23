package Questions;
public class Q_344_reverse_string {
    public static void main(String[] args) {
        char a[] ={'a','n','u','j'};
        for(int val :a){
            System.out.print(val);
        }System.out.print('\n');
       reverse(a);
        for(int i = 0 ; i<a.length;i++){
            System.out.print(a[i]+ " " );
        }
    }
    public static void reverse(char a[]){
        char[] res = new char[a.length];
        int x =0;
        for(int i = a.length-1;i>=0;i--){
                res[x] = a[i];
                x++;
        }
        x=0;
        for(int i = 0;i<a.length;i++){
            a[i] = res[i];
    }
    }
}
