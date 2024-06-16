package com.sunbase.sunbasephaseone.repository;

import com.sunbase.sunbasephaseone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
