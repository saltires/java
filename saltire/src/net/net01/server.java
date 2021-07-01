package net.net01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        // 1、创建 serverSocket 对象并指定端口号
        ServerSocket serverSocket = new ServerSocket(8888);

        // 2、使用 serverSocket 对象中的 accept 方法获取请求的客户端对象的 Socket
        Socket socket = serverSocket.accept();

        // 3、使用 socket 对象中的 getInputStream 方法获取网络输入流对象
        InputStream inputStream = socket.getInputStream();

        // 4、读取并打印客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);

        System.out.println(new String(bytes, 0, len));

        // 5、使用 socket 对象的 getOutputStream 方法获取网络字节输出流对象
        OutputStream outputStream = socket.getOutputStream();

        // 6、给客户端回写数据
        outputStream.write("这是服务器返回的数据".getBytes());

        // 7、释放资源
        socket.close();
        serverSocket.close();
    }
}
