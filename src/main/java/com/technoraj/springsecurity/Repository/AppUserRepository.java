package com.technoraj.springsecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface AppUserRepository extends JpaRepository<AppUser,Long> {

    @Query("SELECT aUser FROM AppUser aUser WHERE aUser.userName = ?1")
   AppUser findByUserName(String userName);

}
