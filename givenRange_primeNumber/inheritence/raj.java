class swapan 
{
    int a; int b; int c;
    {
        a=1; b=2; c=3;
        
    }
}
class raj extends swapan
{
    void show()
    {
        System.out.println(a+b+c);
    }
public static void main(String[] args) {
    
    raj r=new raj();
    r.show();
    }
    
}
