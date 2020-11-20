package com.safecustody.sdk;


public class Sdk extends Route {

    public String host;

    /**
     * @param user
     */
    public Sdk(User user) {
        super(user);
    }


    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {

        if (host.equals("")) {
            throw new NullPointerException("host没有设置");
        }

        String str1 = host.substring(0, host.length() - 1);
        if (!str1.equals("/")) {
            host = str1 + "/";
        }
        this.host = host;
    }
}
