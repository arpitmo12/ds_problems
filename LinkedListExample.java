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

class LinkedList
{
private Node head = null;
public void insertAtBegining(int data)
{
Node newNode = createNewNode(data);
if(head==null)
{
head=newNode;
return;
}
newNode.setNext(head);
head=newNode;
}

private Node createNewNode(int data)
{
Node node = new Node();
node.setData(data);
node.setNext(null);
return node;
}

public void printLinkedList()
{
Node temp = head;
while(temp!=null)
{
System.out.print(temp.getData()+"\t");
temp=temp.getNext();
}
System.out.println();
}

public void insertAtEnd(int data)
{
Node newNode = createNewNode(data);
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
}

public void insertAtNthPosition(int data, int position)
{
if((head==null && position!=1) || position<=0)
{
System.out.println("Invalid position");
return;
}
Node newNode = createNewNode(data);
if(head==null)
{
head=newNode;
return;
}

Node temp = head;

int currentPosition=1;
while(currentPosition<position-1)
{
if(temp==null)
{
System.out.println("Invalid position");
return;
}
temp=temp.getNext();
currentPosition++;
}

if(position==1)
{
newNode.setNext(temp);
head=newNode;
return;
}
else
{
newNode.setNext(temp.getNext());
temp.setNext(newNode);
}
}

public void deleteAtNthPosition(int position)
{
Node temp = head;
if(position==1)
{
head=head.getNext();
return;
}
for(int i=1; i<position-1; i++)
{
if(temp==null)
{
System.out.println("Invalid position");
return;
}
temp=temp.getNext();
}
temp.setNext(temp.getNext().getNext());
}

public void reverseLinkedListIterative()
{
Node prev = null;
Node current = head;
if(current.getNext()==null) return;
Node next = head.getNext();
while(current!=null)
{
current.setNext(prev);
prev=current;
current=next;
if(current!=null) next=current.getNext();
}
head=prev;
}

public void printLinkedListForwardRecursion()
{
printLLUsingRecursion(head);
System.out.println();
}
private void printLLUsingRecursion(Node head)
{
if(head==null) return;
System.out.print(head.getData()+"\t");
printLLUsingRecursion(head.getNext());
}

public void printLinkedListBackwordRecursion()
{
printLLBackwordRecursion(head);
System.out.println();
}
private void printLLBackwordRecursion(Node head)
{
if(head.getNext()==null) return;
printLLBackwordRecursion(head.getNext());
System.out.print(head.getData()+"\t");
}

public void reverseLinkedListUsingRecursion()
{
reverseLLUsingRecursion(head);

}
private void reverseLLUsingRecursion(Node temp)
{
if(temp.getNext()==null)
{
head=temp;
return;
}
reverseLLUsingRecursion(temp.getNext());
temp.getNext().setNext(temp);
temp.setNext(null);
}
}


class MainExecutor
{
public static void main(String gg[])
{
LinkedList linkedList = new LinkedList();
linkedList.insertAtBegining(7);
linkedList.insertAtBegining(2);
linkedList.insertAtBegining(5);
linkedList.insertAtBegining(3);
linkedList.printLinkedList();

System.out.println("=============================");

linkedList = new LinkedList();
linkedList.insertAtEnd(7);
linkedList.insertAtEnd(2);
linkedList.insertAtEnd(5);
linkedList.insertAtEnd(3);
linkedList.printLinkedList();

System.out.println("=============================");

linkedList = new LinkedList();
linkedList.insertAtNthPosition(5,10);	//Should Throw Error (Valid positions: 1)
linkedList.insertAtNthPosition(2,1);	//2
linkedList.insertAtNthPosition(8,1);	//8  2
//linkedList.insertAtNthPosition(7,4);	//Should Throw Error (Valid positions: 1,2,3)
linkedList.insertAtNthPosition(7,3);	//8  2  7
linkedList.insertAtNthPosition(3,1);	//3  8  2  7
linkedList.printLinkedList();

System.out.println("=============================");

linkedList = new LinkedList();
linkedList.insertAtBegining(7);
linkedList.insertAtBegining(2);
linkedList.insertAtBegining(5);
linkedList.insertAtBegining(3);
linkedList.printLinkedList();
linkedList.deleteAtNthPosition(2);
linkedList.printLinkedList();

System.out.println("=============================");

linkedList = new LinkedList();
linkedList.insertAtBegining(7);
linkedList.insertAtBegining(2);
linkedList.insertAtBegining(5);
linkedList.insertAtBegining(3);
linkedList.printLinkedList();
linkedList.reverseLinkedListIterative();
linkedList.printLinkedList();

System.out.println("=============================");

linkedList = new LinkedList();
linkedList.insertAtBegining(7);
linkedList.insertAtBegining(2);
linkedList.insertAtBegining(5);
linkedList.insertAtBegining(3);
linkedList.printLinkedList();

System.out.println("=============================");

linkedList = new LinkedList();
linkedList.insertAtBegining(7);
linkedList.insertAtBegining(2);
linkedList.insertAtBegining(5);
linkedList.insertAtBegining(3);
linkedList.printLinkedListForwardRecursion();
linkedList.printLinkedListBackwordRecursion();

System.out.println("=============================");

linkedList = new LinkedList();
linkedList.insertAtBegining(7);
linkedList.insertAtBegining(2);
linkedList.insertAtBegining(5);
linkedList.insertAtBegining(3);
linkedList.printLinkedList();
linkedList.reverseLinkedListUsingRecursion();
linkedList.printLinkedList();
}
}