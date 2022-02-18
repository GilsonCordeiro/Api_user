package com.api_user.Api_user.repository;

import com.api_user.Api_user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
