package com.designPatterns.patterns.chainOfResponsibility.version2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Set;

/**
 * Base Handler that choose a next handler from the chain
 * @author Ihor Savchenko
 * @version 1.0
 */
public class BaseHandler {

    private static final Logger logger = LoggerFactory.getLogger(BaseHandler.class);
    private static final Set<Handler> handlers = new HashSet<>();
    private static final Set<Handler> consumedHandlers = new HashSet<>();

    public void execute() throws ConcurrentModificationException{
        if(!handlers.isEmpty()) {
            for (Handler consumedHandler : consumedHandlers) {
                handlers.remove(consumedHandler);
            }
            consumedHandlers.clear();
        }

        if(handlers.isEmpty()) {
            logger.info("----------------------");
            logger.info("No one from handlers have been able to perform the task");
        }
        else{
            for (Handler handler: handlers) {
                consumedHandlers.add(handler);
                if (handler.handle()){
                    break;
                }
            }
        }
    }

    void setHandlers(Handler handler){
        handlers.add(handler);
    }
}
