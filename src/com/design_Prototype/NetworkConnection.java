package com.design_Prototype;

public class NetworkConnection implements Cloneable{
    private String ip;

    private String impdata;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImpdata() {
        return impdata;
    }

    public void setImpdata(String impdata) {
        this.impdata = impdata;
    }

    public void loadVeryImpData() throws InterruptedException {
        this.impdata="very very imp data";
        Thread.sleep(2000);
    }

    @Override
    public String toString() {
        return this.ip+" "+this.impdata;
    }

    @Override
    public NetworkConnection clone() {
        try {
            NetworkConnection clone = (NetworkConnection) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
