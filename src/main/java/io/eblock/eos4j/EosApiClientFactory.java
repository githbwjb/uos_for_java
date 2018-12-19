package io.eblock.eos4j;

import io.eblock.eos4j.api.service.RpcService;

public class EosApiClientFactory {

    private String baseUrl;

    private String walletBaseUrl;

    private String chainBaseUrl;

    private String historyBaseUrl;

    private EosApiClientFactory(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public static EosApiClientFactory newInstance(String baseUrl) {
        return new EosApiClientFactory(baseUrl);
    }

    public EosApiRestClient newRestClient() {
        return new EosRpcService(baseUrl);
    }

}
