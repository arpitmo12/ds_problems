class Node
{
private int data;
private Node left;
private Node right;
public void setData(int data)
{
this.data=data;
}
public int getData()
{
return this.data;
}
public void setLeft(Node left)
{
this.left=left;
}
public Node getLeft()
{
return this.left;
}
public void setRight(Node right)
{
this.right=right;
}
public Node getRight()
{
return this.right;
}
}

class BinarySearchTree
{
private Node getNewNode(int data)
{
Node node = new Node();
node.setData(data);
node.setLeft(null);
node.setRight(null);
return node;
}
public Node insert(Node root, int data)
{
if(root==null)
{
root = getNewNode(data);
return root;
}
if(data<=root.getData()) root.setLeft(insert(root.getLeft(), data));
else root.setRight(insert(root.getRight(), data));
return root;
}
}

class MainExecutor
{
public static void main(String gg[])
{
BinarySearchTree binarySearchTree = new BinarySearchTree();
Node root = null;
root = binarySearchTree.insert(root, 15);
root = binarySearchTree.insert(root, 10);
root = binarySearchTree.insert(root, 20);
root = binarySearchTree.insert(root, 25);
root = binarySearchTree.insert(root, 8);
root = binarySearchTree.insert(root, 12);
System.out.println(root.getData());				//15
System.out.println(root.getLeft().getData());			//10
System.out.println(root.getRight().getData());			//20
System.out.println(root.getLeft().getLeft().getData());		//8
System.out.println(root.getLeft().getRight().getData());	//12
System.out.println(root.getRight().getRight().getData());	//25
}
}