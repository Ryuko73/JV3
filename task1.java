import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class task1 {
public static void main(String[] args) {
 List<Integer> numbers = new ArrayList<>();
    Random random = new Random();
    
    for (int i = 0; i < 10; i++) {
      numbers.add(random.nextInt(100));
    }

    System.out.println("Список: " + numbers);

    numbers.removeIf(n -> n % 2 == 0);

    System.out.println("Список после удаления: " + numbers);
}
}