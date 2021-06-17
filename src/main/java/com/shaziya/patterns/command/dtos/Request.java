package com.shaziya.patterns.command.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.Map;

@Data
@Getter
@AllArgsConstructor
public class Request {

    private final String method;

    private final String path;
    private final Map<String, String> headers;
    private final Map<String, String> query;
    private final String jsonBody;
}
