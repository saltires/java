package net.net01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);

        // 2、使用 socket 对象的 getOutputStream 方法获取网络字节输出流对象
        OutputStream outputStream = socket.getOutputStream();

        // 3、给服务器发送请求数据
        outputStream.write("这是客户端的请求数据".getBytes());

        // 4、使用 socket 对象中的 getInputStream 方法获取网络输入流对象
        InputStream inputStream = socket.getInputStream();

        // 5、读取并打印服务器发送的数据
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);

        System.out.println(new String(bytes, 0, len));

        // 6、释放资源
        socket.close();
    }
}
