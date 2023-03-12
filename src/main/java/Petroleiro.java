/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lyzex
 */
public class Petroleiro extends Navio {
    private float carga;
    
    public Petroleiro(String matricula) {
        super(matricula);
    }
    public float getCarga() {
        return carga;
    }
    public void setCarga(float carga) {
        this.carga = carga;
    }
}
