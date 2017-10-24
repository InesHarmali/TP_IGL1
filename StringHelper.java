  package tp_igl;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Cette class contient des fonctions qui s'appliquent aux chaines de caractére  
 * afin de pouvoir faciliter la taches de recherche et mise en forme et gestion des textes
 * @author INES HARMALI -SOUAD ABIDI
 */
public class StringHelper {
    
    /**
     * le constructeur qui permet de creer une instance de cette classe 
     * 
     */
    public StringHelper(){}
   /**
     * cette fonction permet d'appliquer une fonction donnée à toute les lettres de la chaine de caractère donnée :
     * remplace chaque lettre par la lettre suivante (exemple: chaine ="la maison " en sortie : chaine="mb nbjtpo" )
     * @param chaine c'est le texte dont vous voulez appliquer la fonction
     * @return cette fonction retourne un texte crypté
     */
    static public String formule_lettre_suivante(String chaine)
    {
        // parcourir la chaine de caractére 
        // pour chaque caractére si c'est une lettre on le remplace par la lettre suivantes 
        // sinon on le laisse 
        
         char[] tableau_char = chaine.toCharArray();
         chaine ="";
         
         for(int i=0;i<tableau_char.length;i++)
         {
            // remplacement des chars et creation de la chaine resultante
             if(Character.isLetter(tableau_char[i]))
             {
                 // si le caractere est un z en reboucle vers a
                 if(tableau_char[i]==122)
                 {
                      chaine+='a';
                 } 
                 else
                 {
                     // si le caractere est un Z en reboucle vers A
                     if(tableau_char[i]==90)
                     {
                      chaine+='A';
                     } 
                     else
                     {
                        chaine+=(char)(tableau_char[i]+1);
                     }
                 }
             }
             else{
                  chaine+=tableau_char[i];
             }         
         }
        return chaine;
    }
    
   /**
     * Cette fonction fractionne le texte en utilisant le separateur donné en parametre
     * en un tableau de chaine de caractére (en un tableau de mot) exemple :(en entrée on a texte:" la grande maison est blanche" et un séparateur donné exp : " " ,et en sortie un tableau de mots: ["la","grande","maison","est","blanche"]
     * @param texte c'est le texte que vous voulez fractionner en chaine de caractere
     * @param separateur c'est le caractere qui sépare les chaines
     * @return cette fonction retourne un tableau de chaines de caractére (mots)
     */
    static public String[] fractioner_string(String texte,char separateur)
    {   
      // si le texte n'est pas vide sinon on aura un tableau vide
      ArrayList <String> mots =new ArrayList<>();
      char[] tableau_char = texte.toCharArray();
      String mot="";
      for(int i=0;i<tableau_char.length;i++)
      {
         if(tableau_char[i]==separateur)
         {
             if(!"".equals(mot)){ mots.add(mot); }
             mot="";
         }else
         {
          mot+=tableau_char[i];
         }
      }
      if(!"".equals(mot)){ mots.add(mot); }
      // transformer la liste en tableau
      String[] tableau =new String[mots.size()];
      tableau =mots.toArray(tableau);
      return tableau;
    }

     /**
     * Cette fonction corrige la forme du texte telle que la premiere lettre de
     * chaque phrase est en majuscule et le reste est en miniscule exemple:( en entrée texte:" eCOLE NaTIOnal suPERieure.a wwad SmaR." en sortie : Ecole nationale supérieure.A vvad smar."
     * @param texte c'est le texte dont vous voulez appliquer la mise en forme
     * @return cette fonction retourne un texte mis en forme
     */
    static public String mise_en_forme_texte(String texte)
    {
        char[] tableau_char = texte.toCharArray();
         texte ="";
         // lancer une exception si le texte est vide
         int i=0; 
         while(i<tableau_char.length){
            //trouvons la premiere lettre de la phrase 
            while(i<tableau_char.length && !Character.isLetter(tableau_char[i]) )
            {
                texte+=tableau_char[i];
                i++;
            }
           // la premiere lettre sera en majuscule 
            if(i<tableau_char.length)
            {
                texte+=Character.toUpperCase(tableau_char[i]);
                i++;        
            }
            // les autres seront en majuscule jusqu'a trouver un point
            // ou un saute de ligne 
           while(i<tableau_char.length &&tableau_char[i]!='.' && tableau_char[i]!='\n' )
           {
               if(Character.isLetter(tableau_char[i]))
                {
                    texte+=Character.toLowerCase(tableau_char[i]);
                }else
                {
                    texte+=tableau_char[i];
                }
               i++;
           }
            // on refait ce traitement jusqu'a la fin su texte 
         }
        return texte;
    }
    
     /**
     * cette fonction permet de trouver le nombre d'apparition d'un mot dans le texte par exemple( le texte:" Ecole nationale supérieure d'informatique nationale nationale",le mot="nationale" ,en sortie nb occurence de "nationale" =3)
     * @param texte c'est la chaine de caractére qui contient le mot rechercher
     * @param mot c'est la sous chaine dont vous avez besoin de nombre d'occurance
     * @return cette fonction retourne un entier indiquant le nombre d'apparition du mot
     * @throws Texte_vide_Exception si le texte inséré est vide cette exception est lancé
     */
    static public int Nombre_Occurence(String texte, String mot) throws Texte_vide_Exception {
        if(texte.length()<2){ throw new Texte_vide_Exception();}
        else{
        String tableau[] = fractioner_string(texte,' ');
        int occ = 0;
        for (String tableau1 : tableau) {
            if (tableau1.equals(mot)) {
                occ++;
            }
        }
        return occ;
       }
    } 
  
  /**
     * Cette fonction concatene tous les chaines de caractere (mots) contenues dans un tableau
     * en utilisant un separateur pour former un seul texte(une seule chaine de caractere)
     * @param tab c'est le tableau des mots a concatener
     * @param sper c'est le caractere qui separe les mots du tableau
     * @return 
     * cette fonction retourne une chaine de caractere qui contient tous les mots du tableau
     */
    static public String Jointure_Table(String[] tab,String sper) {
        String chaine = "";

        for (int i = 0; i < tab.length; i++) {
            chaine = chaine + tab[i] + sper;
        }
        return chaine;
    }
  
  /**
     * cette fonction permet d'éliminer les mots vides("ou","non",et","à" dans un texte donné exemple (texte:" Ecole ou nationale et supérieure non d'informatique à wad esmar" en sortie :" Ecole nationle supérieure d'informatique wad esmar"
     * @param chaine c'est la chaine  de caractère dont on veut supprimer les mots vides qu'elle contient
     * @return cette fonction returne une chaine de caractère sans les mots vides ("ou","non",et","à")
     */
   public static  String EliminationMotvide( String chaine) {

        String s =" "; 
        char c= s.charAt(0);
        String mots[] = fractioner_string(chaine,c);
    
        ArrayList list = new ArrayList(Arrays.asList(mots));
                
        int i =0;
       
        while (i< list.size()) {
            if(((String) list.get(i)).equals("ou") ||((String) list.get(i)).equals("et")||((String) list.get(i)).equals("à") ||((String) list.get(i)).equals("non") )
            {
               list.remove(i);
            }else
            i++;

        }
        String chaineF = "";
        for (int m = 0; m < list.size(); m++) {
            chaineF = chaineF + list.get(m)+" ";
        }
        return chaineF;
    }
  
  
}
