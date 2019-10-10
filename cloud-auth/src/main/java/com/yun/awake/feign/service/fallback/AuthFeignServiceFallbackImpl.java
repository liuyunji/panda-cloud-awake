package com.yun.awake.feign.service.fallback;

import com.yun.awake.feign.service.AuthFeignService;
import org.springframework.stereotype.Component;

/**
 * @author Awake
 * @date 2019/9/27 13:52
 */
@Component
public class AuthFeignServiceFallbackImpl implements AuthFeignService {

    @Override
    public String hello(String name) {
        return "hello"+name+", this is cloud-auth,but request error";
    }
}
