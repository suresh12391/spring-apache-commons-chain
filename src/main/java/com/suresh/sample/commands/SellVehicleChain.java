package com.suresh.sample.commands;

import org.apache.commons.chain.impl.ChainBase;

public class SellVehicleChain extends ChainBase {
	public SellVehicleChain() {
		super();
		addCommand(new GetCustomerInfo());
		addCommand(new TestDriveVehicle());
		addCommand(new NegotiateSale());
		addCommand(new ArrangeFinancing());
		addCommand(new CloseSale());
	}

}