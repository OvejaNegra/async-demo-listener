package studio.ricardo.project.asyncdemolistener.service.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import studio.ricardo.project.asyncdemolistener.service.ListenerService;

@Service("listenerService")
@Slf4j
public class ListenerServiceImpl implements ListenerService {

	@Async
	@Override
	public String getResponse(long number) {
		try {
			Long waitTime = (long) ((Math.random() * 10) + 1);
			log.info("waiting Time for number "+number+": " + waitTime);
			Thread.sleep(waitTime * 1000);
			log.info("done for " + number);
		} catch (InterruptedException e) {
			log.error("Explode: " + e.getMessage());
			Thread.currentThread().interrupt();
		}
		return "ok";
	}

}
