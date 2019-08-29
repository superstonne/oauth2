package com.nick.microservice.account.api;

import com.nick.microservice.account.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: 肖奈（贺金龙）
 * @create: 2019-08-10 17:06
 */
@Controller
public class UserController {

    @GetMapping("/api/user")
    public ResponseEntity<User> getUserInfo() {
//        User user = (User) SecurityContextHolder.getContext()
//                .getAuthentication().getPrincipal();
//        String email = user.getName() + "@spring2go.com";

        User userInfo = new User();
//        userInfo.setName(user.getName());
//        userInfo.setMail(email);

        return ResponseEntity.ok(userInfo);
    }
}
