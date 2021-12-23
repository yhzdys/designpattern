package com.yhzdys.learning.designpattern.l_proxy._static;

import com.yhzdys.learning.designpattern.l_proxy.job.CoderJob;
import com.yhzdys.learning.designpattern.l_proxy.job.Job;

public class StaticJobProxy {

    public static Job getJobProxy() {
        return new BossJob(new CoderJob());
    }
}
