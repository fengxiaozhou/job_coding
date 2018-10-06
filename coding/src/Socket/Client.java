package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author Fz
 * @date 2018/10/3 20:56
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",4700);
        BufferedReader sin=new BufferedReader(
                new InputStreamReader(System.in)
        );
        PrintWriter os=new PrintWriter(socket.getOutputStream());
        BufferedReader is=new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        System.out.println("Client----------------");
        String readline;
        readline=sin.readLine();
        while (!readline.equals("bye")){
            os.println(readline);
            os.flush();
            System.out.println("Server:"+is.readLine()+"\n");
            readline=sin.readLine();
        };
        os.close();
        is.close();
        socket.close();
    }
}
