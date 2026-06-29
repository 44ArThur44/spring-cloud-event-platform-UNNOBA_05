package ar.edu.unnoba.pdyc2026.userservice.repository;

import ar.edu.unnoba.pdyc2026.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
