import java.util.ArrayList;

public class PedidoKiosko{
    private ArrayList<Item> menu;
    private ArrayList<Order> pedidos;

    public PedidoKiosko(){
        ArrayList<Item> evitarExcepcion1 = new ArrayList<Item>();
        this.menu = evitarExcepcion1;
        ArrayList<Order> evitarExcepcion2 = new ArrayList<Order>();
        this.pedidos = evitarExcepcion2;
    }

    public ArrayList<Item> getMenu(){
        return this.menu;
    }

    public ArrayList<Order> getPedidos(){
        return this.pedidos;
    }

    public void addMenuItem( Item item){
        this.menu.add( item );
    }

    public void displayMenu(){
        System.out.printf( "\n-- Menu de Articulos --\n");
        for( int i=0; i<this.menu.size(); i++ ){
            System.out.printf( this.menu.get( i ).getIndice() + " " + this.menu.get( i ).getNombre() + " -- $%f\n", this.menu.get( i ).getPrecio() );
        }
    }

    public void newOrder() {
        System.out.println("Ingrese el nombre del cliente para el nuevo pedido: ");
        String name = System.console().readLine();
        
        Order pedido1 = new Order();
        pedido1.setNombre( name );
        displayMenu();

        System.out.println("\n--Orden de compra--\nIngrese un índice de artículo del menú o (q) para salir: ");
        String itemNumber = System.console().readLine();
        
        while(!itemNumber.equals("q")) {
            int intNumber = Integer.parseInt(itemNumber);
            if( intNumber >= 0 && intNumber < this.menu.size() ){
                for( int i=0; i<this.menu.size(); i++ ){
                    if( this.menu.get( i ).getIndice() == intNumber ){
                        pedido1.addArtículo( this.menu.get( i ) );
                    }
                }
            }
            else{
                System.out.println("Ese indice no existe.\n");
            }
            System.out.println("Ingrese un índice de artículo del menú o (q) para salir: ");
            itemNumber = System.console().readLine();
        }

        try{
            System.out.println("\nGracias por su orden, " + pedido1.getNombre() + ". Estos son los detalles:\n");
            for( int i=0; i<pedido1.getItems().size(); i++ ){
                System.out.printf( pedido1.getItems().get( i ).getIndice() + " " + pedido1.getItems().get( i ).getNombre() + " -- $%f\n", pedido1.getItems().get( i ).getPrecio() );
            }
            pedido1.getOrderTotal();
        }
        catch( Exception e){
            System.out.println( "N/A -- $0.0");
        }
    }
}