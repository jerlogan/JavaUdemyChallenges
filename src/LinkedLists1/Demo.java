package LinkedLists1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<String>();
        addInOrder(places, "Sydney");
        addInOrder(places, "Melbourne");
        addInOrder(places, "Brisbane");
        addInOrder(places, "Perth");
        addInOrder(places, "Canberra");
        addInOrder(places, "Adelaide");
        addInOrder(places, "Darwin");
        addInOrder(places, "Alice Springs");

        printList(places);
        visit(places);

    }

    private static void printList (LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
//                equal, do not add
                System.out.println(newCity + "is already included!");
                return false;
            }
            else if (comparison > 0) {
//                New city appears before it's comparison
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if (comparison < 0) {
//                move onto next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit (LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No cities in the itinerary!");
            return;
        }
        else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Vacation is over!");
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    }
                    else {
                        System.out.println("You've reached the end of the list!");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    }
                    else {
                        System.out.println("You are at the start of the list!");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \n press ");
        System.out.println("0 to quit \n" +
                "1 to go to next city \n" +
                "2 to go to previous city \n" +
                "3 to go back to menu");
    }





















}
