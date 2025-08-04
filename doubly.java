import java.util.*;
public class doubly {
    class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    }
    Node head=null;
    Node tail=null;
    public void addFirst()
    {
        int data,c;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("enter data to add first");
        data=sc.nextInt();
        Node new_node=new Node(data);
if(head==null)
{
    head=new_node;
    tail=new_node;
}
else{
head.prev=new_node;
new_node.next=head;
head=new_node;
}

System.out.println("enter more data press 1 to continue...");
c=sc.nextInt();
    }while(c==1);
    }
public void traversal()
{
    if(head ==null)
    {
    System.out.println("list is empty");
    return;
}
Node temp=head;
System.out.println("the data in linked list->");
do{
 
    System.out.print(temp.data+"->");
    temp=temp.next;
}
while(temp!=null);
}
public void addLast()
{
    int data,c;
    Scanner sc=new Scanner(System.in);
    do{
    System.out.println("enter data to add in last");
    data=sc.nextInt();
    Node new_node=new Node(data);
if(head ==null)
{
head=new_node;
tail=new_node;
}
else{
tail.next=new_node;
new_node.prev=tail;
tail=new_node;
}

System.out.println("enter more data press 1 to continue...");
c=sc.nextInt();
}while(c==1);
}
public void addPosition()
{
    int data,c=1,i=0;
    Scanner sc =new Scanner(System.in);
    do{
        do{
    System.out.println("enter position of node to be inserted");
    int n=sc.nextInt();

    if (head==null&&n>=1)
    { 
      System.out.println("CL is empty,so enter first position");
   break;
  }
    System.out.println("enter data");
    data=sc.nextInt();
    Node new_node=new Node(data);
    
   if(n==0)
   {
    if(head ==null)
    {
        head=new_node;
        tail=new_node;
    }
    else{
    head.prev=new_node;
    new_node.next=head;
    head=new_node;
    }
    break;
   }
   Node temp=head;
   for(i=0;i<(n-1);i++)
   {
     if (temp.next==null)
     { 
       System.out.println("invalid position");
       i=0;
       break;
   }
 temp=temp.next;
   }
   if(i!=0 ||n==1)
   {
   new_node.next=temp.next;
   temp.next=new_node;
   if(temp.next==null)
   {
     new_node=tail;
   }
}
}while(c!=1);
System.out.println("do you want to enter more data press 1 or press 0 for exit");
c=sc.nextInt();
}while(c==1);
  
}
public void deleteFirst()
{
    if(head==null)
    {
      System.out.println("ll is empty");
      return;
    }
    if(head.next==null)
  {
   head=null;
  }
    else
    {
        head=head.next;
        head.prev=null;
    }
}
public void deleteLast()

{
    if(head==null)
    {
      System.out.println("ll is empty");
      return;
    }
    if(head.next==null)
  {
   head=null;
  }
  else{
    Node temp=tail;
    temp=temp.prev;
    temp.next=null;  
    tail=temp;
  }
}
public void deletePosition()
{
  Scanner sc =new Scanner(System.in);
  System.out.println("enter position of node to be deleted");
  int i=sc.nextInt();

  if(head==null)
  {
      System.out.println("the list is empty");
      return;
  }
  if(head.next==null&&i==0)
  {
      head =null;
      return;
  }
  Node temp=head;
  Node temp1=head;
  while(i>0){
      if(temp.next==null )
      {
           System.out.println("invlid position enter");
           return;
      }
      temp1=temp;
      temp=temp.next;
      i--;
  }
  if(temp.next==null)
  {
     temp1.next=null;
     tail=temp1;
  }  
   else{
    temp=temp.next;
   temp1.next=temp;
   temp.prev=temp1;
   }
}
public static void main(String[] args) {   
    doubly oj=new doubly();
    oj.addFirst();
    oj.addLast();
    oj.addPosition();
    oj.traversal();
    oj.deleteFirst();
    oj.deleteLast();
    oj.deletePosition();
    oj.traversal();
}
}
