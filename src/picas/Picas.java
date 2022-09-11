package picas;
import javax.swing.JOptionPane;
public class Picas {
    public static void main(String[] args) {
        picas();
    }
    
    
    public static void picas() {
        JOptionPane.showMessageDialog(null, "Este programa fue desarrollado por Hernan Yessid Murcia Salinas");
        int CLAVE = 2416, intento, pica, fija, valor, password;
        int[] clave = new int[4];
        int[] claveM = new int[4];
        password = CLAVE;
        for (int i = 0; i < 4; i++) {
            claveM[i] = CLAVE % 10;
            CLAVE = CLAVE / 10;
        }
        do {
            intento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la clave de 4 digitos: "));
            valor = intento;
            pica = 0;
            fija = 0;
            for (int i = 0; i < 4; i++) {
                clave[i] = intento % 10;
                intento = intento / 10;
            }
            for (int j = 0; j < 4; j++) {
                if (clave[j] == claveM[j]) {
                    fija++;
                }
                for (int i = 3; i >= 0; i--) {
                    if (clave[i] == claveM[j]) {
                        pica++;
                        if (clave[j] == claveM[j]) {
                            pica--;
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, " picas= " + pica + "  fijas= " + fija);
        } while (password != valor);
        JOptionPane.showMessageDialog(null, "        Gano!!! \n La clave es: "+password);
    }
}
