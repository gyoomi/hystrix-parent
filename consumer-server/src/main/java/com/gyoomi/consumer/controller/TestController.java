/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.consumer.controller;

import com.gyoomi.consumer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-10-12 10:54
 */
@RestController
public class TestController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public String getUser(@RequestParam("username") String username) throws Exception{
        return userService.getUser(username);
    }
}
