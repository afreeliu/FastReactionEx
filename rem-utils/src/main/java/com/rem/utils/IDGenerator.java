package com.rem.utils;

public class IDGenerator {

    public String getUniqueID(String prefix) {
        synchronized (IDGenerator.class) {
            return prefix + "_" + getUniqueID();
        }
    }
    public String getUniqueID() {
        synchronized (IDGenerator.class) {
            return Long.toHexString(System.currentTimeMillis());
        }
    }
}