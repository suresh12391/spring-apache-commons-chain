package com.suresh.chain.controller;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ContextBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.chain.domain.ChainRequest;
import com.suresh.chain.domain.ChainResponse;
import com.suresh.chain.service.ChainService;
import com.suresh.sample.commands.SellVehicleChain;

@RestController
public class ChainController {

	private static Logger logger = LogManager.getLogger(ChainController.class);

	@Autowired
	private ChainService chainService;

	@GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
	public ChainResponse getChain(@RequestParam @NonNull String one, @RequestParam @NonNull String two) {

		logger.info("INPUT: one: " + one + ", two: " + two);

		ChainRequest chainRequest = new ChainRequest();
		chainRequest.setInputOne(one);
		chainRequest.setInputTwo(two);

		return chainService.getChainResponse(chainRequest);
	}

	@GetMapping(value = "/sample", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getChainSample() {

//		ChainBase sellVehicleChain = (ChainBase) applicationContext.getBean("sellVehicleChain");
//		ContextBase context = new ContextBase();
//		sellVehicleChain.execute(context);

		Command process = new SellVehicleChain();
		Context ctx = new ContextBase();
		try {
			process.execute(ctx);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "DONE";
	}
}
