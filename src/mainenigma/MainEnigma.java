package mainenigma;

/**
 *
 * @author gosia
 */
public class MainEnigma {

    public static void main(String[] args) {
        Alfabet alf = new Alfabet(Alfabet.ALL);
        Cipher test = new Cipher();
        String in = "asdsadfsaf";
        test.setAlfabet(alf);
        String out = test.ecnrypt(in);
        System.out.println("Tekst szyfrowany: " + in);
        System.out.println("Tekst zaszyfrOwany: " + out);

    }

}
