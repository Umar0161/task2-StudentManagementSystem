import java.util.*;
public class stackCollection {
    // stack using stack
    // public static void main(String[] args) {
    //     Stack<Integer> s = new Stack<>();
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);
    //     s.push(4);
    //     while(!s.isEmpty())
    //     {
    //         System.out.println(s.peek());
    //         s.pop();
    //     }
    // }
    // Now push in bottom of stack
public static void pushATBottom(int data,Stack<Integer>s)
{
    if(s.isEmpty())
    {
        s.push(data);
        return;
    }
    int top=s.pop();
    pushATBottom(data, s);
    s.push(top);
}
     public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushATBottom(4,s);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
