package com.mycode.designpatternsbehavioralchainofresponsibility.handlers;

public class HondaHandler implements CarHandler {
    private CarHandler nextHandler;

    @Override
    public void handle(String modelName) {
        if (modelName.equalsIgnoreCase("honda"))
            System.out.println("Welcome Honda Client !!!");
        else if (nextHandler != null)
            nextHandler.handle(modelName);
        else
            System.out.println("No Handler Can Handle This Request !!");
    }

    @Override
    public void nextHandler(CarHandler handler) {
        this.nextHandler = handler;
    }
}
