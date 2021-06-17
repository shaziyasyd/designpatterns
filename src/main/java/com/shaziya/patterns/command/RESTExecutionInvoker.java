package com.shaziya.patterns.command;

import lombok.Setter;

import java.util.Map;

@Setter
public class RESTExecutionInvoker {
    private IRestAPIExecutor iRestAPI;

    public String execute(String path,
                          Map<String, String> headers,
                          Map<String, String> query,
                          String bodyJson) {
        return this.iRestAPI.execute(path, headers, query, bodyJson);
    }
}
