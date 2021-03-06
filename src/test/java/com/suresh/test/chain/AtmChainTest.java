package com.suresh.test.chain;

import static org.junit.Assert.assertEquals;

import org.apache.commons.chain.Catalog;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.junit.Test;

import com.suresh.atm.AtmCatalog;
import com.suresh.atm.bean.AtmRequestContext;

public class AtmChainTest {

	@SuppressWarnings("unchecked")
	@Test
	public void givenInputsToContext_whenAppliedChain_thenExpectedContext() throws Exception {
		Context context = new AtmRequestContext();
		context.put("totalAmountToBeWithdrawn", 460);
		context.put("amountLeftToBeWithdrawn", 460);

		Catalog catalog = new AtmCatalog();
		Command atmWithdrawalChain = catalog.getCommand("atmWithdrawalChain");

		atmWithdrawalChain.execute(context);

		assertEquals(460, (int) context.get("totalAmountToBeWithdrawn"));
		assertEquals(0, (int) context.get("amountLeftToBeWithdrawn"));
		assertEquals(4, (int) context.get("noOfHundredsDispensed"));
		assertEquals(1, (int) context.get("noOfFiftiesDispensed"));
		assertEquals(1, (int) context.get("noOfTensDispensed"));
	}

}
