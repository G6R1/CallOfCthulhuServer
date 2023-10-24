package ru.grndev.cthulhuserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.grndev.cthulhuserver.models.users.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByLogin(String login);
}
