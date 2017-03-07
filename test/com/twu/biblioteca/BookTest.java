package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by caitlingulliford on 06/03/2017.
 */
public class BookTest {

    @Test
    public void shouldPrintFormattedBk() {
        Book testBook = new Book("Cooking with Coolio", "Coolio", 2015);
        String expected = "| Title: Cooking with Coolio | Author: Coolio | Published: 2015 |";
        assertEquals(expected, testBook.toString());
    }
}
