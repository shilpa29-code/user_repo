package com.user.project.service;

import com.user.project.dto.ResponseDto;
import com.user.project.entity.User;

public interface UserService {
	User saveUser(User user);

	ResponseDto getUser(Long userId);
}