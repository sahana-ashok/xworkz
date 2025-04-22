package inter.runner;

import inter.external.ConnectorUser;
import inter.internal.Connector;
import inter.internal.ConnectorImpl;

public class ConnectorRunner {

    public static void main(String[] args) {
        Connector connector = new ConnectorImpl();
        ConnectorUser connectorUser = new ConnectorUser(connector);

        connectorUser.execute();

    }
}
