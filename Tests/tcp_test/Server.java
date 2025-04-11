package tcp_test;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6000);
        System.out.println("Waiting...");
        Socket server = ss.accept();
        System.out.println("Server Connected with Client");
        // send data
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(server.getOutputStream());
        while (true) {
            String data = sc.nextLine();
            pw.println(data);
            pw.flush();
        }
    }
}
