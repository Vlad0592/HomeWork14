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

    }
}

