// Q12. Create a class with parameterized, default, and copy constructors.
class a12 {
    int x;

    a12() { 
        x = 0; 
    }
    a12(int a) {
         x = a; 
        }
    a12(a12 s) {
         x = s.x; 
        }

    void show() { System.out.println("x = " + x); }

    public static void main(String[] args) {
        a12 s1 = new a12();
        a12 s2 = new a12(10);
        a12 s3 = new a12(s2);
        s1.show(); s2.show(); s3.show();
    }
}
