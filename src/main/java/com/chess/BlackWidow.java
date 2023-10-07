package com.chess;

import com.chess.gui.Table;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BlackWidow {

    public static void main(final String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(BlackWidow.class);
        builder.headless(false).web(WebApplicationType.SERVLET).run(args);
        Table.get().show();
    }
}
