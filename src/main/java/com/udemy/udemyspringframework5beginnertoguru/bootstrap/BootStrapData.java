package com.udemy.udemyspringframework5beginnertoguru.bootstrap;

import com.udemy.udemyspringframework5beginnertoguru.domain.Author;
import com.udemy.udemyspringframework5beginnertoguru.domain.Book;
import com.udemy.udemyspringframework5beginnertoguru.domain.Publisher;
import com.udemy.udemyspringframework5beginnertoguru.repositories.AuthorRepository;
import com.udemy.udemyspringframework5beginnertoguru.repositories.BookRepository;
import com.udemy.udemyspringframework5beginnertoguru.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("Kyiv");
        publisher.setState("KY");

        publisherRepository.save(publisher);

        Author bohdan = new Author("Bohdan", "Kalika");
        Book ddd = new Book("Domain Driven Design", "1234");
        bohdan.getBooks().add(ddd);
        ddd.getAuthors().add(bohdan);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(bohdan);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Jonhson");
        Book noEJB = new Book("J2EE", "4321");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);
        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        System.out.println("Publisher Count: " + publisherRepository.count());
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
    }
}
