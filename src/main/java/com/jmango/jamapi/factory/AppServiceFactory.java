package com.jmango.jamapi.factory;

import com.jmango.jamapi.facade.AppService;
import com.jmango.jamapi.service.MagentoAppService;
import com.jmango.jamapi.service.SeoShopAppService;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AppServiceFactory {
    ApplicationContext context;

    public AppService getAppService(String appKey) {
        switch(appKey) {
            case "magentoApp":
                return context.getBean(MagentoAppService.class);
            case "SEOShopApp":
                return context.getBean(SeoShopAppService.class);
            default:
                throw new IllegalArgumentException("app is not supported");
        }
    }
}
