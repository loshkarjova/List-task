package task_03;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        fillList(list1, 5);
        fillList(list2, 3);
        outputResultList(addNewElement(list1, list2));
    }

    public static void fillList(LinkedList<String> list, int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write " + number + " products in the list: ");
        try {
            for (int i = 0; i < number; i++) {
                list.add(scanner.nextLine());
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Current list:\n" + list);
    }

    public static LinkedList<String> addNewElement(LinkedList<String> list1, LinkedList<String> list2) {
        System.out.println("Updated list:");
        list1.addAll(2, list2);
        return list1;
    }

    public static void outputResultList(LinkedList<String> list) {
        int count = 1;
        for (String element : list) {
            System.out.println(count + "." + element);
            count++;
        }
    }
}
