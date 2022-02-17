public class Item{
    private int indice;
    private String nombre;
    private double precio;

    public Item(){
        this.indice = 0;
        this.nombre = "N/A";
        this.precio = 0.0;
    }
    
    public Item( int indice, String nombre, double precio ){
        this.indice = indice;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public int getIndice(){
        return this.indice;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setIndice( int indice ){
        this.indice = indice;
    }

    public void setNombre( String nombre ){
        this.nombre = nombre;
    }

    public void setNombre( double precio ){
        this.precio = precio;
    }
}