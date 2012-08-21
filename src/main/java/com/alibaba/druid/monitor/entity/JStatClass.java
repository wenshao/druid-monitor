package com.alibaba.druid.monitor.entity;

/**
 * 对应jstat -class <pid>
 * @author wenshao<szujobs@hotmail.com>
 *
 */
public class JStatClass {

    private int   loaded;
    private int   loadedBytes;
    private int   unloaded;
    private int   unloadedBytes;
    private float time;

    public int getLoaded() {
        return loaded;
    }

    public void setLoaded(int loaded) {
        this.loaded = loaded;
    }

    public int getLoadedBytes() {
        return loadedBytes;
    }

    public void setLoadedBytes(int loadedBytes) {
        this.loadedBytes = loadedBytes;
    }

    public int getUnloaded() {
        return unloaded;
    }

    public void setUnloaded(int unloaded) {
        this.unloaded = unloaded;
    }

    public int getUnloadedBytes() {
        return unloadedBytes;
    }

    public void setUnloadedBytes(int unloadedBytes) {
        this.unloadedBytes = unloadedBytes;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

}
