import java.io.*;
public class binarySearch {
    public static int search(int []arr,int item)
    {
        int beg=0;
        int end=arr.length-1;
      
        while (beg<=end) {
           
            int mid=(beg+end)/2;
    
            if(arr[mid]==item)
            {
                return mid;
            }
            else if(arr[mid]<item)
            {
                beg=mid+1;
            }
            else
            {
                
                end=mid-1;
            }
            
        }
      
        return -1;
       
    }
    public static void main(String[] args)
    throws IOException {
        int []arr={10,20,30,40,50,60};
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("enter the target element");
   int item=Integer.parseInt(br.readLine());
   int result=search(arr,item);
   if(result!=-1)
   {
    System.out.println("Element found at index-> "+result);
   }
   else
   System.out.println("element not found");
    }
    
}
