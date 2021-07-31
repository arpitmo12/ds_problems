class Stack
{
private static int top = -1;
private static int MAX_SIZE = 10;
private static int arr[] = new int[MAX_SIZE];
public void push(int x)
{
arr[++top] = x;
}
public void print()
{
System.out.print("Stack: ");
for(int x=0; x<=top; x++)
{
System.out.print(arr[x]+"\t");
}
System.out.println();
}
public void pop()
{
top--;
}
}

class MainExecutor
{
public static void main(String gg[])
{
Stack s = new Stack();
s.push(10); s.print();
s.push(5); s.print();
s.push(17); s.print();
s.pop(); s.print();
s.push(23); s.print();
}
}
