package ru.grndev.cthulhuserver.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import ru.grndev.cthulhuserver.models.users.User;

@Component
public class UserService implements UserDetailsService { //UserDetailsService для конфига был нужен

    @Override
    public UserDetails loadUserByUsername(String username) {
        return null; //извлечение пользователя из бд
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
