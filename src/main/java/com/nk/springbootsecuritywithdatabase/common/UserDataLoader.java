package com.nk.springbootsecuritywithdatabase.common;

import com.nk.springbootsecuritywithdatabase.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDataLoader implements ApplicationRunner {

    private UserRepository userRepository;


    @Autowired
    public UserDataLoader(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        userRepository.save(new UserInfo("sean", "$2a$10$VtOI/NbNfv.K7rUBiEMSHOnb6sXyf2xvziCYJ7qqZXLLBcpc6Bmvy", "Sean Murphy", "ROLE_ADMIN", "US", 1));
        userRepository.save(new UserInfo("martin", "b36dWqOE0ihHFIZymMO6meh9GaJbjIa7tOvQCOnPYa5Vo7wJJKsEi", "Martin Bingel", "ROLE_USER", "India", 1));

       // martin', 'b36dWqOE0ihHFIZymMO6meh9GaJbjIa7tOvQCOnPYa5Vo7wJJKsEi', 'Martin Bingel', 'ROLE_USER', 'India', 1
    }
}
