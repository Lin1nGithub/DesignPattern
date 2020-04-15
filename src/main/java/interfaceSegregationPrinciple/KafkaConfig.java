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
public class KafkaConfig implements Updater, Viewer {

    private ConfigSource configSource;

    public KafkaConfig(ConfigSource configSource) {
        this.configSource = configSource;
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
