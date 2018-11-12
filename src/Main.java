/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class Main {
int iValor = 10;
    public Main(){
    int iValor;
}
    

    /**
     * @param args the command line arguments
     */
    static String sMensaje = "Hola";
    public static void main(String[] args) {
        // TODO code application logic here
        Main pObj = new Main();
        pObj.imprimir();
        pObj.imprimir2(10000);
        String sMensaje = "Nada de hola";
        System.out.println(sMensaje);
    }
    public void imprimir(){
        System.out.println("Valor = " + iValor);
    }
    public void imprimir2(int iValor){
        System.out.println("Valor = " + iValor);
        System.out.println("Valor del atributo = " + this.iValor);//this 
    }
}
