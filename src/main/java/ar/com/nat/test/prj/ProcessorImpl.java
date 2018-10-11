package ar.com.nat.test.prj;

import org.springframework.batch.item.ItemProcessor;

public class ProcessorImpl implements ItemProcessor<String, String>{
	@Override
	public String process(String message) throws Exception {
		return message.toUpperCase();
	}
}
