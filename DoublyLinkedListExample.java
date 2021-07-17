class Node
{
private int data;
private Node next;
private Node prev;

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
public void setPrev(Node prev)
{
this.prev=prev;
}
public Node getPrev()
{
return this.prev;
}
}

class DoublyLinkedList
{
private Node head = null;
private Node getNewNode(int data)
{
Node node = new Node();
node.setData(data);
node.setNext(null);
node.setPrev(null);
return node;
}
public void insertAtBegining(int data)
{
Node newNode = getNewNode(data);
if(head==null)
{
head=newNode;
return;
}
newNode.setNext(head);
head.setPrev(newNode);
head=newNode;
}
public void print()
{
Node temp = head;
System.out.print("Forward: ");
while(temp!=null)
{
System.out.print(temp.getData()+"\t");
temp=temp.getNext();
}
System.out.println();
}
public void reversePrint()
{
Node temp = head;
while(temp.getNext()!=null)
{
temp=temp.getNext();
}
System.out.print("Reverse: ");
while(temp!=null)
{
System.out.print(temp.getData()+"\t");
temp=temp.getPrev();
}
System.out.println();
}
}

class MainExecutor
{
public static void main(String gg[])
{
DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
doublyLinkedList.insertAtBegining(2);
doublyLinkedList.print();
doublyLinkedList.reversePrint();

doublyLinkedList.insertAtBegining(3);
doublyLinkedList.print();
doublyLinkedList.reversePrint();

doublyLinkedList.insertAtBegining(7);
doublyLinkedList.print();
doublyLinkedList.reversePrint();
}
}