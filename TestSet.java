import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet();
        set.add(20);
        set.add(55);
        set.add(10);
        set.add(null);
        set.add(60);
        set.add(20);
        set.add(null);
        set.add(1);

        System.out.println(set);
    }
}