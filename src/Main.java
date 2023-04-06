import java.util.*;

import static java.util.stream.DoubleStream.generate;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Integer> nums = generate(20);
        List<String> words = generateString(20);
        System.out.println("Сгенерированные числа: " + nums);
        System.out.println("Сгенерированные строки:" + words);
        task1(nums);
        task2(nums);
        task3(List.of("Mama", "mama", "Mama", "MAMA", "mam", "mama"));
        task4(List.of("Mama", "mama", "Mama", "MAMA", "mam", "mama"));
    }


    private static void task1(List<Integer> nums) {
        System.out.println("Задача 1 ");
        for (Integer number : nums) {
            if (number % 2 == 1) {
                System.out.print(number + " ");

            }

        }
        System.out.println();
        System.out.println("_______________________________________");
    }

    private static void task2(List<Integer> nums) {
        System.out.println("Задача 2 ");
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer number : set) {
            if (number % 2 == 1) {
                System.out.print(number + " ");

            }

        }
        System.out.println();
        System.out.println("_______________________________________");
    }

    private static void task3(List<String> words) {
        System.out.println("Задача 3 ");
        for (String word : words) {
            if (Collections.frequency(words, word) == 1) {
                System.out.print(word + " ");

            }

        }
        System.out.println();
        System.out.println("_______________________________________");
    }
    private static void task4(List<String> words) {
        System.out.println("Задача 4 ");
        Map<String, Integer> map = new TreeMap<>();
       for (String word: words){
           if (!map.containsKey(word)){
               map.put(word,1);
            }else {
               map.replace(word,map.get(word)+1);
           }

        }
        System.out.println(map);
        System.out.println("_______________________________________");
    }

    private static List<Integer> generate(int n) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(RANDOM.nextInt(0, 5));
        }
        return list;
    }

    private static List<String> generateString(int n) {
        List<String> list = new ArrayList<>(n);
        int length = 11;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < length; j++) {
                stringBuilder.append((char) RANDOM.nextInt('а', 'я'));
            }
            list.add(stringBuilder.toString());
            stringBuilder.delete(0, stringBuilder.length());

        }
        return list;

    }
}