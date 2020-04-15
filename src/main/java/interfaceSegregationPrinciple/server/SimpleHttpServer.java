package interfaceSegregationPrinciple.server;

import interfaceSegregationPrinciple.output.Viewer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author linkuan
 * @version 1.0
 * @since 2020/4/15 17:50
 */
public class SimpleHttpServer {
    private String host;

    private int port;

    private Map<String, List<Viewer>> viewers = new HashMap<>();

    public SimpleHttpServer(String host, int port) {
        this.host = host;
        this.port = port;
    }

     public void addViewer(String urlDirectory, Viewer viewer) {
        if (!viewers.containsKey(urlDirectory)) {
            viewers.put(urlDirectory, new ArrayList<Viewer>());
        }
        this.viewers.get(urlDirectory).add(viewer);
    }

     public void run() {

     }
}
