package tinyblog.service;

import tinyblog.model.entity.User;

public interface UserService {
    void add(User user) throws Exception;

    void edit(User user) throws Exception;

    void delete(User user);
}
