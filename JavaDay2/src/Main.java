import MyCollections.MyList;
import MyCollections.MyMap;
import MyCollections.MyQueue;
import MyCollections.MyStack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.showCase();
        myList.showCaseFindIndexOfElement();

        List<String> animeList = new ArrayList<>();
        animeList.add("Naruto");
        animeList.add("One Piece");
        animeList.add("Attack on Titan");
        animeList.add("Death Note");

        System.out.println("Anime List: " + animeList);

        Collections.shuffle(animeList);
        System.out.println("Shuffled Anime List: " + animeList);

        Collections.reverse(animeList);
        System.out.println("Reversed Anime List: " + animeList);


        // Map Section
        HashMap<String, String> map = new HashMap<>();
        map.put("Naruto", "Ninja");
        map.put("One Piece", "Pirate");
        map.put("Attack on Titan", "Soldier");
        map.put("Death Note", "Shinigami");

        MyMap myMap = new MyMap(map);
        myMap.printMap();

        // Complex Map Example
        HashMap<String, List<Double>> cryptoMarket = new HashMap<>();
        cryptoMarket.put("BTC", new ArrayList<>(List.of(1130000.0, 114000.0, 115321.0)));
        cryptoMarket.put("ETH", new ArrayList<>(List.of(3000.0, 3100.0, 3200.0)));
        cryptoMarket.put("XRP", new ArrayList<>(List.of(1.0, 1.1, 1.2)));
        cryptoMarket.put("LTC", new ArrayList<>(List.of(200.0, 210.0, 220.0)));

        System.out.println("===== Crypto Market Data =====");
        MyMap.printMap(cryptoMarket);

        // Example of using MyStack
        System.out.println("===== Book Stack =====");
        MyStack bookStack = new MyStack();
        bookStack.pushBook("The Catcher in the Rye");
        bookStack.pushBook("To Kill a Mockingbird");
        bookStack.pushBook("1984");

        bookStack.printStack();
        System.out.println("Top book: " + bookStack.lookAtTopBook());
        bookStack.printStack();
        System.out.println("Popped book: " + bookStack.popBook());
        bookStack.printStack();


        System.out.println("===== Queue Section =====");
        MyQueue mhalaQueue = new MyQueue();
        mhalaQueue.enqueue("Ada");
        mhalaQueue.enqueue("Bola");
        mhalaQueue.enqueue("Mossda");
        mhalaQueue.enqueue("Muuda");

        while (mhalaQueue.NotEmpty()) {
            try {
                System.out.println("Next in queue: " + mhalaQueue.dequeue());
                Thread.sleep(2000); // Simulate processing time
            } catch (InterruptedException e) {
                System.err.println("Thread was interrupted: " + e.getMessage());
            }
        }

        System.out.println("Queue is now empty.");

        // Priority Queue Example
        System.out.println("===== Priority Queue Section =====");
        Queue<Integer> orthopedicQueue = new PriorityQueue<>(Comparator.reverseOrder());
        orthopedicQueue.add(35);
        orthopedicQueue.add(20);
        orthopedicQueue.add(50);
        orthopedicQueue.add(100);

        System.out.println("Priority Queue : " + orthopedicQueue);
    }
}

// Pair Programming or Extreme Programming
// is a software development technique in which two programmers work together at one workstation.
// One, the "driver", writes code while the other, the "observer" or "navigator", reviews each line of code as it is written.
// The two programmers switch roles frequently.