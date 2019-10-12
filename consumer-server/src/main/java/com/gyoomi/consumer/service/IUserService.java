/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.consumer.service;

import com.gyoomi.consumer.service.fallback.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The description of interface
 *
 * @author Leon
 * @date 2019-10-12 10:31
 */
@FeignClient(value = "sc-provider-service", fallback = UserServiceFallback.class)
public interface IUserService {

    @GetMapping(value = "/getUser")
    String getUser(@RequestParam("username") String username) throws Exception;
}
