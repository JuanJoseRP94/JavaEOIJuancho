public class Coche {
    // Atributos (características/estado/campos)
    String marca;
    String modelo;
    String color;
    String combustible;
    float potencia;
    float cilindrada;
    float rpm = 0;
    float maxRpm = 7000;

    // métodos (comportamiento)
    public void Arrancar(){
        rpm = 800;
    }

    public void pararMotor(){
        rpm = 0;
    }

    public void acelerar(float aceleracion){ // aceleración en porcentaje 0...100%
        if(rpm > 0){
            rpm = 800 + (7000-800) * aceleracion / 100;
        }
    }
}
