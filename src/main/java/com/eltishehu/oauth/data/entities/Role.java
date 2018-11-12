package com.eltishehu.oauth.data.entities;

import java.util.Set;

/**
 * Created by e.sh. on 12-Nov-18
 */
public class Role {

    private Integer id;
    private String name;
    private Set<User> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
