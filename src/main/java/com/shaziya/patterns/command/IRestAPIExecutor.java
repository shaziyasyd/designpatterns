package com.shaziya.patterns.command;

import java.util.Map;

/***
 * This interface is declaration of command
 */
@FunctionalInterface
public interface IRestAPIExecutor {

    public abstract String execute(String path,
                                   Map<String, String> headers,
                                   Map<String, String> query,
                                   String bodyJson);

}
