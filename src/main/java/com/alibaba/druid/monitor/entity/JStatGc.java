package com.alibaba.druid.monitor.entity;

import com.alibaba.druid.monitor.annotation.StatField;

/**
 * 对应jstat -gc <pid>
 * 
 * @author wenshao<szujobs@hotmail.com>
 */
public class JStatGc {

    @StatField(desc = "年轻代中第一个survivor（幸存区）的容量")
    private float s0c;

    @StatField(desc = "年轻代中第二个survivor（幸存区）的容量")
    private float s1c;

    @StatField(desc = "年轻代中第一个survivor（幸存区）目前已使用空间")
    private float s0u;

    @StatField(desc = "年轻代中第二个survivor（幸存区）目前已使用空间")
    private float s1u;

    @StatField(desc = "年轻代中Eden（伊甸园）的容量")
    private float ec;

    @StatField(desc = "年轻代中Eden（伊甸园）目前已使用空间")
    private float eu;

    @StatField(desc = "Old代的容量")
    private float oc;

    @StatField(desc = "Old代目前已使用空间")
    private float ou;

    @StatField(desc = "Perm(持久代)的容量")
    private float pc;

    @StatField(desc = "Perm(持久代)目前已使用空间")
    private float pu;

    @StatField(desc = "从应用程序启动到采样时年轻代中gc次数")
    private int   ygc;

    @StatField(desc = "从应用程序启动到采样时年轻代中gc所用时间(s)")
    private float ygct;

    @StatField(desc = "从应用程序启动到采样时old代(全gc)gc次数")
    private int   fgc;

    @StatField(desc = "从应用程序启动到采样时old代(全gc)gc所用时间(s)")
    private float fgct;

    @StatField(desc = "从应用程序启动到采样时gc用的总时间(s)")
    private float gct;

    public float getS0c() {
        return s0c;
    }

    public void setS0c(float s0c) {
        this.s0c = s0c;
    }

    public float getS1c() {
        return s1c;
    }

    public void setS1c(float s1c) {
        this.s1c = s1c;
    }

    public float getS0u() {
        return s0u;
    }

    public void setS0u(float s0u) {
        this.s0u = s0u;
    }

    public float getS1u() {
        return s1u;
    }

    public void setS1u(float s1u) {
        this.s1u = s1u;
    }

    public float getEc() {
        return ec;
    }

    public void setEc(float ec) {
        this.ec = ec;
    }

    public float getEu() {
        return eu;
    }

    public void setEu(float eu) {
        this.eu = eu;
    }

    public float getOc() {
        return oc;
    }

    public void setOc(float oc) {
        this.oc = oc;
    }

    public float getOu() {
        return ou;
    }

    public void setOu(float ou) {
        this.ou = ou;
    }

    public float getPc() {
        return pc;
    }

    public void setPc(float pc) {
        this.pc = pc;
    }

    public float getPu() {
        return pu;
    }

    public void setPu(float pu) {
        this.pu = pu;
    }

    public int getYgc() {
        return ygc;
    }

    public void setYgc(int ygc) {
        this.ygc = ygc;
    }

    public float getYgct() {
        return ygct;
    }

    public void setYgct(float ygct) {
        this.ygct = ygct;
    }

    public int getFgc() {
        return fgc;
    }

    public void setFgc(int fgc) {
        this.fgc = fgc;
    }

    public float getFgct() {
        return fgct;
    }

    public void setFgct(float fgct) {
        this.fgct = fgct;
    }

    public float getGct() {
        return gct;
    }

    public void setGct(float gct) {
        this.gct = gct;
    }

}
