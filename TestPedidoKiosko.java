public class TestPedidoKiosko {
    public static void main(String[] args) {
        // Elementos del menú
        Item item1 = new Item( 0, "banana", 1.6 );
        Item item2 = new Item( 1, "café", 1.2 );
        Item item3 = new Item( 2, "latte", 3.6 );
        Item item4 = new Item( 3, "capuchino", 2.4 );
        Item item5 = new Item( 4, "muffin", 3.2 );

        //Lista de pedidos
        PedidoKiosko kiosko = new PedidoKiosko();
        kiosko.addMenuItem( item1 );
        kiosko.addMenuItem( item2 );
        kiosko.addMenuItem( item3 );
        kiosko.addMenuItem( item4 );
        kiosko.addMenuItem( item5 );

        //Nueva orden
        kiosko.newOrder();
    }
}