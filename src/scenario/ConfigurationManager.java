package scenario;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {

    private static ConfigurationManager instance;

    private ConfigurationManager() {};

    private Map<String, Object> configs = new HashMap<>();

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public void addConfiguration(String key, Object value)  {
        configs.put(key, value);
    }

    public Object getConfiguration(String key) {
        return configs.getOrDefault(key, null);
    }
}
