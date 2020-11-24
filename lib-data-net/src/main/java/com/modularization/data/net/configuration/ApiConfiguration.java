package com.modularization.data.net.configuration;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 *         2016/12/10
 */
public class ApiConfiguration {

    private ApiEnv apiEnv;

    private ApiConfiguration(Builder builder) {
        assert builder != null;
        initialize(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(final Builder builder) {
        this.apiEnv = builder.apiEnv;
    }

    public ApiEnv getApiEnv() {
        return apiEnv;
    }

    public static final class Builder {

        private ApiEnv apiEnv;

        private Builder() {
        }

        public ApiConfiguration build() {
            return new ApiConfiguration(this);
        }

        public Builder apiEnv(ApiEnv apiEnv) {
            this.apiEnv = apiEnv;
            return this;
        }
    }

    public enum ApiEnv{
        ENV_TEST,
        ENV_RELEASE,
    }
}
