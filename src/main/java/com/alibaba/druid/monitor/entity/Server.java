package com.alibaba.druid.monitor.entity;

import com.alibaba.druid.monitor.entity.config.CPU;
import com.alibaba.druid.monitor.entity.config.OS;

/**
 * 服务器信息
 * 
 * @author wenshao<szujobs@hotmail.com>
 */
public class Server {

    public static final String OS_TYPE_GNU_LINUX = "GNU/Linux";

    public static final String OS_ARCH_X86_32    = "x86_32";
    public static final String OS_ARCH_X86_64    = "x86_64";

    /**
     * 服务器的唯一编码
     */
    private String             number;

    private CPU                cpu;
    private OS                 os;

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
}
