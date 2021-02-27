package homework.homework8.Collection;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("mango");
        words.add("mango");
        words.add("orange");
        words.add("potato");
        words.add("mango");
        words.add("kiwi");
        words.add("peach");
        words.add("apple");
        words.add("mango");
        words.add("grape");
        words.add("banana");
        words.add("cherry");
        words.add("nut");
        words.add("grape");
        words.add("apricot");
        words.add("grape");

        //uniqueList(words);
        //uniqueSet(words);
        //wordsCount(words);

        /*Stream <String> stream = words.stream();
        List<String> distinctWords = stream.distinct().collect(Collectors.toList());
        System.out.println(distinctWords);*/

        // как посчитать количество с помощью стрим не знаю

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "897656");
        phoneBook.add("Ivanov", "7894");
        phoneBook.add("Ivanov", "54654655");
        phoneBook.add("Petrov", "4521");
        phoneBook.add("Sidorov", "897656");
        phoneBook.add("Mihailov", "898456");

        phoneBook.getPhoneNumber("Ivanov");
        phoneBook.getPhoneNumber("Sidorov");
        phoneBook.getPhoneNumber("Bukin");






    }

    private static void wordsCount(List<String> words) {
        Map<String, Integer> map = new LinkedHashMap<>();
        int minValue = 1;
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, minValue);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    private static void uniqueSet(List<String> words) {
        Set<String> set = new LinkedHashSet<>(words);
        System.out.println(set);
    }

    private static void uniqueList(List<String> words) {
        List<String> unique = new ArrayList<>();
        for (String word : words) {
            if (!unique.contains(word)) {
                unique.add(word);
            }
        }
        System.out.println(unique);
    }

}