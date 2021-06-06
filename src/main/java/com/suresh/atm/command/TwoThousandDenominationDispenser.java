package com.suresh.atm.command;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class TwoThousandDenominationDispenser implements Command {

	@SuppressWarnings("unchecked")
	@Override
	public boolean execute(Context context) throws Exception {
		int amountLeftToBeWithdrawn = (int) context.get("amountLeftToBeWithdrawn");
		if (amountLeftToBeWithdrawn >= 2000) {
			context.put("noOfHundredsDispensed", amountLeftToBeWithdrawn / 2000);
			context.put("amountLeftToBeWithdrawn", amountLeftToBeWithdrawn % 2000);
		}
		return false;
	}

}
