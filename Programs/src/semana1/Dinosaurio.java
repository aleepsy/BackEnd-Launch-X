package semana1;

public class Dinosaurio {

    //Caracteristicas
    public String tipo, raza, tamano, alimentacion, clasificacion;
    public int andar;

    //Metodos - getters
    public String getTipo(){  return tipo;  }
    public String getRaza(){  return raza;  }
    public String getTamano(){  return tamano;  }
    public String getAlimentacion(){  return alimentacion;  }
    public String getClasificacion(){  return clasificacion;  }
    public int getAndar(){  return andar;  }

    //seters
    public boolean setTipo(String tipo){
        if(!tipo.isEmpty()){
            this.tipo = tipo;
            return true;
        } else
            return false;
    }

    public boolean setRaza(String raza){
        if(!raza.isEmpty()){
            this.raza = raza;
            return true;
        } else
            return false;
    }

    public boolean setTamano(String tamano){
        if(!tamano.isEmpty()){
            this.tamano = tamano;
            return true;
        } else
            return false;
    }

    public boolean setAlimentacion(String alimentacion){
        if(!alimentacion.isEmpty()){
            this.alimentacion = alimentacion;
            return true;
        } else
            return false;
    }

    public boolean setClasificacion(String clasificacion){
        if(!clasificacion.isEmpty()){
            this.clasificacion = clasificacion;
            return true;
        } else
            return false;
    }

    public boolean setAndar(int andar){
        if(andar == 2 || andar == 4){
            this.andar = andar;
            return true;
        } else
            return false;
    }

    public String printState(){
        return "Tipo: "+tipo+"\n"+
                "Raza: "+raza+"\n"+
                "Tamano: "+tamano+"\n"+
                "Alimentacion: "+alimentacion+"\n"+
                "Clasificacion: "+clasificacion+"\n"+
                "Andar: "+andar;
    }
}
