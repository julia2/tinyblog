package tinyblog.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID> {
    void delete(T entity);

    List<T> findAll();

    T findOne(ID id);

    T save(T entity);
}
