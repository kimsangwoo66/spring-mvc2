package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//@Slf4j
//restController라고 하면 컨트롤러의 return 값 자체가 바로 반환된다.
//Rest Api 만들때 핵심적인 컨트롤러이다.
@RestController
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest()
    {
        String name = "Spring";

        System.out.println("name = " + name);
        log.info("info log=" + name);
        //2021-09-28 00:13:37.697  INFO 96982 --- [nio-8080-exec-1] hello.springmvc.basic.LogTestController  : info log=Spring 이게 찍힘
        //내려갈수록 로그의 하위레벨
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }


}
