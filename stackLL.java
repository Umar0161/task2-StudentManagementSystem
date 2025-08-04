import java.io.*;
 class stackClass {
    static class Node{
int data ;
Node next;
Node(int data)
{
    this.data=data;
    this.next=null;   
}
    }
    Node top=null;
    public void push(BufferedReader br)
    throws IOException{
    int d=0;
        do{
        System.out.println("enter data to push");
        int data=Integer.parseInt(br.readLine());
      Node new_Node=new Node(data);
      if(top==null)
      {
        top=new_Node;
      }
      else{
        new_Node.next=top;
        top=new_Node;
      }
      System.out.println("data inserted");
     System.out.println("do you want to add more press 1");
     d=Integer.parseInt(br.readLine());
 }while(d==1);
     
    }
    public void pop(BufferedReader br)
    throws IOException
    {
        int d=0;
        do{
if (top==null)
{
    System.out.println("stack is empty");
    return;
}
else
{
    top=top.next;
    System.out.println("data deleted ");
}
System.out.println("do you want to delete more press 1");
d=Integer.parseInt(br.readLine());
}while(d==1);
}
public void display()
{
    Node temp=top;
    while(temp!=null)
    {
        System.out.println(temp.data);
        temp=temp.next;
    }
}
    }

public class stackLL {
    public static void main(String[] args) 
    throws IOException
    {

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        stackClass ok=new stackClass();
        ok.push(br);
        ok.pop(br);
        ok.display();

    }
}
