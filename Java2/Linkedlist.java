import java.util.*;

public class Linkedlist {
    /*  // iterate linked list in java

    public static void main(String[] args){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        iteratefun(l);
    }

    public static void iteratefun(LinkedList<Integer> l){
        System.out.println("Iterate linkedlist using iterator");
        Iterator it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }

     */




 /*   //List to set conversion
    public static void main(String[] args){
        List<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        Set<Integer> hset=new HashSet<>();
        for(Integer x : l){
            hset.add(x);
        }
        System.out.println("hset is");
        for(Integer x: hset)
            System.out.println(x);

    }
    */




  /*  //Converting array list to linked list
    public static void main(String[] args){
        ArrayList<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        System.out.println("ArrayList: "+ l);

        LinkedList<String> l2 = new LinkedList<>(l);

        System.out.println(l2);
    }
   */





   /* // converting hashset to arraylist
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("set1");
        set.add("set2");
        set.add("set3");
        set.add("set3");

        System.out.println(set);

        ArrayList<String> list = new ArrayList<>(set);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
    */





   /*  // Convert array to linked list
    public static void main(String[] args){
        String[] arr = {"A","B","C"};
        List<String> list = Arrays.asList(arr);
        LinkedList<String> l = new LinkedList<>(list);
        System.out.println(l);
    }
    */


}
