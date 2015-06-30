package tinyblog.repository;

import tinyblog.model.entity.User;

public interface UserRepository extends BaseRepository<User, Long>{
    User findByLogin(String login);

    User findByEmail(String email);
}
