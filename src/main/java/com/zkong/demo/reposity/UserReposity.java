package com.zkong.demo.reposity;

import com.zkong.demo.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * title: UserReposity
 * projectName demo
 * description: 用户库
 * author 2671242147@qq.com
 * date 2019-08-10 12:25
 ***/
@Repository
public class UserReposity {

    private final ConcurrentMap userMap = new ConcurrentHashMap<Integer, Object>();

    private final AtomicInteger id = new AtomicInteger();

    public Boolean saveUser(User user) {
        user.setId(id.incrementAndGet());
        return userMap.put(user.getId(), user) == null;
    }

    public List<User> getAllUser() {
        return CollectionUtils.arrayToList(userMap.values().toArray());
    }
}
