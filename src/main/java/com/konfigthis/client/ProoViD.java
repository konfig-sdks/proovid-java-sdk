package com.konfigthis.client;

import com.konfigthis.client.api.AddressApi;
import com.konfigthis.client.api.DocumentApi;
import com.konfigthis.client.api.HealthApi;
import com.konfigthis.client.api.NaturalPersonApi;
import com.konfigthis.client.api.ScreeningApi;

public class ProoViD {
    private ApiClient apiClient;
    public final AddressApi address;
    public final DocumentApi document;
    public final HealthApi health;
    public final NaturalPersonApi naturalPerson;
    public final ScreeningApi screening;

    public ProoViD() {
        this(null);
    }

    public ProoViD(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.address = new AddressApi(this.apiClient);
        this.document = new DocumentApi(this.apiClient);
        this.health = new HealthApi(this.apiClient);
        this.naturalPerson = new NaturalPersonApi(this.apiClient);
        this.screening = new ScreeningApi(this.apiClient);
    }

}
