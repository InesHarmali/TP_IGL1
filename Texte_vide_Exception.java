/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_igl;

/**
 * cette classe est une exception personalisée permet de signaler une erreur si le texte inséré
 * est vide 
 * @author Harmali ines -Abidi souad
 */
public class Texte_vide_Exception extends Exception{
   
    /**
     * Le constructeur qui permet de creer une instance de l'exception -texte vide-
     */
    public Texte_vide_Exception(){}

    /**
     *retourne le message associé a cette exception "LE TEXTE INSERE EST VIDE"
     * @return cette methode retourne une chaine de caractere "LE TEXTE INSERE EST VIDE"
     */
    public String message()
     {
         return "le texte est vide";
     }
}
