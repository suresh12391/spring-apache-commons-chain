package com.suresh.sample.commands;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class NegotiateSale implements Command {
	public boolean execute(Context ctx) throws Exception {
		System.out.println("Negotiate sale");
		return false;
	}
}