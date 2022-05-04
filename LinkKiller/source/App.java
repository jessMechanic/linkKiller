
public class App {
    
    public static void main(String[] args) throws Exception {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("TASKKILL /F /IM  OculusClient.exe");
    }
}
