package com.alibaba.druid.monitor.entity.config;

public class OS {

    public static final String OS_TYPE_GNU_LINUX = "GNU/Linux";

    public static final String OS_ARCH_X86_32    = "x86_32";
    public static final String OS_ARCH_X86_64    = "x86_64";

    private String             type;
    private String             kernel;
    private String             version;
    private String             arch;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKernel() {
        return kernel;
    }

    public void setKernel(String kernel) {
        this.kernel = kernel;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

}
