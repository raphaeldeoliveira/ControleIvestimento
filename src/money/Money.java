package money;

import money.Controller.Controller;

public class Money {
    public static Controller controller;
    
    public static void main(String[] args) {
        
        controller = new Controller();
        controller.start();
        
    }
    
}
