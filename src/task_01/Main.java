package task_01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = getNames();
        printCurrentList(names);
        printNumberedList(names);
        printSortedList(names);

    }

    public static List<String> getNames() {
        List<String> names = new ArrayList<>();
        names.add("Алина");
        names.add("Виктор");
        names.add("Яна");
        names.add("Дмитрий");
        names.add("Владимир");
        return names;
    }

    public static void printCurrentList(List<String> names) {
        System.out.println("Начальный список: ");
        System.out.println(names);
    }

    public static void printNumberedList(List<String> names) {
        System.out.println("\nПронумерованный список\n--------------------");
        addCounter(names);
    }
    public static void printSortedList(List<String>names){
        sorListByNames(names);
        System.out.println("\nСортированный список\n--------------------");
        addCounter(names);
    }

    public static void sorListByNames(List<String> names) {
        names.sort(Comparator.naturalOrder());
    }

    private static void addCounter(List<String> names) {
        int count = 1;
        for (String name : names) {
            System.out.println(count + "." + name);
            count++;
        }
    }
}
