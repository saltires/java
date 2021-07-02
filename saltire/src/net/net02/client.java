package net.net02;

import java.io.*;
import java.net.Socket;

/**
 * 文件上传案例 - 客户端
 */
public class client {
    public static void main(String[] args) throws IOException {
        // 1、创建本地文件读取流对象
        FileInputStream localFileInputStream = new FileInputStream("E:\\knight\\hello.txt");

        // 2、创建 socket 对象
        Socket socket = new Socket("127.0.0.1", 8888);

        // 3、从 socket 对象中获取远程输出流对象
        OutputStream outputStream = socket.getOutputStream();

        // 4、用本地文件读取流对象读取文件内容并输出到远程输出流对象
        int state = 0;
        byte[] bytes = new byte[1024];
        while((state = localFileInputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, state);
        }

        socket.shutdownOutput();

        // 5、获取网络字节输入流对象
        InputStream inputStream = socket.getInputStream();

        // 6、读取来自远程服务器的反馈结果
        while((state = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, state));
        }



        // 7、释放资源
        localFileInputStream.close();
        socket.close();
    }
}
