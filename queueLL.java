import java.io.*;
class queuel{
    static class Node{
        int data ;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;   
        }
}
Node f=null;
Node r=null;
public void enqueue()
throws IOException
{
 
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int d=0;
    do{
 System.out.println("enter data");
 int data=Integer.parseInt(br.readLine());
 Node new_Node=new Node(data);
  System.out.println("data inserted");
  if(f==null&&r==null)
  {
    f=new_Node;
    r=new_Node;
  }
  else
  {
    r.next=new_Node;
    r=new_Node;
  }
 System.out.println("do you want to add more press 1");
 d=Integer.parseInt(br.readLine());
}while(d==1);
}
public void dequeue()
throws IOException
{
 
    int d=0;
    do{
  
  if(f==null)
  {
 System.out.println("underflow");
 return;
  }
  else
  {
    f=f.next;

  }
  System.out.println("data deleted");
 System.out.println("do you want to deleted more press 1");
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 d=Integer.parseInt(br.readLine());
}while(d==1);
}
public void display()
{
  if(f==null)
  {
System.out.println("queue is empty");
return;
  }Node temp=f;
while (temp!=null) {
  System.out.println(temp.data);
  temp=temp.next;
}
}
}
public class queueLL {
    public static void main(String[] args)  
    throws IOException
    {
queuel ok=new queuel();
    ok.enqueue();
    ok.dequeue();
         ok.display();
        }}