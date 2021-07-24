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

class CircularLinkedList
{
private Node tail = null;
public void insertAtBegining(int data)
{
Node newNode = getNewNode(data);
if(tail==null)
{
tail=newNode;
newNode.setNext(tail);
}
Node temp = tail.getNext();
tail.setNext(newNode);
newNode.setNext(temp);
}
public void insertAtEnd(int data)
{
Node newNode = getNewNode(data);
if(tail==null)
{
tail=newNode;
newNode.setNext(tail);
}
Node temp=tail.getNext();
tail.setNext(newNode);
newNode.setNext(temp);
tail=newNode;
}
public void insertAtPosition(int data, int position)
{
Node newNode = getNewNode(data);
if(tail==null)
{
tail=newNode;
newNode.setNext(tail);
}
Node temp = tail;
for(int x=1; x<position; x++)
{
temp = temp.getNext();
}
Node temp2 = temp.getNext();
temp.setNext(newNode);
newNode.setNext(temp2);
if(temp==tail && position!=1) tail=tail.getNext();
}
private Node getNewNode(int data)
{
Node newNode = new Node();
newNode.setData(data);
newNode.setNext(null);
return newNode;
}
public void printElements()
{
Node temp = tail.getNext();
do
{
System.out.print(temp.getData()+"\t");
temp=temp.getNext();
}while(temp!=tail.getNext());
System.out.println();
}
public void delete(int position)
{
Node temp = tail;
if(tail.getNext()==tail && position==1) 
{
tail=null;
return;
}
for(int x=1; x<position; x++)
{
temp=temp.getNext();
}
Node nextNode = temp.getNext();
if(nextNode==tail) tail=temp;
temp.setNext(nextNode.getNext());
}
}

class MainExecutor
{
public static void main(String gg[])
{
CircularLinkedList circularLinkedList = new CircularLinkedList();
circularLinkedList.insertAtBegining(2);
circularLinkedList.printElements();
circularLinkedList.insertAtBegining(3);
circularLinkedList.printElements();
circularLinkedList.insertAtBegining(5);
circularLinkedList.printElements();
circularLinkedList.insertAtBegining(8);
circularLinkedList.printElements();
System.out.println("------------------------------------");
circularLinkedList = new CircularLinkedList();
circularLinkedList.insertAtEnd(2);
circularLinkedList.printElements();
circularLinkedList.insertAtEnd(3);
circularLinkedList.printElements();
circularLinkedList.insertAtEnd(5);
circularLinkedList.printElements();
circularLinkedList.insertAtEnd(8);
circularLinkedList.printElements();
System.out.println("------------------------------------");
circularLinkedList = new CircularLinkedList();
circularLinkedList.insertAtPosition(2,1);
circularLinkedList.printElements();	//2
circularLinkedList.insertAtPosition(3,1);
circularLinkedList.printElements();	//3 2
circularLinkedList.insertAtPosition(5,2);
circularLinkedList.printElements();	//3 5 2
circularLinkedList.insertAtPosition(8,3);
circularLinkedList.printElements();	//3 5 8 2
System.out.println("------------------------------------");
circularLinkedList = new CircularLinkedList();
circularLinkedList.insertAtEnd(7);
circularLinkedList.insertAtEnd(1);
circularLinkedList.insertAtEnd(3);
circularLinkedList.insertAtEnd(2);
circularLinkedList.insertAtEnd(8);
circularLinkedList.insertAtEnd(9);
circularLinkedList.insertAtEnd(14);
circularLinkedList.insertAtEnd(6);
circularLinkedList.insertAtEnd(7);
circularLinkedList.printElements();	//7 1 3 2 8 9 14 6 7
circularLinkedList.delete(1);
circularLinkedList.printElements();	//1 3 2 8 9 14 6 7
circularLinkedList.delete(8);
circularLinkedList.printElements();	//1 3 2 8 9 14 6
circularLinkedList.delete(3);
circularLinkedList.printElements();	//1 3 8 9 14 6
}
}