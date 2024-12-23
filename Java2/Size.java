import java.util.*;

//public class Size {
//    public static void main(String[] arg){
//        List<String> l = new LinkedList<>();
//        l.add("Hello");
//        l.add("Wecome");
//        l.add("Renuka");
//        System.out.println(l);
//        int l1=l.size();
//        System.out.println("size of list is: "+l1);
//    }
//}




//
//class GFG {
//    public static void main(String[] args)
//    {
//        Set<Integer> numbers = new HashSet<Integer>();
//            for (int i = 1; i <= 5; i++) {
//                numbers.add(i);
//            }
//
//            numbers.stream().forEach(System.out::print);
//
//            numbers.remove(5);
//
//            System.out.println("\nAfter Performing Operation");
//
//            numbers.stream().forEach(System.out::print);
//
//            System.out.println(
//                    "\nSet is also By Default Readable and Writable");
//            try {
//                numbers = Collections.unmodifiableSet(numbers);
//
//                numbers.remove(4);
//            }
//            catch (UnsupportedOperationException
//                    unsupportedOperationException) {
//                System.out.println(
//                        "Exceptions is "
//                                + unsupportedOperationException);
//            }
//            finally {
//                System.out.println(numbers.contains(3));
//                System.out.println("Now Set is Read-Only");
//            }
//        }
//    }





class Good {

    public static void main(String[] args)
    {
        String[] geek
                = { "Rahul", "Utkarsh", "Shubham", "Neelam" };

        List<String> al = new ArrayList<String>();

        Collections.addAll(al, geek);

        System.out.println(al);
    }
}

