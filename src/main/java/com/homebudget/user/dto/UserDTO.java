package com.homebudget.user.dto;

import com.homebudget.user.entity.User;

public class UserDTO {

	private String nick;
	private String email;
	private String password;

	public UserDTO() {
	}

	public UserDTO(User user) {
		this.nick = user.getNick();
		this.email = user.getEmail();
		this.password = user.getPassword();
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
