package team.jndk.praktyki;

import lombok.extern.slf4j.Slf4j;
import team.jndk.praktyki.model.exception.EmptyParamException;
import team.jndk.praktyki.model.exception.NullParamException;
@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("info message");
        log.info("Hello World");
        log.debug("test DEBUG");
        log.error("test ERROR");

    }


}
