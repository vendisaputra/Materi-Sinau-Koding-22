package com.sinaukoding.tokosinau.service;

import com.sinaukoding.tokosinau.entity.dto.AuthenticationDTO;
import com.sinaukoding.tokosinau.entity.dto.ResponseAuthDTO;
import com.sinaukoding.tokosinau.entity.dto.UserDTO;
import com.sinaukoding.tokosinau.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface AuthService {
    ResponseAuthDTO register(UserDTO data);

    ResponseAuthDTO login(AuthenticationDTO data);
}
