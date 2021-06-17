package com.shaziya.patterns.command;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/***
 * This is a RECEIVER class. Invoker calls this service to execute command.
 * This might not be present at times. Your implementation can just include concrete command classes.
 */
@AllArgsConstructor
@Slf4j
public class GenericRESTExecutor {

    @NonNull
    private String baseUrl;

    public String makeGetCall(String path,
                              Map<String, String> headers,
                              Map<String, String> query,
                              String bodyJson) {
        log.info("Making get call path = {}", path);
        return "Get response!!";
    }

    public String makePostCall(String path,
                             Map<String, String> headers,
                             Map<String, String> query,
                             String bodyJson) {
        log.info("Making post call path = {}", path);
        return "Post Response!!";
    }

}
