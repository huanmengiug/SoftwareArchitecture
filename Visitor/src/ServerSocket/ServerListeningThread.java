package ServerSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class ServerListeningThread extends Thread {

    private int bindPort;
    private ServerSocket serverSocket;

    public ServerListeningThread(int port) {
        this.bindPort = port;
    }

    @Override
    public void run() {
        try {
            serverSocket = new ServerSocket(bindPort);
            while (true) {
                Socket rcvSocket = serverSocket.accept();

                //单独写一个类，处理接收的Socket，类的定义在下面
                HttpRequestHandler request = new HttpRequestHandler(rcvSocket);
                request.handle();

                rcvSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //最后要确保以下把ServerSocket关闭掉
            if (serverSocket != null && !serverSocket.isClosed()) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class HttpRequestHandler {
    private Socket socket;

    public HttpRequestHandler(Socket socket) {
        this.socket = socket;
    }

    public void handle() throws IOException {
        socket.getOutputStream().
        write((
            "HTTP/1.1 200 OK\r\n" +  //响应头第一行
                "Content-Type: application/json; charset=utf-8\r\n" +  //简单放一个头部信息
                "\r\n" +  //这个空行是来分隔请求头与请求体的
                "<h1>这是响应报文11</h1>\r\n").getBytes());
    }
    public static void main(String[] args) {
        new ServerListeningThread(8888).start();
    }
}

