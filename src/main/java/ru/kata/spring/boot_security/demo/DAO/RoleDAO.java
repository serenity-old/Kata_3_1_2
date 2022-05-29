package ru.kata.spring.boot_security.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.Role;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface RoleDAO extends JpaRepository<Role, Long> {
}
