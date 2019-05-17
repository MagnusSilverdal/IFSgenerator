/**
 *
 */
public class IFSGenerator {
    public static void main(String[] args) {
        String result = doStuff(2,4,"Hejsan");
    }

    /**
     * Beskriv vad metoden gör. En mer detaljerad beskrivning kan skivas här.
     * @param i1 en inte som adderas
     * @param i2 en till int som adderas
     * @param hejsan En text som används av metoden
     * @return En sträng som är resultatet av ...
     */
    private static String doStuff(int i1, int i2, String hejsan) {
        return hejsan +(i1+i2);
    }


}
