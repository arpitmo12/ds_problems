import java.util.Stack;
class MainExecutor
{
public static void main(String gg[])
{
String str = "hello";
Stack<Character> stack = new Stack<Character>();
for(char c: str.toCharArray())
{
stack.push(c);
}
str="";
while(!stack.isEmpty())
{
str+=String.valueOf(stack.pop());
}
System.out.println("Reversed String: "+str);
}
}