package semana1;

public class PruebaDinosaurio {
    public static void main(String[] args) {
        def();
    }

    public static void def(){
        Dinosaurio dinoBlue = new Dinosaurio();
        dinoBlue.setTipo("Terrestre");
        dinoBlue.setRaza("Velociraptor");
        dinoBlue.setTamano("Pequeno");
        dinoBlue.setAlimentacion("Carnivoro");
        dinoBlue.setClasificacion("Teropodo");
        dinoBlue.setAndar(2);
        String msg = "Soy un dinosaurio con estas caracteristicas: ";
        msg += "\nTipo: "+dinoBlue.getTipo();
        msg += "\nRaza: "+dinoBlue.getRaza();
        msg += "\nTamano: "+dinoBlue.getTamano();
        msg += "\nAlimentacion: "+dinoBlue.getAlimentacion();
        msg += "\nClasificacion: "+dinoBlue.getClasificacion();
        msg += "\nAndar: "+dinoBlue.getAndar()+" patas";

        System.out.print(msg);
    }

}
