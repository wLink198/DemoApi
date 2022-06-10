package com.jmango.jamapi.facade;

import com.jmango.jamapi.entity.ApplicationDAO;

public interface AppService {
    ApplicationDAO createApp(String owner, String appName);
}
