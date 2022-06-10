package com.jmango.jamapi.controller;

import com.jmango.jamapi.aspect.RestResponse;
import com.jmango.jamapi.entity.ApplicationDAO;
import com.jmango.jamapi.factory.AppServiceFactory;
import com.jmango.jamapi.model.req.CreateAppRequest;
import com.jmango.jamapi.model.res.CreateAppResponse;
import com.jmango.jamapi.model.res.Response;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class JamApi {
    AppServiceFactory appServiceFactory;

    @RequestMapping(value = "**/jmango360/createapp.api", method = RequestMethod.POST)
    @ResponseBody
    @RestResponse
    public Response createApp(@RequestBody CreateAppRequest req) {
        String owner = "";
//        owner = userAuthService.validateAppCreator(req.getTicket());
        ApplicationDAO newApp = appServiceFactory.getAppService(req.getTemplateAppKey()).createApp(owner, req.getAppName());

        return new CreateAppResponse(newApp.getAppKey());
    }
}
