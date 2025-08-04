import java.io.*;
 class queueArr{
    int size, q[], f,r;
    public queueArr(int x)
    {
        size=x;
        q=new int[size];
         f=-1;
         r=-1;
    }
      
    public void enqueue(BufferedReader br)
    throws IOException{
    int d=0;   
        do{
        
        if(r==(size-1))
        {
System.out.println("data overflow");
return;
        }
        else{
            System.out.println("enter data for enqueue");
        int data=Integer.parseInt(br.readLine());
        if(f==-1&&r==-1)
        {
            f=0;
            r=0;
            q[r]=data;
        }
        else{
            r=r+1;
            q[r]=data;
        }
        }
      System.out.println("data inserted");
     System.out.println("do you want to add more press 1");
     d=Integer.parseInt(br.readLine());
 }while(d==1);
}
public void dequeue(BufferedReader br)
throws IOException{
int d=0;
    do{
    if(f==-1&&r==-1)
    {
        System.out.println("underflow");
        return;
    }
    else if(f==r)
    {
        f=r=-1;
    }
    else{
        f=f+1;
    }
  System.out.println("data remove");
 System.out.println("do you want to delete more press 1");
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
        for(int i =f;i<=r;i++)
        {
            System.out.println(q[i]);
        }
    }
}
 }
public class queueArray {
    public static void main(String[] args) 
    throws IOException
    {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter size of array");
int m=Integer.parseInt(br.readLine());
        queueArr ok=new queueArr(m);
        ok.enqueue(br);
        ok.dequeue(br);
         ok.display();

    }
}
