package com.example.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.util.logging.Logger;

public class UserContextInterceptor implements ClientHttpRequestInterceptor {
    private static final Logger logger = Logger.getLogger(UserContextInterceptor.class.getName());
    @Override
    public ClientHttpResponse intercept(HttpRequest request,
                                        byte[] body, ClientHttpRequestExecution execution) throws IOException {

        HttpHeaders  headers = request.getHeaders();
        headers.add(UserContext.CORRELATION_ID,
                UserContextHolder.getContext().
                        getCorrelationId());
        headers.add(UserContext.AUTH_TOKEN,
                UserContextHolder.getContext().
                        getAuthToken());
        return execution.execute(request, body);
    }
}
