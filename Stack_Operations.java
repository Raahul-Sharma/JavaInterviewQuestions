public class Stack_Operations {
    int arr[] = new int[10];
    int top = 0;

    private boolean push(int x){
        top++;
        arr[top] = x;
        System.out.println("Element to be pushed in stack = " + x);
        return true;
    }

    private int pop(){
        int x = arr[top--];
        System.out.println("Element to be poped from stack = " + x);
        return x;
    }

    private int peek(){
        System.out.println("Top most value in stack = " + arr[top]);
        return arr[top];
    }

    public static void main(String[] args) {
        Stack_Operations stck = new Stack_Operations();
        stck.push(10);
        stck.push(20);
        stck.push(30);
        stck.pop();
        stck.peek();
    }
}
