package com.homebudget.user.service;

import com.homebudget.user.entity.User;

public interface UserService {

	User findUserByNick(String nick);
}
