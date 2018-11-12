package com.eltishehu.oauth.data.repositories;

import com.eltishehu.oauth.data.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by e.sh. on 12-Nov-18
 */
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByName(String name);

}
