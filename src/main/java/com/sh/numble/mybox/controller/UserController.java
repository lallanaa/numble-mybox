package com.sh.numble.mybox.controller;

import com.sh.numble.mybox.entity.User;
import com.sh.numble.mybox.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserInfo(@PathVariable("userId")String userId) {
        return ResponseEntity.ok().body(userService.getUserInfo(userId));
    }


}
