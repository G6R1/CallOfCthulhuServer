package ru.grndev.cthulhuserver.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.grndev.cthulhuserver.models.users.Role;
import ru.grndev.cthulhuserver.models.users.RolesValue;
import ru.grndev.cthulhuserver.models.users.User;
import ru.grndev.cthulhuserver.repositories.UserRepository;

import java.util.Collections;

@Component
public class UserService implements UserDetailsService { //UserDetailsService для конфига был нужен

    private final UserRepository userRepository;
    private final PasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, @Lazy PasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String login) {
        User user = userRepository.findByLogin(login);
        if (user == null) {
            throw new UsernameNotFoundException("Unknown user: "+ login);
        }
        return user; //извлечение пользователя из бд
    }

    public boolean saveUser(User user) {
        User userFromDB = userRepository.findByLogin(user.getUsername());

        if (userFromDB != null) {
            return false;
        }

        user.setRoles(Collections.singleton(new Role(4L, RolesValue.ROLE_USER.toString())));
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        userRepository.save(user);

        return true;
    }

    public User createCreator() {
        User user = new User(null,
                "grn",
                bCryptPasswordEncoder.encode("flvbybuhsvfu109"),
                "gerian109@yandex.ru",
                "creator",
                Collections.singleton(new Role(1L, RolesValue.ROLE_ADMIN.toString())));
        return userRepository.save(user);
    }


//    @Override
//    public User registerNewUserAccount(UserDto accountDto) throws EmailExistsException {
//        if (emailExist(accountDto.getEmail())) {
//            throw new EmailExistsException(
//                    "There is an account with that email adress:" + accountDto.getEmail());
//        }
//        User user = new User();
//        user.setFirstName(accountDto.getFirstName());
//        user.setLastName(accountDto.getLastName());
//
//        user.setPassword(passwordEncoder.encode(accountDto.getPassword()));
//
//        user.setEmail(accountDto.getEmail());
//        user.setRole(new Role(Integer.valueOf(1), user));
//        return repository.save(user);
//
//    }
}
