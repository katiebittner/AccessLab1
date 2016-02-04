import java.util.ArrayList;

/**
 * Created by katie on 1/23/16.
 */
public class ConnectionManager {
    private static int currentConnections;
    private static int maxConnections = 3;
    private static ArrayList<Connection> connections = new ArrayList<Connection>();

    public static void main(String[] args) {
        connectionManagerTest();

    }

    public static void connectionManagerTest() {
        addConnection(1001, "10.000.000.001");
        addConnection(1002, "10.000.000.002");
        addConnection(1003, "10.000.000.003");
        displayConnection();

    }

    public static void addConnection(int port, String ipAddress) {
        Connection connection = makeConnection(port, ipAddress);
        if (connection != null) {
            connections.add(connection);
        }

    }


    public static void removeConnection(int index) {
        connections.remove(index);
    }

    public static void displayConnection() {
        System.out.println("Current connections:");
        for (Connection c : connections) {
            System.out.println(c);
        }
    }

    private static Connection makeConnection(int port, String ipAddress) {
        if (currentConnections < maxConnections) {
            currentConnections++;
            return Connection.makeConnection(port, ipAddress);
        } else {
            return null;
        }
    }
}