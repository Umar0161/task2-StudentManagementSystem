import java.io.*;
public class LinearSearch {
    public static void main(String[] args) 
    throws IOException{
       int  arr[],size,item,i;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter the size of array");
size=Integer.parseInt(br.readLine());
arr=new int[size];
System.out.println("enter element in array");
for(i=0;i<size;i++)
{
    arr[i]=Integer.parseInt(br.readLine());
}
System.out.println("enter the element to find");
item=Integer.parseInt(br.readLine());
for(i=0;i<arr.length;i++)
{
if(arr[i]==item)
{
    System.out.println("element found at index:- "+i);
    break;
}
}
if(i==size)
{
    System.out.println("element not found");
}
    }
}
