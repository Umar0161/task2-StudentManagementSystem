import java.util.*;
 class linked1 {
     class Node {
String data;
    Node next;
    Node(String data)
    {
        this.data=data;
        this.next=null;
    }
}  
    Node head=null;
    public void addFirst(String data)
    {
        Node new_Node=new Node(data);
        if(head==null)
        {
            head=new_Node;
return;        
        }

        new_Node.next=head;
        head=new_Node;
        
   
    }
    void addLast(String data)
    { Node new_Node=new Node(data);
        if(head==null)
        {
            head=new_Node;
return;        
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new_Node;
    }
    void addPosition(String data){
        // add in any position
        Scanner sc =new Scanner(System.in);
      
        System.out.println("enter position of node to be inserted");
     
        int n=sc.nextInt();
       
        Node new_Node=new Node(data);
        if(n==0)
        {
            new_Node.next=head;
            head=new_Node;
            return;
        }
        if (head==null&&n>=1)
        { 
          System.out.println("LL is empty ,so enter first position");
          return;
      }
        Node temp=head;
        for(int i=0;i<(n-1);i++)
        {
            if (temp.next==null)
              { 
                System.out.println("invalid position");
                return;
            }
          temp=temp.next;
        }
      
        
         new_Node.next = temp.next;  
         temp.next=new_Node;   
        }
  
    
    void travers()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
      
        System.out.println("data in linked list are:-");
while (temp!=null) {
    System.out.print(temp.data);
    temp=temp.next;

}

    }
    void deleteLast()
    {
        if(head==null)
{
    System.out.println("the list is empty");
    return;
}
if(head.next==null)
{
    head= null;
    return;
}
Node temp=head;
while(temp.next.next!=null){
    temp=temp.next;
  
}
temp.next=null;
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

        
           temp1.next=null;
         else{
         
         temp1.next=temp.next;
         }
    }
    public static void main(String[] args) {
        linked1 oj =new  linked1();
        
        oj.addFirst("Umar ");
        // oj.addFirst("The ");
        // oj.addLast("Khalid");
    //     oj.addPosition("Boy");
    //    oj.addPosition("gg");
        // oj.travers();
        // oj.deleteLast();
        // oj.travers();
     
        oj.deletePosition();
        oj.travers();
    }
}

