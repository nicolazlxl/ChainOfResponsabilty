
package com.mycompany.chainandinterpreter;

abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}

class LowLevelHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("baixo")) {
            System.out.println("LowLevelHandler lidando com a requisicao.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}


class MediumLevelHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("medio")) {
            System.out.println("MediumLevelHandler lidando com a requisicao.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}


class HighLevelHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("alto")) {
            System.out.println("HighLevelHandler lidando com a requisicao.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}