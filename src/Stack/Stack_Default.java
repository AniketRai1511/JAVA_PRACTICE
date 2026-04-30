package Stack;

import java.util.Stack;

public class Stack_Default {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);

        while(!stack.isEmpty()){
            int element=stack.pop();
            System.out.print(element + " ");
        }  // note that stack will become empty after this loop
    }
}
