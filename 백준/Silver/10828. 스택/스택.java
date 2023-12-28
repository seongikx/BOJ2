import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder string = new StringBuilder();

        int a = Integer.parseInt(sc.readLine()); //스택 size
        stack = new int[a];

        for(int c=0;c<a;c++){
            st = new StringTokenizer(sc.readLine(), " ");
            switch(st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    string.append(pop()).append('\n');
                    break;
                case "empty":
                    string.append(empty()).append('\n');
                    break;
                case "size":
                    string.append(size()).append('\n');
                    break;
                case "top":
                    string.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(string);
    }
    public static void push(int b){
    stack[size] = b;
    size++;
    }

    public static int pop(){
        if(size==0){
            return -1;
        }else {
            int res = stack[size - 1];
            stack[size-1]  = 0;
            size --;
            return res;
        }
    }

    public static int size(){
        return size;
    }
    public static int empty(){
        if(size==0){
            return 1;
        }else{
            return 0;
        }
    }
    public static int top(){
        if(size==0){
            return -1;
        }else{
            return stack[size-1];
        }
    }
}
