import javax.swing.*;
import java.util.*;

public class Homework {

    /*
     * Set / HashSet
     */

    // 1.1 Создание множества. Создайте HashSet<String>, добавьте 5 слов и выведите все элементы.
    public static Set<String> newSetString() {
        Set<String> set = new HashSet<>();
        set.add("Один");
        set.add("Два");
        set.add("Три");
        set.add("java");
        set.add("Пять");
        set.add("Пять");
        return set;
    }

    // 1.2 Проверка на наличие элемента. Проверьте, содержится ли слово "java" в множестве.
    public static boolean chekWordJava(Set<String> set) {
        boolean chek = false;
        for (String str : set) {
            if (str.equals("java")) {
                chek = true;
            }
        }
        return chek;
    }

    // 1.3 Удаление элемента. Удалите слово "python" из множества (если оно есть).
    public static boolean RemoveFromSet(Set<String> set) {
        boolean isRemoved = set.remove("python");
        return isRemoved;
    }

    // 1.4 Подсчёт уникальных. Дан список строк с повторами. Добавьте их в HashSet и
    // выведите количество уникальных слов.
    public static int countUnique(List<String> list) {
        Set<String> setFromList = new HashSet<String>(list);
        return setFromList.size();
    }

    /*
     * Map / HashMap
     */

    // 2.1 Создание и вывод Map. Создайте HashMap<String, Integer> с названиями предметов и оценками.
    // Выведите все пары ключ-значение.
    public static Map<String, Integer> newMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Небесная Алгебра", 5);
        map.put("Высшая Теология", 3);
        map.put("Молекулярная химия", 4);
        map.put("Магическое рукоделие", 2);
        map.put("Math", 5);
        map.put("English", 2);
        map.put("Physics", 4);
        return map;
    }

    // 2.2 Получение значения по ключу. Выведите значение по ключу "Math".
    public static Integer getMathMark(Map<String, Integer> map) {
        return map.get("Math");
    }

    // 2.3 Изменение значения. Измените значение по ключу "English" на 5.
    public static void setEnglishMark(Map<String, Integer> map) {
        map.replace("English", 5);
        System.out.println(map);
    }

    // 2.4 Проверка наличия ключа. Проверьте, есть ли в мапе ключ "History".
    public static boolean chekKeyHistory(Map<String, Integer> map) {
        return map.containsKey("History");
    }

    // 2.5. Удаление ключа. Удалите ключ "Physics" из мапы.
    public static void removeKeyPhysics(Map<String, Integer> map) {
        map.remove("Physics");
        System.out.println(map);
    }

    /*
     * Medium
     */

    // 3.1 Анаграммы. Напишите метод areAnagrams(String a, String b),
    // который возвращает true, если строки состоят из одинаковых символов
    // (используйте Map<Character, Integer>).
    public static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] arrFirst = a.toCharArray();
        for (char c : arrFirst) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char[] arrSecond = b.toCharArray();
        for (char i : arrSecond) {
            if (!map.containsKey(i)) {
                return false;
            } else {
                int count = map.get(i);
                if (count == 1) {
                    map.remove(i);
                } else {
                    map.put(i, count - 1);
                }
            }
        }
        return map.isEmpty();
    }

    // 3.2 Поиск дубликатов с помощью Set. Напишите метод
    // hasDuplicates(List<Integer> list) — возвращает true, если в списке есть дубликаты
    public static boolean hasDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        for (Integer a : list) {
            if (set.contains(a)) {
                return true;
            }
            set.add(a);
        }
        return false;
    }

    // 3.3 Рейтинг студентов. Дан Map<String, Integer> (имя студента → балл).
    // Верните имя студента с максимальным баллом
    public static String getStudent(Map<String, Integer> students) {
        String topStudent = null;
        Integer maxMark = 0;
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() > maxMark) {
                maxMark = entry.getValue();
                topStudent = entry.getKey();
            }
        }
        return topStudent;
    }

    // 3.4 Словарь синонимов. Создайте Map<String, Set<String>> — ключ: слово, значение: набор синонимов.
    // Реализуйте метод addSynonym(String word, String synonym)
    public static void addSynonym(Map<String, Set<String>> vocabulary, String word, String synonym) {
        if (!vocabulary.containsKey(word)) {
            Set<String> synonyms = new HashSet<>();
            synonyms.add(synonym);
            vocabulary.put(word, synonyms);
        } else {
            vocabulary.get(word).add(synonym);
        }
    }
}

