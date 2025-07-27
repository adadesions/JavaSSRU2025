package MyCollections;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    // List is a collection of elements that can be accessed by index.
    // ArrayList is a resizable array implementation of the List interface.

    public void showCase() {
        List<Integer> intList = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            intList.add(i);
        }

        // Print the list
        System.out.println("List of integers from 0 to 100:");
        System.out.println(intList);
    }

    public void showCaseFindIndexOfElement() {
        List<String> animeList = new ArrayList<>();
        animeList.add("Naruto");
        animeList.add("One Piece");
        animeList.add("Attack on Titan");
        animeList.add("Death Note");
        animeList.add("My Hero Academia");

        // Find the index of an element
        int indexOnePiece = animeList.indexOf("One Piece123");
        if (indexOnePiece != -1) {
            System.out.println("Index of 'One Piece': " + indexOnePiece);
        } else {
            System.out.println("'One Piece' not found in the list.");
        }
    }
}
