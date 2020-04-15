import interfaceSegregationPrinciple.KafkaConfig;
import interfaceSegregationPrinciple.MySqlConfig;
import interfaceSegregationPrinciple.RedisConfig;
import interfaceSegregationPrinciple.ScheduledUpdater;
import interfaceSegregationPrinciple.config.ConfigSource;
import interfaceSegregationPrinciple.config.ZookeeperConfigSource;
import interfaceSegregationPrinciple.server.SimpleHttpServer;

/**
 * @author linkuan
 * @version 1.0
 * @since 2020/4/15 17:54
 */
public class Application {
    static final ConfigSource configSource = new ZookeeperConfigSource();
    public static final RedisConfig redisConfig = new RedisConfig(configSource);
    public static  final KafkaConfig kafkaConfig = new KafkaConfig(configSource);
    public static final MySqlConfig mysqlConfig = new MySqlConfig(configSource);
    public static void main(String[] args) {
        ScheduledUpdater redisConfigUpdater = new ScheduledUpdater(redisConfig, 300, 300);
        redisConfigUpdater.run();
        ScheduledUpdater kafkaConfigUpdater =            new ScheduledUpdater(kafkaConfig, 60, 60);
        redisConfigUpdater.run();
        SimpleHttpServer simpleHttpServer = new SimpleHttpServer("127.0.0.1", 2389);
        simpleHttpServer.addViewer("/config", redisConfig);
        simpleHttpServer.addViewer("/config", mysqlConfig);
        simpleHttpServer.run();
    }
}
