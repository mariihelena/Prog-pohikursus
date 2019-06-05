import java.io.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.URI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;

public interface Kraapija {
    public void startKraapija();
    public void webRequest();
    public void saveFile();
    public void endKraapija();
}

class Functions implements Kraapija {
    public void startKraapija() {
        System.out.println("Kraapija alustab tööd");
    }

    public void webRequest() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://reqres.in/api/users?page=2")).build();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            System.out.println(response.body());
    
            HttpClient client2 = HttpClient.newHttpClient();
            HttpRequest request2 = HttpRequest.newBuilder().uri(URI.create("https://reqres.in/api/users?page=2")).build();
            client2.sendAsync(request2, BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveFile() {
        System.out.println("Test");

        /*
        String filename;

        filename = JOptionPane.showInputDialog("Enter the site");
        PrintWriter outputFile = new PrintWriter("files\\"+filename+".html");

        URL url = new URL("https://reqres.in/api/users?page=2");


        URLConnection con = url.openConnection();
        InputStream is =con.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;


        while ((line = br.readLine()) != null) {
            System.out.println(line);
            outputFile.println(line);
        }
        br.close();
        outputFile.close();
        */
    }
    

    public void endKraapija() {
        System.out.println("Kraapija sulgeb");
    } 
}

class MainClass {

    public static void main(String[] args) {
        Functions func = new Functions();
        func.startKraapija();
        func.webRequest();
        func.saveFile();
        func.endKraapija();
    }
}