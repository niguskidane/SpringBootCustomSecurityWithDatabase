package com.nk.springbootsecuritywithdatabase.common;

import com.nk.springbootsecuritywithdatabase.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Integer> {

}
