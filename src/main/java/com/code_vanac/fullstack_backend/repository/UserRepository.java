package com.code_vanac.fullstack_backend.repository;

import com.code_vanac.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
