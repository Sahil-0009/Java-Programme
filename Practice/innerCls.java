package Practice;

public class innerCls {
    class OuterClass {
        int x = 10;

        class InnerClass {
            int y = 15;
        }
    }

    public static void main(String[] args) {
        innerCls outerInstance = new innerCls();
        OuterClass myOuter = outerInstance.new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }

}
