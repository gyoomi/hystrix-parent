/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.client.controller;

import com.gyoomi.client.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-10-12 10:30
 */
@RestController
public class TestController {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/getUser")
    public String getUser(String username) throws Exception {
        return userService.getUser(username);
    }
}
