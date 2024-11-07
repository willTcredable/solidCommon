/**
 * Copyright (C) AIM Group (T) Limited - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package com.solidmetal.comms.inbound;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author Solid Metal
 */
public abstract class AbstractConsumer<T> {

    public void processMessage(final T message, ThreadPoolTaskExecutor threadPoolTaskExecutor) {
        if(threadPoolTaskExecutor != null) {
            threadPoolTaskExecutor.submit(new Runnable() {
                @Override
                public void run() {
                    process(message);
                }
            });
        }
    }

    abstract void process(T message);
}