package br.com.genka.testelogs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/log")
@Slf4j
public class Logs {

	@GetMapping("/debug/{msg}")
	public void logDebug(@PathVariable("msg") String msg) {
		log.debug("Test debug " + msg);
	}
	
	@GetMapping("/info/{msg}")
	public void logInfo(@PathVariable("msg") String msg) {
		log.info("Test info " + msg);
	}
	
	@GetMapping("/warning/{msg}")
	public void logWarning(@PathVariable("msg") String msg) {
		log.warn("Test warning " + msg);
	}
	
	@GetMapping("/error/{msg}")
	public void logError(@PathVariable("msg") String msg) {
		log.error("Test error " + msg);
	}
}