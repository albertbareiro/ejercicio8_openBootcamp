public class Main {
    public static void main(String[] args) {
        Persona persona= new Persona();
        persona.setNombre("Albert");
        persona.setEdad(26);
        persona.setTelefono(972763559);
        System.out.println("Los datos: ");
        System.out.println("Nombre/Edad/Telefono: ");
        System.out.println(persona.getNombre()+" "+persona.getEdad()+" "+persona.getTelefono());
    }
}

class Persona{
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre( String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return telefono;
    }
}