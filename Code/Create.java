// Names: Selepe Sello
// Student Number: uXXXXXXXX

public class Create extends Thread {
    public Crud api_request;

    public Create(Crud api_request) {
        this.api_request = api_request;
    }

    @Override
    public void run() {
        while(!api_request.getCreateQueue().isEmpty()) {
            api_request.CreateOperation();
        }
    }
}