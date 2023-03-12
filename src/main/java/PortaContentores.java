/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lyzex
 */
public class PortaContentores extends Navio {
    private int noContentores;
 
    public PortaContentores(String matricula) {
        super(matricula);
    }
    public int getNoContentores() {
        return noContentores;
    }
    public void setNoContentores(int noContentores) {
        this.noContentores = noContentores;
    }
}
