package com.shaziya.patterns.command;

import com.shaziya.patterns.command.dtos.Request;
import com.shaziya.patterns.command.impls.GetAPIExecutorService;
import com.shaziya.patterns.command.impls.PostAPIExecutorExecutor;

import java.util.HashMap;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Hellloooo there beautiful soul!!!");

        GenericRESTExecutor genericRESTExecutor = new GenericRESTExecutor("https://api.github.com");

        Request getRequest1 = new Request("GET", "/something", new HashMap<>(), new HashMap<>(), "");
        Request postRequest1 = new Request("POST", "/something", new HashMap<>(), new HashMap<>(), "Json Body");

        processRequests(getRequest1, genericRESTExecutor);
        processRequests(postRequest1, genericRESTExecutor);
    }

    private static void processRequests(Request request, GenericRESTExecutor genericRESTExecutor) {
        RESTExecutionInvoker restExecutionInvoker = new RESTExecutionInvoker();
        restExecutionInvoker.setIRestAPI(getExecutorInstance(request.getMethod(), genericRESTExecutor));
        restExecutionInvoker.execute(request.getPath(), request.getHeaders(), request.getQuery(), request.getJsonBody());
    }

    private static IRestAPIExecutor getExecutorInstance(String command, GenericRESTExecutor genericRESTExecutor) {
        return COMMANDS.valueOf(command).getIRestAPIExecutor(genericRESTExecutor);
    }

    private enum COMMANDS {
        GET {
            @Override
            public IRestAPIExecutor getIRestAPIExecutor(GenericRESTExecutor genericRESTExecutor) {
                return new GetAPIExecutorService(genericRESTExecutor);
            }
        },
        POST {
            @Override
            public IRestAPIExecutor getIRestAPIExecutor(GenericRESTExecutor genericRESTExecutor) {
                return new PostAPIExecutorExecutor(genericRESTExecutor);
            }
        };
        public abstract IRestAPIExecutor getIRestAPIExecutor(GenericRESTExecutor genericRESTExecutor);
    }


}
