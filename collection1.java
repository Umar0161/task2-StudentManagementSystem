import java.util.*;

class collection1 {
    public static void main(String[] args) {
        ArrayList l1=new ArrayList(5);
        ArrayList t1=new ArrayList(5);
        List val=new ArrayList<>();
        
        l1.add("A");
        l1.add("B");
        l1.add("C");
        System.out.println(l1);
        t1.add("a");
        t1.add("b");
        t1.add("c");
        System.out.println(t1);
        l1.addAll(t1);
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
        l1.retainAll(t1);
        System.out.println(l1);
        l1.remove("a");
System.out.println(l1);
l1.removeAll(t1);


System.out.println(l1);
System.out.println(l1.size());
System.out.println(l1.isEmpty());

    }
    
} 
