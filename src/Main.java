import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    // 1.1 Создание множества. Создайте HashSet<String>, добавьте 5 слов и выведите все элементы.
        System.out.println(Homework.newSetString());

    // 1.2 Проверка на наличие элемента. Проверьте, содержится ли слово "java" в множестве.
        System.out.println("Есть ли слово 'java' в множестве? - " + Homework.chekWordJava(Homework.newSetString()));

    // 1.3 Удаление элемента. Удалите слово "python" из множества (если оно есть).
        System.out.println("Удалено ли слово 'python' из множества? - " + Homework.RemoveFromSet(Homework.newSetString()));

    // 1.4 Подсчёт уникальных. Дан список строк с повторами. Добавьте их в HashSet и выведите количество уникальных слов.
        List<String> food = new ArrayList<String>();
        food.add("Арбуз");
        food.add("Арбуз");
        food.add("Тыква");
        food.add("Абрикос");
        food.add("Абрикос");
        System.out.println(food);
        System.out.println("Число уникальных слов: " + Homework.countUnique(food));

    }
}