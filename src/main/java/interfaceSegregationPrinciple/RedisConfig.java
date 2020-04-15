package interfaceSegregationPrinciple;

import interfaceSegregationPrinciple.config.ConfigSource;
import interfaceSegregationPrinciple.output.Updater;
import interfaceSegregationPrinciple.output.Viewer;

import java.util.Map;

/**
 * @author linkuan
 * @version 1.0
 * @since 2020/4/15 17:26
 */
public class RedisConfig implements Updater, Viewer {
    private ConfigSource configSource;
    //配置中心（比如zookeeper）
    private String address;
    private int timeout;
    private int maxTotal;
    //省略其他配置: maxWaitMillis,maxIdle,minIdle...
    public RedisConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }
    public String getAddress() {
        return this.address;
    }
    public void update() {

    }

    @Override
    public String outputInPlainText() {
        return null;
    }

    @Override
    public Map output() {
        return null;
    }
}
