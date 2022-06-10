package za.ac.cput.schoolmanagement.repository;

import java.util.Optional;

public interface IRepository <T ,ID> {
    T save(T t);
    Optional<T> read(ID id);
    void delete(ID id);
}
