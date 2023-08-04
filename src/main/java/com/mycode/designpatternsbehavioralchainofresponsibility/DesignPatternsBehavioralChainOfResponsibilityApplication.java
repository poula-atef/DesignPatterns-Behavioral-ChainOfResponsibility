package com.mycode.designpatternsbehavioralchainofresponsibility;

import com.mycode.designpatternsbehavioralchainofresponsibility.handlers.CarHandler;
import com.mycode.designpatternsbehavioralchainofresponsibility.handlers.HondaHandler;
import com.mycode.designpatternsbehavioralchainofresponsibility.handlers.KiaHandler;
import com.mycode.designpatternsbehavioralchainofresponsibility.handlers.MercedesHandler;

public class DesignPatternsBehavioralChainOfResponsibilityApplication {

    public static void main(String[] args) {

        CarHandler handler1 = new MercedesHandler();
        CarHandler handler2 = new HondaHandler();
        CarHandler handler3 = new KiaHandler();

        handler1.nextHandler(handler2);
        handler2.nextHandler(handler3);

        handler1.handle("honda");
    }

}
