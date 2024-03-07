package practice.interfaces;

import practice.models.Reader;

import java.util.List;

// Слой доступа к данным (Data Access Layer)
public interface ReaderRepository {
    void registerReader(Reader reader);
    List<Reader> findAllReaders();

    boolean removeReader(Reader reader);
}

