import java.io.*;
 class Queue1{
    int size, q[], f,r;
    public Queue1(int x)
    {
        size=x;
        q=new int[size];
         f=-1;
         r=-1;
    }
      
    public void enqueueFront(BufferedReader br)
    throws IOException{
    int d=0;
        do{
        
        if((f==0&&r==size-1)||(f==r+1))
        {
System.out.println("data overflow");
return;
        }
        System.out.println("enter data for enqueueFront");
        int data=Integer.parseInt(br.readLine());
     if(f==-1&&r==-1)
     {
          f=r=0;
     }
       else if(f==0)
        {
            f=size-1;       
        }
        else{
            f--;
        }
        q[f]=data;
      System.out.println("data inserted");
     System.out.println("do you want to add more press 1");
     d=Integer.parseInt(br.readLine());
 }while(d==1);
}
public void enqueueRear(BufferedReader br)
    throws IOException{
    int d=0;
        do{
        
        if((f==0&&r==size-1)||(f==r+1))
        {
System.out.println("data overflow");
return;
        }
        System.out.println("enter data for enqueueRare");
        int data=Integer.parseInt(br.readLine());
     if(f==-1&&r==-1)
     {
          f=r=0;
     }
       else if(r==size-1)
        {
          r=0;       
        }
        else{
            r++;
        }
        q[r]=data;
      System.out.println("data inserted");
     System.out.println("do you want to add more press 1");
     d=Integer.parseInt(br.readLine());
 }while(d==1);
}
public void display()
{
    if(r==-1&&f==-1)
    {
        System.out.println("queue is empty");
    }
    else{
        int i=f;  
        while(i!=r)
        {
            System.out.println(q[i]);
            i=(i+1)%size;
        }
        System.out.println(q[i]);
    } 
}
public void dequeueFront(BufferedReader br)
throws IOException{
int d=0;
    do
{
    if(f==-1&&r==-1)
    {
        System.out.println("empty");
        return;
    }
    else if (f==r) {
    f=r=-1;   
         
    }
    else if(f==size-1)
    {
        f=0;
    }
    else{
        f++;
    }
    System.out.println("data deleted");
    System.out.println("do you want to delete more press 1");
    d=Integer.parseInt(br.readLine());
}while(d==1);
}
public void dequeueRear(BufferedReader br)
throws IOException{
int d=0;
    do
{
    if(f==-1&&r==-1)
    {
        System.out.println("empty");
        return;
    }
    else if (f==r) {
    f=r=-1;        
    }
    else if(r==0)
    {
        r=size-1;
    }
    else{
        r--;
    }
    System.out.println("data deleted");
    System.out.println("do you want to delete more press 1");
    d=Integer.parseInt(br.readLine());
}while(d==1);
}
 }
public class DEque {
    public static void main(String[] args) 
    throws IOException
    {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter size of array");
int m=Integer.parseInt(br.readLine());
        Queue1 ok=new Queue1(m);
        // ok.enqueueFront(br);
        ok.enqueueRear(br);
        // ok.dequeueFront(br);
        ok.dequeueRear(br);
         ok.display();
  
}
 }