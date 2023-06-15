package task_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> product = new ArrayList<>();
        inputNamesOfProducts(product, 8);
        outputNumberedList(product);
        getPartOfList(product);
    }

    public static void inputNamesOfProducts(List<String> list, int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write " + number + " products in the list: ");
        try {
            for (int i = 0; i < number; i++) {
                list.add(scanner.nextLine());
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e + " Capacity of list is 8 elements!");
        }
    }

    public static void outputNumberedList(List<String> list) {
        System.out.println("Currently list:\n--------------------");
        int count = 1;
        for (String name : list) {
            System.out.println(count + "." + name);
            count++;
        }
    }

    public static void getPartOfList(List<String> list) {
        System.out.println("List is from 2th to 5th element:\n--------------------");
        for (String element : list.subList(1, 5)) {
            int count = list.indexOf(element) + 1;
            System.out.println(count + "." + element);
        }
    }

}
