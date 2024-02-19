package com.anti.webleruserregistrationlogingyepi.persistence;

import com.anti.webleruserregistrationlogingyepi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
