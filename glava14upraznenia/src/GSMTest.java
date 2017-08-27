
public class GSMTest {

    public static void main(String[] args) {
        GSM phone1 = new GSM();
        GSM phone2 = new GSM("m2", "Sony");
        GSM phone3 = new GSM("m55", "Nokia");

        GSM[] array = new GSM[3];
        array[0] = phone1;
        array[1] = phone2;
        array[2] = phone3;

        for (GSM gsm : array) {
            gsm.printInfo();
        }
    }
}
