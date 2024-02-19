package com.anti.webleruserregistrationlogingyepi.persistence;

import com.anti.webleruserregistrationlogingyepi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
