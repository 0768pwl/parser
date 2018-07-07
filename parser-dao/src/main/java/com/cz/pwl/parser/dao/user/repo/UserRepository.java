package com.cz.pwl.parser.dao.user.repo;

import com.cz.pwl.parser.dao.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

}
