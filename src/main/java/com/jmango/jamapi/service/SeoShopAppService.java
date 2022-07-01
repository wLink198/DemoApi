package com.jmango.jamapi.service;

import com.jmango.jamapi.constant.Const;
import com.jmango.jamapi.entity.ApplicationDAO;
import com.jmango.jamapi.facade.AppService;
import com.jmango.jamapi.factory.AppServiceFactory;
import org.springframework.stereotype.Service;

@Service
public class SeoShopAppService implements AppService, AppServiceFactory.Injector {

    @Override
    public String getType() {
        return Const.AppService.MAGENTO_APP_KEY;
    }

    @Override
    public ApplicationDAO createApp(String owner, String appName) {
        return new ApplicationDAO();
    }
}
