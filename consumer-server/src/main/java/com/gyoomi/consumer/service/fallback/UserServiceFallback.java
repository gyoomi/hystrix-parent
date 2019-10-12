/**
 * Copyright © 2019, Glodon Digital Supplier BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.consumer.service.fallback;

import com.gyoomi.consumer.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * The description of class
 *
 * @author Leon
 * @date 2019-10-12 10:57
 */
@Component
public class UserServiceFallback implements IUserService {

    /**
     * 出错则调用该方法返回友好错误
     *
     * @param username
     * @return
     * @throws Exception
     */
    @Override
    public String getUser(String username) throws Exception {
        return "The user does not exist in this system, please confirm username";
    }
}
