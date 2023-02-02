import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        
        // Add 10 random numbers to the list
        for (int i = 0; i < 10; i++) {
          numbers.add(random.nextInt(100));
        }
    
        System.out.println("Список: " + numbers);
    
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int n : numbers) {
          min = Math.min(min, n);
          max = Math.max(max, n);
          sum += n;
        }
        double average = (double) sum / numbers.size();
    
        System.out.println("Мин: " + min);
        System.out.println("Макс: " + max);
        System.out.println("Среднее: " + average);
}
}
