import java.util.ArrayList;
import java.util.List;

public class Remove {
    public static void main(String[] arg){
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(1);
        l.add(2);
        System.out.println(l);

        l.remove(1);
        System.out.println(l);
    }
}
