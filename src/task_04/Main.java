package task_04;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        fillList(list, 5);
        outputResultList(addNewElements(list));

    }

    public static void fillList(LinkedList<String> list, int number) {
        System.out.println("Write " + number + " products in the list:");
        try {
            for (int i = 0; i < number; i++) {
                list.add(scanner.nextLine());
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Current list:\n" + list);

    }

    public static LinkedList<String> addNewElements(LinkedList<String> list) {
        System.out.println("Add the first element: ");
        list.addFirst(scanner.nextLine());
        System.out.println("Add the last element: ");
        list.addLast(scanner.nextLine());
        System.out.println("Updated list:");
        return list;
    }

    public static void outputResultList(LinkedList<String> list) {
        int count = 1;
        for (String element : list) {
            System.out.println(count + "." + element);
            count++;
        }
    }
}
