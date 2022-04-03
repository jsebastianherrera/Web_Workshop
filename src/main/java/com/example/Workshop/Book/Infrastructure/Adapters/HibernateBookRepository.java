package com.example.Workshop.Book.Infrastructure.Adapters;

import com.example.Workshop.Book.Domain.Book;
import com.example.Workshop.Book.Domain.Ports.BookRepository;
import com.example.Workshop.Book.Domain.ValueObjects.BookAuthorName;
import com.example.Workshop.Book.Domain.ValueObjects.BookAuthorSurname;
import com.example.Workshop.Book.Domain.ValueObjects.BookTitle;
import com.example.Workshop.Shared.Infrastructure.Hibernate.HibernateRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

@Transactional("transactional-manager")
public class HibernateBookRepository extends HibernateRepository<Book> implements BookRepository {

    public HibernateBookRepository(@Qualifier("session-factory") SessionFactory sessionFactory) {
        super(sessionFactory, Book.class);
    }

    @Override
    public Book save(Book book) {
        return persist(book);
    }

    @Override
    public Optional<Book> findByTitle(BookTitle title) {
        return byId(title);
    }

    @Override
    public Optional<List<Book>> findByAuthor(BookAuthorName name, BookAuthorSurname surname) {
        CriteriaBuilder cb = sessionFactory.getCriteriaBuilder();
        CriteriaQuery<Book> cr = cb.createQuery(Book.class);
        Root<Book> root = cr.from(Book.class);
        Predicate predicateForAuthorName = cb.equal(root.get("bookAuthorName"), name);
        Predicate predicateForAuthorSurname = cb.equal(root.get("bookAuthorSurname"), surname);
        cr.select(root).where(cb.and(predicateForAuthorName, predicateForAuthorSurname));

        return Optional.ofNullable(sessionFactory.getCurrentSession().createQuery(cr).getResultList());
    }
}
