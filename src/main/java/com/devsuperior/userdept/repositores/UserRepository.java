package com.devsuperior.userdept.repositores;

import com.devsuperior.userdept.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
