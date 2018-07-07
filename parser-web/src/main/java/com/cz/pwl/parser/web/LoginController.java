package com.cz.pwl.parser.web;

import com.cz.pwl.parser.dao.user.entity.UserEntity;
import com.cz.pwl.parser.dao.user.repo.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述:用户登录Controller
 *
 * @author panwl
 * @create 2018-07-08
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    private UserRepository userRepository;

    @Autowired
    public LoginController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/doLogin")
    public List<UserEntity> doLogin(){
        logger.info("user login --->");
        return userRepository.findAll();
    }
}
