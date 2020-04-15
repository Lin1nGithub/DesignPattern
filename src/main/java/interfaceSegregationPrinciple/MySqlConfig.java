package interfaceSegregationPrinciple;

import interfaceSegregationPrinciple.config.ConfigSource;
import interfaceSegregationPrinciple.output.Updater;
import interfaceSegregationPrinciple.output.Viewer;

import java.util.Map;

/**
 * @author linkuan
 * @version 1.0
 * @since 2020/4/15 17:56
 */
public class MySqlConfig implements Updater,Viewer {

    private ConfigSource configSource;

    public MySqlConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }

    @Override
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
