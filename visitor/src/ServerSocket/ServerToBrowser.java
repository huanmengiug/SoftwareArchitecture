package ServerSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import service.billDataAPI;

public class ServerToBrowser {
    public static void main(String[] args) throws IOException {
        try (
                // 创建服务器监听8080端口
                ServerSocket server = new ServerSocket(8088)) {
            while (true) {

                // 阻塞式连接，当接收请求前保持阻塞
                Socket socket_client = server.accept();
                // 跨域请求的地址（*）
                String ALLOW_ORIGINS = "*";

                // 获取输入流
                InputStream in_put = socket_client.getInputStream();

                // 制作响应报文
                StringBuffer response = new StringBuffer();

                // 读取请求内容
                BufferedReader input = new BufferedReader(new InputStreamReader(in_put, "GBK"));
                String url = input.readLine();

                if (url != null) {
                    String url_new = java.net.URLDecoder.decode(url, "UTF-8");
                    // url_new = url_new.split(" ")[1];
                    // url = url_new.split("=")[1];
                    System.out.println("\nURLDecoder 解码后：\n" + url_new);

                }

                // 响应头部
                String response_head = "HTTP/1.1 200 OK\r\n"
                        + "Access-Control-Allow-Origin:" + ALLOW_ORIGINS + "\r\n"
                        + "Content-Type: application/json;charset=GBK\r\n"
                        + "Access-Control-Allow-Methods: PUT,POST,GET\r\n"
                        + "\r\n";

                String jsonText = billDataAPI.data("CPA");
                // 响应主体
                String response_body = jsonText;

                response.append(response_head + response_body);

                // 获取输出流
                OutputStream out_put = socket_client.getOutputStream();

                // 将响应数据传给输出流
                out_put.write(response.toString().getBytes());

                // 关闭创建的对象
                out_put.close();
                in_put.close();
                socket_client.close();
            }
        }

    }
}