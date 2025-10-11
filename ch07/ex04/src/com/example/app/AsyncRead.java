package com.example.app;

import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
import java.util.concurrent.Future;

public class AsyncRead {
    public static void main(String[] args) throws Exception {
        AsynchronousFileChannel channel = AsynchronousFileChannel.open(
                Paths.get("bigdata.txt"), StandardOpenOption.READ);
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        Future<Integer> result = channel.read(buffer, 0);
        while (!result.isDone()) System.out.println("Reading...");
        buffer.flip();
        System.out.println(new String(buffer.array()).trim());
    }
}