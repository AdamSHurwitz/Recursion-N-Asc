/**
 * Created by adamhurwitz on 3/10/16.
 */
public class JavaClass {
    static int n = 18;
    public static void main(String arg[]){
        nAsc(n);
    }
    public static void nAsc(int n){
        if(n == -1){
            return;
        }
        nAsc(n - 1);
        System.out.println(n);
    }
}
