class Stack
{
private static int top = -1;
private static int MAX_SIZE = 2;
private static Object[] arr = new Object[MAX_SIZE];
public void push(Object x)
{
if(top==MAX_SIZE-1) 
{
System.out.println("Creating new stack of double the size...");	//Just for debugging purpose
Object[] arr2 = new Object[MAX_SIZE*2];
for(int i=0; i<=top; i++) arr2[i]=arr[i];
arr=arr2;
}
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
if(isEmpty()) 
{
System.out.println("Error. Stack empty!!!");
return;
}
top--;
}
public boolean isEmpty()
{
return top==-1;
}
public Object top()
{
return arr[top];
}
}

class MainExecutor
{
public static void main(String gg[])
{
Stack s = new Stack();
s.push("Amit"); s.print();
s.push("Shreya"); s.print();
s.push("Pinku"); s.print();
s.pop(); s.print();
s.push("Radhe"); s.print();
}
}
