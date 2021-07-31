class Node
{
private int data;
private Node next;
public void setData(int data)
{
this.data=data;
}
public int getData()
{
return this.data;
}
public void setNext(Node next)
{
this.next=next;
}
public Node getNext()
{
return this.next;
}
}

class Stack
{
private static Node top = null;
private Node getNewNode(int data)
{
Node node = new Node();
node.setData(data);
node.setNext(null);
return node;
}
public void push(int x)
{
Node newNode = getNewNode(x);
if(top==null) 
{
top=newNode;
return;
}
newNode.setNext(top);
top=newNode;
}
public void pop()
{
if(isEmpty())
{
System.out.println("Stack is empty...");
return;
}
top=top.getNext();
}
public int top()
{
return top.getData();
}
public boolean isEmpty()
{
return top==null;
}
public void print()
{
Node temp = top;
System.out.print("Stack: ");
while(temp!=null)
{
System.out.print(temp.getData()+"\t");
temp=temp.getNext();
}
System.out.println();
}
}
class MainExecutor
{
public static void main(String gg[])
{
Stack s = new Stack();
s.push(21); s.print();
s.push(58); s.print();
s.push(99); s.print();
s.pop(); s.print();
s.push(72); s.print();
}
}
