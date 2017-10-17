package tp_igl;

public class TP_IGL {

 
    public static void main(String[] args) {
        
        String texte ="abcd,efghijklmnop,,qrstuvwxyz ";
        String[] a = StringHelper.fractioner_string(texte,',');
        for(int i=0;i<a.length;i++){
          System.out.println(a[i]);
        }
    }
    
}
