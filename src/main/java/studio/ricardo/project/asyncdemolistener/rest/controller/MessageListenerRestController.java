package studio.ricardo.project.asyncdemolistener.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import studio.ricardo.project.asyncdemolistener.service.ListenerService;

@RestController
@RequestMapping("/message")
public class MessageListenerRestController {

	@Autowired
	ListenerService listenerService;

	@GetMapping("/{number}")
	public String getMessages(@PathVariable long number) {
		listenerService.getResponse(number);
		return "done: " + number;
	}

}
