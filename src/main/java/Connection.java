/**
 * Created by katie on 1/23/16.
 */
public class Connection {
    private int port;
    private String ipAddress;

    private Connection(int port, String ipAddress){
        this.port = port;
        this.ipAddress = ipAddress;
    }

    static Connection makeConnection(int port, String ipAddress){
        return new Connection(port, ipAddress);
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getPort() {
        return port;
    }

    public String getIpAddress() {
        return ipAddress;
    }
}
