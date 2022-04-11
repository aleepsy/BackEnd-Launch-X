package semana1;

public class Bicicleta {
    //constructor por omision, inicializar

    // Caracteristicas - Campos
    public int pins, rodada;
    public double velocidad;
    public String color;

    //Metodos
    /*
    Signatura del metodo
    1. Valor del retorno
    2. Nombre del metodo
    3. Parametros, numero, tipo
    */
    public double getVelocidad(){  return velocidad;  }
    public int getPins(){  return pins;  }
    public int getRodada(){  return rodada;  }
    public String getColor(){  return color;  }

    public boolean setPins(int pins){
        if(pins > 0){
            this.pins = pins;
            return true;
        } else
            return false;
    }

    public boolean setRodada(int rodada){
        if(rodada > 0){
            this.rodada = rodada;
            return true;
        } else
            return false;
    }

    public boolean setVelocidad(double velocidad){
        if(velocidad >= 0){
            this.velocidad = velocidad;
            return true;
        } else
            return false;
    }

    public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color = color;
            return true;
        } else
            return false;
    }

    public String printState(){
        return "pins: "+pins+"\n"+
                "rodada: "+rodada+"\n"+
                "velocidad: "+velocidad+"\n"+
                "color: "+color;
        // bajo acomplamiento + alta cohesion -> buen codigo
    }
}