package tinyblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tinyblog.model.entity.User;
import tinyblog.repository.UserRepository;

import javax.transaction.Transactional;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public void add(User user) throws Exception {

        User existingUser = userRepository.findByLogin(user.getLogin());
        if (existingUser != null) {
            throw new Exception("ѕользователь с таким именем уже существует");
        }

        userRepository.save(user);
    }

    @Override
    @Transactional
    public void edit(User user) throws Exception{

        User existingUser = (User) userRepository.findByLogin(user.getLogin());

        if (existingUser == null) {
            throw new Exception("ѕользователь с таким именем не найден");
        }

        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setBirthDate(user.getBirthDate());
        existingUser.setPassword(user.getPassword());

        userRepository.save(existingUser);
    }

    @Override
    @Transactional
    public void delete(User user) {
        userRepository.delete(user);
    }
}
