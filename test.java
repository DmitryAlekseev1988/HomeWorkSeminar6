import java.util.HashSet;
import java.util.List;

public class test {
    public static void main(String[] args) {
        HashSet<Integer> data = new HashSet<>(List.of(1, 2, 3, 1, 777, 0));
        for (Integer integer : data) {
            if(integer == 1)
            System.out.println(integer);
        }
            
        
    }
}
