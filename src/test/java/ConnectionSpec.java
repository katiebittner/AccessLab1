import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by katie on 1/23/16.
 */
public class ConnectionSpec {

    Connection test1 = Connection.makeConnection(1234, "12.345.678.901");
    Connection test2 = Connection.makeConnection(4321, "10.987.654.321");

    @Test
    public void ConnectionTest() {
        assertTrue(Connection.makeConnection(9876, "12.121.121.121").getClass().equals(Connection.class));

    }
}

