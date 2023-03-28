class complex{
    int a,b;
    complex(int x,int y){
        a=x;
        b=y;
    }
}

class MyClass {
    public static void main(String[] args) {
        complex var1 = new complex(10,1);
        complex var2 = new complex(7,8);

        System.out.println(var1.a+var2.a+"+i"+(var1.b+var2.b));
    }
}