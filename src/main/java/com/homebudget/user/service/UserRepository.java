package com.homebudget.user.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homebudget.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}