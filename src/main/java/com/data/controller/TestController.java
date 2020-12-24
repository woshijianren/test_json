package com.data.controller;

import com.data.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @GetMapping("/query")
    public List<String> query() {
        return testMapper.query();
    }

    @GetMapping("/http/query")
    public String httpQuery() {
        URL
    }

    public static String doGet(String httpUrl) {
        HttpURLConnection connection = null;
        InputStream is = null;
        BufferedReader br = null;
        String result = null;
        try {
            URL url = new URL(httpUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connectio
        }
    }
}
