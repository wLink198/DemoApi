package com.jmango.jamapi.factory;

import com.jmango.jamapi.facade.AppService;
import com.jmango.jamapi.service.MagentoAppService;
import com.jmango.jamapi.service.SeoShopAppService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
@AllArgsConstructor
@Slf4j
public class AppServiceFactory {
    ApplicationContext context;

    private static Map<String, AppService> serviceMap = new HashMap<>();

    public interface Injector extends AppService {
        String getType();

        @PostConstruct
        default void inject() {
            log.info("Inject App Service: " + getType());
            serviceMap.put(getType(), this);
        }
    }

    public AppService getAppService(String appKey) {
        AppService service = serviceMap.get(appKey);
        if (service == null) {
            throw new IllegalArgumentException("app is not supported");
        }

        return service;
    }
}
