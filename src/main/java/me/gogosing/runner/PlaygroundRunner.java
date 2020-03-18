package me.gogosing.runner;

import me.gogosing.properties.Playground;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by JinBum Jeong on 2020/03/18.
 */
@Component
public class PlaygroundRunner implements ApplicationRunner {

    private final Logger LOGGER = LoggerFactory.getLogger(PlaygroundRunner.class);

    private final Playground playground;

    public PlaygroundRunner(Playground playground) {
        this.playground = playground;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOGGER.info(playground.toString());
    }
}
