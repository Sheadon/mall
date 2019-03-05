package com.sheadon.service;

import com.sheadon.common.ServerResponse;
import com.sheadon.pojo.User;

public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str,String type);
}
