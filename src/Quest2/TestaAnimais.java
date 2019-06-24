/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest2;

/**
 *
 * @author Petrônio
 */
import Quest1.Papagaio;
import Quest1.Arara;
import Quest1.Cachorro;
import Quest1.Vaca;

  public class TestaAnimais {
    
    public static void main(String[] args) {
        Papagaio p1 = new Papagaio("Loro", true, "Biscoito!");
        p1.Imprime();
        p1.Talk();
        
        Arara a1 = new Arara("Ara", true);
        a1.Imprime();
        a1.Talk();
        
        Cachorro c1 = new Cachorro("AuAu", 4, true);
        c1.Imprime();
        c1.Talk();
        
        Vaca v1 = new Vaca("Muu", 4, true);
        v1.Imprime();
        v1.Talk();
    }
}
