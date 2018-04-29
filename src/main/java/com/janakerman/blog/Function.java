package com.janakerman.blog;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.janakerman.blog.dto.Todo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Function {

    private static final Logger logger = LogManager.getLogger(Function.class);

    public void handleRequest(Todo input, Context context) {
        logger.info("Saving todo: " + input.getTitle());
    }

}
