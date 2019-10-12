/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.client.service.impl;

import com.gyoomi.client.service.IUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-10-12 10:32
 */
@Service
public class UserServiceImpl implements IUserService {


    @Override
    @HystrixCommand(fallbackMethod = "defaultUser")
    public String getUser(String username) throws Exception {
        if ("hystrix".equals(username)) {
            return "hello hystrix, this is real user!!!";
        } else {
            throw new Exception();
        }
    }

    public String defaultUser(String usename) {
        return "The user does not exist in this system";
    }
}
