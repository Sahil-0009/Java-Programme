enum Status {
    Running, Failed, Pending, Success;
}

public class cls70 {
    public static void main(String[] args) {
        Status s = Status.Pending;
        switch (s) {
            case Running:
            case Failed:
            case Pending:
            case Success:
                System.out.println("Status is " + s);

        }

        // if (s == Status.Running) {
        // System.out.println("All Good");
        // } else if (s == Status.Failed) {
        // System.out.println("Failed");
        // } else if (s == Status.Pending) {
        // System.out.println("Still Pending...");
        // } else if (s == Status.Success) {
        // System.out.println("Success");
        // } else {
        // System.out.println("Unknown");
        // }
    }
}
