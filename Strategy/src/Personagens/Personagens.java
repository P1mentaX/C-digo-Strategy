/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personagens;
import Strategy.Combate;


public class Personagens {
    private String nome;
    private int vida;
    private int forca;
    private int inteligencia;
    private Combate estrategia;

    public Personagens(String nome, int vida, int forca, int inteligencia) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.inteligencia = inteligencia;
    }
    
    public void escolherAcao(Combate estrategia) {
        this.estrategia = estrategia;
    }
    public int executarAcao() {
        return this.estrategia.acao(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    public boolean vivo(){
        if (vida <= 0) return false;
        return true;
    }
}
