package com.social.mentweet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.social.mentweet.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
