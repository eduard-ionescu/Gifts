package com.gifts.Gifts;

import com.gifts.gui.MainFrame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class GiftsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GiftsApplication.class, args);
                
                new SpringApplicationBuilder(GiftsApplication.class).headless(false).run(args);
                
                new MainFrame();
	}
}
