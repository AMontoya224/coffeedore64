import java.util.ArrayList;

public class Order{
    private String nombre;
    private ArrayList<Item> items;

    public Order(){
        this.nombre = "Invitado";
    }
    
    public Order( String nombre ){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    public void setNombre( String nombre ){
        this.nombre = nombre;
    }

    public void setItems( ArrayList<Item> items ){
        this.items = items;
    }

    public void addArtículo( Item item ){
        if( items != null ){
            items.add( item );
        }
        else{
            ArrayList<Item> evitarExcepcion = new ArrayList<Item>();
            this.items = evitarExcepcion;
            items.add( item );
        }
    }

    public void getStatusMessage( boolean listo ){
        if( listo == true ){
            System.out.println ( "\nTu pedido está listo" );
        }
        else{
            System.out.println ( "\nGracias por esperar. Tu pedido estará listo pronto" );
        }
    }

    public void display(){
        System.out.printf( "\nNombre Cliente: %s\n", this.nombre );
        for( int i=0; i<this.items.size(); i++ ){
            System.out.printf( this.items.get( i ).getNombre() + ": $%f\n", this.items.get( i ).getPrecio() );
        }
    }

    public double getOrderTotal(){
        double total = 0.0;
        for( int i=0; i<this.items.size(); i++ ){
            total += this.items.get(i).getPrecio();
        }
        System.out.println ( "\n" + this.nombre + ", su cuenta es: $" + total );
        return total;
    }
}
