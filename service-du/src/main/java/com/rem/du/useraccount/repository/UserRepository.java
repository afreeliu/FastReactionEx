package com.rem.du.useraccount.repository;

import com.rem.du.useraccount.model.UItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UItem, Long> {

    UItem findUserByEmail(String email);

    UItem saveAndFlush(UItem user);

}