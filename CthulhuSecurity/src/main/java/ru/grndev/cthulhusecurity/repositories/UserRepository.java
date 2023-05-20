package ru.grndev.cthulhusecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.grndev.cthulhusecurity.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
