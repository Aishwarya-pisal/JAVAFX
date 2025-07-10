package com.july_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");

        String link ="https://services.isrostats.in/api/spacecraft";
        URL  url = new URL(link );
        HttpURLConnection httpURLConnection =
        (HttpURLConnection)url.openConnection();
        httpURLConnection.setRequestMethod("GET");
    BufferedReader br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
StringBuilder response = new StringBuilder();
String temp = br.readLine();
while (temp !=null) {
    response.append(temp);
    temp = br.readLine();

    
}   
System.out.println(response);
 } 
}