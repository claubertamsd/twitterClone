package com.social.mentweet.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.social.mentweet.model.TweetModel;

@Repository
public interface TweetRepository extends JpaRepository<TweetModel, UUID> {

}
