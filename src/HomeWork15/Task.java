package HomeWork15;

import java.util.Objects;

public class Task {
    private int first;
    private int second;

    public Task(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return (first == task.first && second == task.second)|| (first==task.second && second==task.first);

    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    public String toString() {
        return  first + "*" + second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}