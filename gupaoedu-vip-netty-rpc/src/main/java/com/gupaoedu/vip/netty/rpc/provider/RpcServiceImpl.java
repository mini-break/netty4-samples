package com.gupaoedu.vip.netty.rpc.provider;

import com.gupaoedu.vip.netty.rpc.api.IRpcService;

public class RpcServiceImpl implements IRpcService {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int mult(int a, int b) {
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		return a / b;
	}

}
