import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    @Test
    void cheсkWordJavaIsEmpty() {
        Set<String> set = new HashSet<>();
        assertThrows(IllegalArgumentException.class, () -> Homework.cheсkWordJava(set));
    }

    @Test
    void getMathMark() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Небесная Алгебра", 5);
        map.put("Высшая Теология", 3);
        map.put("Молекулярная химия", 4);
        map.put("Магическое рукоделие", 2);
        map.put("Math", 5);
        map.put("English", 2);
        map.put("Physics", 4);
        Assertions.assertEquals(5, Homework.getMathMark(map));
    }

    @Test
    void cheсkKeyHistoryIsEmpty() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Небесная Алгебра", 5);
        map.put("Высшая Теология", 3);
        map.put("Молекулярная химия", 4);
        map.put("Магическое рукоделие", 2);
        map.put("Math", 5);
        map.put("English", 2);
        map.put("Physics", 4);
        assertThrows(IllegalArgumentException.class, () -> Homework.cheсkKeyHistory(map));


    }
}