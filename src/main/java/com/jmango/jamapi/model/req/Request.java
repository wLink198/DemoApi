package com.jmango.jamapi.model.req;

public class Request {
    private String ticket;
    private String appKey;

    public Request() {
    }

    public Request(String ticket) {
        this(ticket, null);
    }

    public Request(String ticket, String appKey) {
        this.ticket = ticket;
        this.appKey = appKey;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }
}
