/** * DiscardServerHandle.java 
 * Created on 2016年3月8日 下午1:56:55 
 */

package com.goldgu.demo.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/** 
 * <p>Project: goldgu-demo</p> 
 * <p>Title: DiscardServerHandle.java</p> 
 * <p>Description: </p> 
 * @author Jo Yu
 */
public class DiscardServerHandler extends ChannelHandlerAdapter {
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) { // (2)
		// Discard the received data silently.
		((ByteBuf) msg).release(); // (3)
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) { // (4)
		// Close the connection when an exception is raised.
		cause.printStackTrace();
		ctx.close();
	}

}
