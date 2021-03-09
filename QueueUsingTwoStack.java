import java.io.*;
import java.util.*;

public class Solution {
    
    public static void enque(Stack<Integer> stack1, int val)
    {
        stack1.push(val);
    }
 
    public static void deque(Stack<Integer> stack1, Stack<Integer> stack2)
    {
        int x=0;
        /* If both stacks are empty then error */
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Q is empty");
            System.exit(0);
        }
        /* Move elements from stack1 to stack 2 only if
        stack2 is empty */
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                x = stack1.pop();
                stack2.push(x);
            }
        }
        x = stack2.pop();    
    }
    
    public static void print(Stack<Integer> stack1, Stack<Integer> stack2)
    {
            int x=0;
        /* If both stacks are empty then error */
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Q is empty");
            System.exit(0);
        }
        /* Move elements from stack1 to stack 2 only if
        stack2 is empty */
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                x = stack1.pop();
                stack2.push(x);
            }
        }
        x = stack2.peek(); 
        System.out.println(x); 
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int queries=obj.nextInt();
        while(queries>0)
        {
            int option=obj.nextInt();
            switch(option)
            {
                case 1:
                    int val=obj.nextInt();
                    enque(stack1,val);
                break;
                case 2:
                    deque(stack1,stack2);
                break;
                case 3:
                    print(stack1,stack2);
                break;
            }
            queries--;
        }
    }
}