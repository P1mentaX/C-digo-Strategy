/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;
import Personagens.Personagens;
import java.util.Random;

public class AtaqueFraco implements Combate{
    int dado = 0;
    public void valorDado(){
        Random aleatorio = new Random();
        dado = aleatorio.nextInt(20) + 1;
    }
    @Override
    public int acao(Personagens personagem) {
        valorDado();
        if(dado == 20)return ((personagem.getForca()+5)*2);
        if(dado > 5){
            return personagem.getForca()+5;
        }
        return 0;
    }
    
}
