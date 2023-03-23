package patternsDesign.builder;

public class Configuration {
    private String prefix;
    private String host;
    private int port;
    private String path;

    public static class Builder {
        private Configuration configuration;

        public Builder() {
            configuration = new Configuration();
        }

        public Builder withHost(String host) {
            configuration.host = host;
            return this;
        }
        public Builder withPort(int port) {
            configuration.port = port;
            return this;
        }
        public Builder withPrefix(String prefix) {
            configuration.prefix = prefix;
            return this;
        }
        public Builder withPath(String path) {
            configuration.path = path;
            return this;
        }
        public Configuration build() {
            return configuration;
        }
    }


}
