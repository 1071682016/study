package com.zyf.study;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudyApplicationTests {

    @Test
    public void contextLoads() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.execute("", HttpMethod.GET, new RequestCallback() {
            @Override
            public void doWithRequest(ClientHttpRequest clientHttpRequest) throws IOException {

            }
        }, new ResponseExtractor<Object>() {
            @Override
            public Object extractData(ClientHttpResponse clientHttpResponse) throws IOException {
                return null;
            }
        });
    }


}
