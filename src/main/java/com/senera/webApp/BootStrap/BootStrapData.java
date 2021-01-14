package com.senera.webApp.BootStrap;

import com.senera.webApp.Model.Author;
import com.senera.webApp.Model.Book;
import com.senera.webApp.repository.AuthorRepository;
import com.senera.webApp.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Senera Madushan
 * @comment
 */
@Component
public class BootStrapData implements CommandLineRunner {


    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;


    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author senera = new Author("Senera","Madushan");
        Book b1 = new Book("JAVA Fundementals","123456");
        senera.getBooks().add(b1);
        b1.getAuthors().add(senera);

        authorRepository.save(senera);
        bookRepository.save(b1);

        Author lahiru = new Author("Lahiru","Perera");
        Book b2 = new Book("How to Sing","43255");
        lahiru.getBooks().add(b2);
        b2.getAuthors().add(lahiru);

        authorRepository.save(lahiru);
        bookRepository.save(b2);

        System.out.println("Bootstarp Started...");
        System.out.println("Number of books "+ bookRepository.count());
        System.out.println("Number of authors "+authorRepository.count());



    }
}
