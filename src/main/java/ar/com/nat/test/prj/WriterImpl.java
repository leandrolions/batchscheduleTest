package ar.com.nat.test.prj;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class WriterImpl implements ItemWriter<String> {
	@Override
	public void write(List<? extends String> msgArray) throws Exception {
		for(String msg : msgArray){
			System.out.println("In writer: " + msg);
		}
	}
}
