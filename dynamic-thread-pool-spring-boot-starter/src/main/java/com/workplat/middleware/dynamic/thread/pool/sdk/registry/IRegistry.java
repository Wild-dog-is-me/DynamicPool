package com.workplat.middleware.dynamic.thread.pool.sdk.registry;

import com.workplat.middleware.dynamic.thread.pool.sdk.domain.model.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @Author: Odin
 * @Date: 2024/5/25 18:59
 * @Description:注册中心接口
 */
public interface IRegistry {

    // 上报线程池
    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    // 上报线程池配置参数
    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);

}
