package tcp_test;

import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 6000);
        System.out.println("Client connected to Server.");
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        while (true) {
            String data = br.readLine();
            System.out.println("Client data : " + data);
        }
    }
}
