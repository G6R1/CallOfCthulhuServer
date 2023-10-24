package ru.grndev.cthulhuserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.grndev.cthulhuserver.models.users.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
