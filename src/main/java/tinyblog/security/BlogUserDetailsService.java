package tinyblog.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tinyblog.model.entity.User;
import tinyblog.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogUserDetailsService implements UserDetailsService{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        User existingUser = userRepository.findByLogin(s);

        if (existingUser == null) {
            try {
                throw new Exception("ѕользовател€ с таким логином не существует");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
                existingUser.getLogin(), existingUser.getPassword(),true, true, true, true, authorities);
        return userDetails;
    }
}
