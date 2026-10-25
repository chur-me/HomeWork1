package home3.ChainOfResponsibility;

class OrderHandlerFactory {
    static OrderHandler create() {
        OrderHandler client = new ClientReceiptHandler();
        OrderHandler kitchen = new KitchenHandler();
        OrderHandler bar = new BarHandler();

        client.setNext(kitchen);
        kitchen.setNext(bar);

        return client;
    }
}