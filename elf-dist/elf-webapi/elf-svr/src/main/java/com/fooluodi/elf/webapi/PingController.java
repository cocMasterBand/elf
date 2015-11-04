package com.fooluodi.elf.webapi;

import com.fooluodi.elf.framework.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * PingController
 * \ * @author di
 *
 * @date 15/7/23
 */
@Controller
@RequestMapping("/elf-webapi")
public class PingController {
    private static final Logger logger = LoggerFactory.getLogger(PingController.class);

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public
    @ResponseBody
    ResponseEntity<?> ping() {
        logger.info("ping");
        return ResponseEntity.success("hi!");
    }


}