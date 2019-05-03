package com.rem.du.useraccount.repository;

import com.rem.du.useraccount.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByEmail(String email);

    User saveAndFlush(User user);

}