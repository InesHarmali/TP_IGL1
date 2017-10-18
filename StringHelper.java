package tp_igl;


import java.util.ArrayList;

public class StringHelper {
    
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
    
  static public String JoinTable(String tab[],String sper) {
        String chaine = "";

        for (int i = 0; i < tab.length; i++) {
            chaine = chaine + tab[i] + sper;
        }
        return chaine;
    }
static public int NbOcc(String texte, String mot) {
        String tableau[] = texte.split(" ");
        int occ = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == mot) {
                occ++;
            }
            i++;
        }
    return occ;
    }    
    
}
