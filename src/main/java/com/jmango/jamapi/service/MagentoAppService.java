package com.jmango.jamapi.service;

import com.jmango.jamapi.entity.ApplicationDAO;
import com.jmango.jamapi.facade.AppService;
import org.springframework.stereotype.Service;

@Service
public class MagentoAppService implements AppService {
    @Override
    public ApplicationDAO createApp(String owner, String appName) {
        return new ApplicationDAO();
    }
}
