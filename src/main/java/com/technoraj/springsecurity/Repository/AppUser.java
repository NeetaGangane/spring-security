package com.technoraj.springsecurity.Repository;

import javax.persistence.*;

@Entity
@Table(name="appuser")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="userName")
    private String userName;

    @Column(name="userPassword")
    private String userPassword;

    public Long getUserId() {
        return id;
    }

    public void setUserId(Long userId) {
        this.id = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
