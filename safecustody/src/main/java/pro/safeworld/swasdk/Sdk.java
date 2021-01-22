package pro.safeworld.swasdk;

/**
 * sdk 类
 */
public class Sdk extends Route {


    /**
     * host
     */
    public String host;

    /**
     * @param user User
     */
    public Sdk(User user) {
        super(user);
    }


    /**
     * @return String
     */
    public String getHost() {
        return this.host;
    }


    /**
     * @param host String
     */
    public void setHost(String host) {

        if (host.equals("")) {
            throw new NullPointerException("host没有设置");
        }

        String str1 = host.substring(host.length() - 1);
        if (!str1.equals("/")) {
            host = host + "/";
        }
        this.host = host;
    }
}
