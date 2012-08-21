package com.alibaba.druid.monitor.entity;

public class Server {

    public static final String OS_TYPE_GNU_LINUX = "GNU/Linux";

    public static final String OS_ARCH_X86_32    = "x86_32";
    public static final String OS_ARCH_X86_64    = "x86_64";

    /**
     * 服务器的唯一编码
     */
    private String             number;

    private Cpu                cpu;
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

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public static class OS {

        private String type;
        private String kernel;
        private String version;
        private String arch;

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

    public static class NetworkInterface {

        private String macAddr;

        /**
         * 速率
         */
        private long   rate;

        public String getMacAddr() {
            return macAddr;
        }

        public void setMacAddr(String macAddr) {
            this.macAddr = macAddr;
        }

        public long getRate() {
            return rate;
        }

        public void setRate(long rate) {
            this.rate = rate;
        }
    }

    public static class Disk {

    }

    public static class Cpu {

        private String type;
        private int    count;
        private int    coreCount;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getCoreCount() {
            return coreCount;
        }

        public void setCoreCount(int coreCount) {
            this.coreCount = coreCount;
        }
    }

    public static class Software {

        private String name;
        private String version;
        /**
         * 大小，单位KB
         */
        private long   size;

        /**
         * 安装包格式，比如rpm
         */
        private String format;

        private String description;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public long getSize() {
            return size;
        }

        public void setSize(long size) {
            this.size = size;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }
}
