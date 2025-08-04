import java.util.*;
public class circular {
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this .data= data;
            this.next=null;

        }

    }
    Node head=null;
    Node tail=null;
  public  void addFirst()
    {
        int c=0,data ;
Scanner sc=new Scanner(System.in);

do
{

    System.out.println("enter the data for add first");
    try{
  data=sc.nextInt();

  Node new_Node=new Node(data);
  
  if(head==null)
  {
      head=new_Node;
      tail=head;
      new_Node.next=head;      
    
  }
else{
  new_Node.next=head;
  head=new_Node;
  tail.next=head;
}
}
catch(Exception e)
{
  System.out.println("enter integer only");
}

  System.out.println("do you want to enter more data press 1 or press 0 for exit");
 try{ 
c=sc.nextInt();
 }

catch(Exception e)
{
  System.out.println("enter integer only");
}

}while(c==1);

    }
   public void traversal()
    {
        if(head ==null){
            System.out.println("LL is empty");
            return;
        }   
        Node temp=head;    
  do
  {
    System.out.print(temp.data+"->");
    temp=temp.next;
   }while (temp!=head);
    }
    public void addPosition()
    {
      int data,n;
      Scanner sc =new Scanner(System.in);
   
        System.out.println("enter position");
      
      n=sc.nextInt();
      if (head==null&&n>=1)
      { 
        System.out.println("CL is empty,so enter first position");
     return;
    }
      System.out.println("enter data");
      data=sc.nextInt();
      Node new_Node=new Node(data);
      
     if(n==0)
     {
      if(head==null)
      {
      head=new_Node;
      tail=new_Node;
      new_Node.next=head;
      }
      else{
        new_Node.next=head;
        head=new_Node;
        tail.next=head;
      }
      return; 
     }
    
      Node temp=head;
      for(int i=0;i<(n-1);i++)
      {
        if (temp.next==head)
        { 
          System.out.println("invalid position");
          return;
      }
    temp=temp.next;
      }
      new_Node.next=temp.next;
      temp.next=new_Node;
      if(temp.next==head)
      {
        new_Node=tail;
      }
      
    }
 public void addLast()
 {
  int c,data;
  Scanner sc=new Scanner (System.in);
  do{
    System.out.println("enter data to add last+");
 data=sc.nextInt();
  Node new_Node=new Node( data);
  if(head==null)
  {
  head=new_Node;
      new_Node.next=head;
      tail=new_Node;
  }
  else{
tail.next=new_Node;
tail =new_Node;
new_Node.next=head;
  }
System.out.println("do you want to enter more data press 1 or press 0 for exit");
c=sc.nextInt();
}while(c==1);
  }

public void deleteFirst(){
  if(head==null)
  {
    System.out.println("ll is empty");
    return;
  }
  if(head.next==head)
  {
   head=null;
   return;
  }
  Node temp=head;
while(temp.next!=head)
{
  temp=temp.next;
}
temp.next=head.next;
head=head.next;
}
void deleteLast()
{
  if(head==null)
  {
    System.out.println("ll is empty");
    return;
  }
  if(head.next==head)
  {
   head=null;
   return;
  }
  Node temp=head;
while(temp.next.next!=head){
    temp=temp.next; 
}
temp.next=head;
tail=temp;
}
void deletePosition()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter position of node to be deleted");
        int i=sc.nextInt();
     
        if(head==null)
        {
            System.out.println("the list is empty");
            return;
        }
        if(head.next==head&&i==0)
        {
            head =null;
            return;
        }
        Node temp=head;
        Node temp1=head;
        while(i>0){
            temp1=temp;
            temp=temp.next;
            if(temp1.next==head )
            {
                 System.out.println("invlid position enter");
                 return;
            }
            i--;
        }
        if(temp.next==head)
        {
           temp1.next=head;
      tail=temp1;
          }
         else{
         
         temp1.next=temp.next;
         }
    }
    public static void main(String[] args) {
        circular oj=new circular();
        oj.addFirst();
        // oj.addPosition();
        // oj.addPosition();
        // oj.addPosition();
        // oj.addLast();
        // oj.deleteFirst();
        // oj.deleteFirst();
// oj.deleteLast();
oj.deletePosition();
        oj.traversal();
       
    }
}
  
