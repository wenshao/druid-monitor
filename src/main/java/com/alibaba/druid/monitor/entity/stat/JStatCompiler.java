package com.alibaba.druid.monitor.entity.stat;

/**
 * 对应jstat -compiler <pid>
 * 
 * @author wenshao<szujobs@hotmail.com>
 */
public class JStatCompiler {

    private int    compiled;
    private int    failed;
    private int    invalid;
    private float  time;
    private int    failedType;
    private String failedMethod;

    public int getCompiled() {
        return compiled;
    }

    public void setCompiled(int compiled) {
        this.compiled = compiled;
    }

    public int getFailed() {
        return failed;
    }

    public void setFailed(int failed) {
        this.failed = failed;
    }

    public int getInvalid() {
        return invalid;
    }

    public void setInvalid(int invalid) {
        this.invalid = invalid;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public int getFailedType() {
        return failedType;
    }

    public void setFailedType(int failedType) {
        this.failedType = failedType;
    }

    public String getFailedMethod() {
        return failedMethod;
    }

    public void setFailedMethod(String failedMethod) {
        this.failedMethod = failedMethod;
    }

}
