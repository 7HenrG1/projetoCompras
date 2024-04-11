
package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Compra {
    public ArrayList compras;

    public Compra (){
        compras = new ArrayList();
    }
    //create - salvar add
    public void salvar(String item){
        compras.add(item);
        JOptionPane.showMessageDialog (null, "salvo com sucesso, aeee!!");    }
    //read - listar
    public String listar (){
        String res = "";
        if (!compras.isEmpty())
            for (int i = 0; i < compras.size(); i++){
                res += (i + 1) + "- " + compras.get(i) + "\n";
            }
        else{
            res = "Pô mano...a lista tá vazia...";
        }
        return res;
    }
    //delete
    public void excluir (int indice){
        if (!compras.isEmpty()){
            if(indice > 0 && indice < compras.size()){
                compras.remove (indice - 1);
            JOptionPane.showMessageDialog (null, "EXCLUÍDO COM SUCESSOOOO IHULLL!!");
        }else{
                JOptionPane.showMessageDialog (null, "Este códiguito no existe!");
    }
}else{
            JOptionPane.showMessageDialog (null,"COMO QUE TU VAI EXCLUIR ISSO GURI? NÃO TEM NADA!");
        }
    }
    public void alterar (int indice, String elemento){
        if (!compras.isEmpty()){
            if (indice > 0 && indice <= compras.size()){
                compras.set (indice - 1, elemento);
                JOptionPane.showMessageDialog (null, "Foi alterido com maestria!!");
            }else{
                JOptionPane.showMessageDialog (null, "infelizmente não foi dessa vez irmão,não deu pra alterar...");
            }
        }
    }
}