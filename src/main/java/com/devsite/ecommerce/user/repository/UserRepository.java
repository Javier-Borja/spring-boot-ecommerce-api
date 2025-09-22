package com.devsite.ecommerce.user.repository;

import com.devsite.ecommerce.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
