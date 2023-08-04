package com.mycode.designpatternsbehavioralchainofresponsibility.handlers;

public interface CarHandler {
    void handle(String modelName);

    void nextHandler(CarHandler handler);
}
