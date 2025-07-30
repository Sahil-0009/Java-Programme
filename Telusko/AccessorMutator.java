public class AccessorMutator {
    private int num;
    private String n;

    public int getNum() {
        return num;
    }

    public String getName() {
        return n;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String n) {
        this.n = n;
    }

    public void printDetails() {
        System.out.println("Number : " + num);
        System.out.println("Name : " + n);
    }

    public static void main(String[] args) {
        AccessorMutator am = new AccessorMutator();
        am.setNum(101);
        am.setName("John Aly");
        am.printDetails();
    }
}
