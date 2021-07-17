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

public void insertAtEnd(int data)
{
Node newNode = getNewNode(data);
if(head==null)
{
head=newNode;
return;
}
Node temp = head;
while(temp.getNext()!=null)
{
temp=temp.getNext();
}
temp.setNext(newNode);
newNode.setPrev(temp);
}

public void insertAtPosition(int data, int position)
{
Node newNode = getNewNode(data);
if(head==null)
{
head=newNode;
return;
}
if(position==1)
{
newNode.setNext(head);
head.setPrev(newNode);
head=newNode;
return;
}

Node temp = head;
int currentPosition = 1;
while(currentPosition<position-1)
{
temp=temp.getNext();
currentPosition++;
}
Node nextNode = temp.getNext();

temp.setNext(newNode);
newNode.setPrev(temp);

if(nextNode!=null)
{
newNode.setNext(nextNode);
nextNode.setPrev(newNode);
}
}

public void deleteNthNode(int position)
{
Node temp = head;
if(position==1)
{
head.getNext().setPrev(null);
head=head.getNext();
return;
}

int currentPosition=1;
while(currentPosition<position-1)
{
temp=temp.getNext();
currentPosition++;
}

Node nodeToDelete = temp.getNext();
temp.setNext(nodeToDelete.getNext());
if(nodeToDelete.getNext()!=null)
{
nodeToDelete.getNext().setPrev(temp);
}

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

System.out.println("============================");


doublyLinkedList = new DoublyLinkedList();
doublyLinkedList.insertAtEnd(2);
doublyLinkedList.print();
doublyLinkedList.reversePrint();

doublyLinkedList.insertAtEnd(3);
doublyLinkedList.print();
doublyLinkedList.reversePrint();

doublyLinkedList.insertAtEnd(7);
doublyLinkedList.print();
doublyLinkedList.reversePrint();

System.out.println("============================");

doublyLinkedList = new DoublyLinkedList();
doublyLinkedList.insertAtPosition(2,1);
doublyLinkedList.print();

doublyLinkedList.insertAtPosition(3,2);
doublyLinkedList.print();

doublyLinkedList.insertAtPosition(7,1);
doublyLinkedList.print();

doublyLinkedList.insertAtPosition(8,2);
doublyLinkedList.print();

System.out.println("============================");

doublyLinkedList = new DoublyLinkedList();
doublyLinkedList.insertAtPosition(2,1);
doublyLinkedList.print();

doublyLinkedList.insertAtPosition(3,2);
doublyLinkedList.print();

doublyLinkedList.insertAtPosition(7,1);
doublyLinkedList.print();

doublyLinkedList.insertAtPosition(8,2);
doublyLinkedList.print();

doublyLinkedList.insertAtPosition(111,2);
doublyLinkedList.print();

doublyLinkedList.insertAtPosition(75,2);
doublyLinkedList.print();

doublyLinkedList.insertAtPosition(21,2);
doublyLinkedList.print();

System.out.println("Delete part: ");
doublyLinkedList.deleteNthNode(1);//correct
doublyLinkedList.print();
doublyLinkedList.deleteNthNode(3);
doublyLinkedList.print();
doublyLinkedList.deleteNthNode(5);
doublyLinkedList.print();
}
}