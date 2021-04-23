package main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        try {
            conectaEPrintURL();

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void conectaEPrintURL() throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder().GET()
                .uri(URI.create("https://kotlinlang.org/"))
                .build();

        HttpClient client = HttpClient.newHttpClient();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status" + response.statusCode());
        System.out.println("Headers " + response.headers());
        System.out.println(response.body());
    }
}
