package net.net02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 文件上传案例 - 服务器端
 */
public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);

        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();

        File file = new File("e://upload");

        if (!file.exists()) {
            file.mkdirs();
        }

        FileOutputStream outputStream = new FileOutputStream(file + "\\1.txt");

        int state = 0;
        byte[] bytes = new byte[1024];
        while ((state = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, state);
        }

        OutputStream outputStream1 = accept.getOutputStream();

        outputStream1.write("上传成功".getBytes());

        accept.close();
        outputStream.close();
    }
}
