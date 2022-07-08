package com.example.reactbackendselfattempt.book;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BookRepositoryTest {
BookRepository bookRepository = new BookRepository();

    @Test
    void getAll() {
        assertEquals(4, bookRepository.getAll().size());
    }
    @Test
    void get() {
        assertEquals("The Dawn of Everything", bookRepository.get(2L).getTitle());
    }
    @Test
    void add() {
        assertEquals(4, bookRepository.getAll().size());
        var title = "Title";
        var author = "Author";
        bookRepository.add(new Book(1L, "Title", "Author"));
        assertAll( () -> assertEquals(5, bookRepository.getAll().size()),
                () -> assertEquals(title, bookRepository.get(5L).getTitle()),
                () -> assertEquals(author, bookRepository.get(5L).getAuthor())
        );
    }

    @Test

    void delete() {
        assertEquals(4, bookRepository.getAll().size()); bookRepository.delete(1L);
        assertEquals(3, bookRepository.getAll().size());
    }
    @Test
    void deleteWithNonExistingId() {
        NoSuchElementException thrown = Assertions.assertThrows(NoSuchElementException.class, () -> bookRepository.delete(999L));
    } }




