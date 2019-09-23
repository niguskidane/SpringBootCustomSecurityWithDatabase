package com.nk.springbootsecuritywithdatabase.common;

import com.nk.springbootsecuritywithdatabase.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TopicDataLoader implements ApplicationRunner {

    private TopicRepository topicRepository;
    private UserRepository userRepository;

    @Autowired
    public TopicDataLoader(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        topicRepository.save(new Topic(1, "Spring Rest Boot", "Spring Boot"));
        topicRepository.save(new Topic(2, "Spring Boot Security", "Spring Boot"));
        topicRepository.save(new Topic(3, "Spring MVC Framework", "Spring Framework"));
    }
}
