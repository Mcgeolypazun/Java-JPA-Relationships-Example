package com.sparta.jpaadvance.repository;

import com.sparta.jpaadvance.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
