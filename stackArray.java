import java.io.*;
class stack{
    int size, arr[],top;
public stack(int x)
{
    size=x;
    arr=new int[size];
      top=-1;
}
void push(BufferedReader br)
throws IOException{
    int d;
  do
   {
    if(top==(size-1))
    {
        System.out.println("Overflow");
        return;
    }
    else
    {
        
        System.out.println("enter data to push");
       int i=Integer.parseInt(br.readLine());
       arr[++top]=i;
       System.out.println("data inserted");
    }
    System.out.println("do you want to add more press 1");
    d=Integer.parseInt(br.readLine());
}while(d==1);
    
}
public void pop(BufferedReader br)
throws IOException
{
    int d;
    do{
        if(top==-1)
        {
            System.out.println("underflow");
            return;
        }
        else{
            top=top-1;
            System.out.println("item deleted");
        }
        System.out.println("do you want to delete more press 1");
        d=Integer.parseInt(br.readLine());
    }while(d==1);
}
public void display()
{
    System.out.println("items are:");
    for(int j=top;j>=0;j--)
    {
        System.out.println(arr[j]);
    }
}
}
public class stackArray {
    public static void main(String[] args) 
    throws IOException
    {

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter size of array");
int m=Integer.parseInt(br.readLine());
        stack ok=new stack(m);
        ok.push(br);
        ok.pop(br);
        ok.display();

    }
}
