package com.shaziya.patterns.command.impls;

import com.shaziya.patterns.command.IRestAPIExecutor;
import com.shaziya.patterns.command.GenericRESTExecutor;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
@AllArgsConstructor
public class GetAPIExecutorService implements IRestAPIExecutor {

    private final GenericRESTExecutor genericRESTExecutor;

    @Override
    public String execute(String path, Map<String, String> headers, Map<String, String> query, String bodyJson) {
        log.info("In GetAPIExecutorService..... Executing GET call {}", path);
        genericRESTExecutor.makeGetCall(path, headers, query, bodyJson);
        return "Bye!";
    }
}
