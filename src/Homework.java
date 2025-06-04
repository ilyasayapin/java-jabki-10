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

    // 1.4 Подсчёт уникальных. Дан список строк с повторами. Добавьте их в HashSet и выведите количество уникальных слов.
    public static int countUnique(List<String> list) {
        Set<String> setFromList = new HashSet<String>(list);
        return setFromList.size();
    }

    /*
     * Map / HashMap
     */

    // 2.1 Создание и вывод Map. Создайте HashMap<String, Integer> с названиями предметов и оценками. Выведите все пары ключ-значение.
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



}
