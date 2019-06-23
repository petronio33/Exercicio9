/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quest1;

/**
 *
 * @author Petrônio
 */
public class Arara extends Ave{
    
    public Arara(String n, boolean v){
        super(n, v);
    }

    public Arara(String ara, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void Talk(){
        System.out.println("arara, arara");
    }
}
