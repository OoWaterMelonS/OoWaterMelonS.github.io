package source.file.TestStatic;

public class Test{
    

    Test(){
        System.out.println("construct code block");
        // j = 3;
    }
    
    // 输出结果为j = 1
    // {
    //     System.out.println("unflagged code block");
    //     j = 3;
    // }
    // int j = 1;

    // 输出结果为 j= 2
    int j = 1;
    {
        System.out.println("unflagged code block");
        j = 2;
    }
    


    // 输出结果为i = 20
    // static{
    //     System.out.println("static code block");
    //     i = 30;
    // }
    // static int i = 20;


    // 输出结果为i = 30
    static int i = 20;
    static{
        System.out.println("static code block");
        i = 30;
    }
    
    
    public void codeBlock(){
        System.out.println("normal function code block");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.codeBlock();

        Test t2 = new Test();
        t2.codeBlock();
        System.out.println(Test.i);
        System.out.println(t2.j);
    }
}
