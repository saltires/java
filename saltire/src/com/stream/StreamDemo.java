package com.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\knight\\test.txt"));

        char[] chars = {'a', 'b', 'c'};

        osw.write(chars);

        osw.close();
    }
}
