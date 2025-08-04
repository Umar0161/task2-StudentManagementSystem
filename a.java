import java.util.Scanner;
class a
{  
public static void main(String []args)
{
int i,j;
boolean found=false;
int[] arr={1,2,2,3,4};
int n=arr.length;

for( i=0;i<arr.length-1;i++)
{
for( j=i;j<=i;j++)
{
if(arr[i]==arr[j+1])
{
for(j=j+1;j<arr.length-1;j++)
{
arr[j]=arr[j+1]; 

}
n--;}
}

}
System.out.println(n);
for(i=0;i<n;i++)
System.out.println(arr[i]);
}
}