package com.nk.springbootsecuritywithdatabase.common;

import com.nk.springbootsecuritywithdatabase.model.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserInfo, String> {

}
