package com.suresh.sample.commands;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class GetCustomerInfo implements Command {
	@SuppressWarnings("unchecked")
	public boolean execute(Context ctx) throws Exception {
		System.out.println("Get customer info");
		ctx.put("customerName", "Suresh Arumguam");
		return false;
	}
}