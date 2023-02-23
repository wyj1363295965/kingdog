package com.wyj.kingdog.config.tcp;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.StandardCharsets;
import java.util.List;

@Slf4j
public class TcpFrameDecoder extends ByteToMessageDecoder {


    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {

        byte[] syncHeaderBytes = new byte[6];

        byteBuf.readBytes(syncHeaderBytes);

        int length = byteBuf.readableBytes();
        byte[] dataBytes = new byte[length];
        byteBuf.readBytes(dataBytes);

        String data = new String(dataBytes, StandardCharsets.UTF_8);
        //log.info(data);
        list.add(data);

    }

}
