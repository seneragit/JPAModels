package com.senera.webApp.BootStrap;

import com.senera.webApp.Model.Author;
import com.senera.webApp.Model.Book;
import com.senera.webApp.Model.Publisher;
import com.senera.webApp.repository.AuthorRepository;
import com.senera.webApp.repository.BookRepository;
import com.senera.webApp.repository.PublisherRepository;
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
    private final PublisherRepository publisherRepository;


    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher pub1 = new Publisher("Gunasena","Colombo 07 Sri Lanka","western","eeee","12123");


        publisherRepository.save(pub1);

        Author senera = new Author("Senera","Madushan");
        Book b1 = new Book("JAVA Fundementals","123456");
        senera.getBooks().add(b1);
        b1.getAuthors().add(senera);

        b1.setPublisher(pub1);
        pub1.getBooks().add(b1);

        authorRepository.save(senera);
        bookRepository.save(b1);
        publisherRepository.save(pub1);

        Author lahiru = new Author("Lahiru","Perera");
        Book b2 = new Book("How to Sing","43255");
        lahiru.getBooks().add(b2);
        b2.getAuthors().add(lahiru);

        b2.setPublisher(pub1);
        pub1.getBooks().add(b2);




        authorRepository.save(lahiru);
        bookRepository.save(b2);
        publisherRepository.save(pub1);



        System.out.println("Bootstarp Started...");
        System.out.println("Number of books "+ bookRepository.count());
        System.out.println("Number of authors "+authorRepository.count());
        System.out.println("Number of publshers  "+pub1.getBooks().size());




    }
}
