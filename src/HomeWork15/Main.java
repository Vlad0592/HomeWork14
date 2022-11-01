package HomeWork15;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Task> allTasks = new HashSet<>();
        for (int first = 2; first <= 9; first++) {
            for (int second = first; second <= 9; second++) {
                if (allTasks.size() < 15) {
                    allTasks.add(new Task(first, second));
                } else {
                    break;
                }
            }
        }
        for (Task task : allTasks) {
            System.out.println(task.getFirst() + "*" + task.getSecond());


        }


        Set<Integer> list = new HashSet<Integer>();
        int a = 999;
        for (int i = 0; i <= 20; i++) {
            double random = Math.random() * a;
            list.add((int) random);
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer number = it.next();
            if (number % 2 != 0) {
                it.remove();
            }
        }
        System.out.println("Вывод оставшихся элементов " + list);

        System.out.println();
    }
}
