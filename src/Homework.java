import java.util.HashSet;
import java.util.Set;

public class Homework {

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
    public static int countUnique(Set<String> set) {
        return set.size();
    }

}
