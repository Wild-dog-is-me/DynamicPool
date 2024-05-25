package com.workplat.middleware.dynamic.thread.pool.sdk.domain;

import com.workplat.middleware.dynamic.thread.pool.sdk.domain.model.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @Author: Odin
 * @Date: 2024/5/25 17:24
 * @Description:
 */
public interface IDynamicThreadPoolService {

    // 查询线程池配置集合
    List<ThreadPoolConfigEntity> queryThreadPoolList();

    // 查询单个线程池配置
    ThreadPoolConfigEntity queryThreadPoolConfigByName(String threadPoolName);

    // 更新线程池配置
    void updateThreadPoolConfig(ThreadPoolConfigEntity threadPoolConfigEntity);

}
