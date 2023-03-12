/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lyzex
 */
public class Navio {
    private String matricula;
    private String nome;
    private float comprimento;
    
    public Navio(String matricula) {
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public String getNome() {
        return nome;
    }
    
    public float getComprimento() {
        return comprimento;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
}
