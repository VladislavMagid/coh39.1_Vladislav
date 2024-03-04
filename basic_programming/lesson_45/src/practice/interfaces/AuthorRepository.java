package practice.interfaces;

import practice.models.Author;

import java.util.List;

// Слой доступа к данным (Data Access Layer)
public interface AuthorRepository {
    void addAuthor(Author author);
    List<Author> findAllAuthors();
}

