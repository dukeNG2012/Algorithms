public class PossibleString
{
    // moi khi thay doi newset thi do dai lai thay doi!
    //static String PrintSet(String MyNewerSet, int length, int k, int )
    static void MySet(char[] set,int length, int k, String NewSet)
    {
        if(k <= 0)
        {
            System.out.println(NewSet);
            return;
        }
        // vi chieu dai cua set thay doi nen phai de the nay!
        for(int i = 0; i < length; ++i)
        {
            String MyNewerSet = NewSet + set[i];            
            MySet(set, length, k-1, MyNewerSet);
        }
    }
    public static void main(String[] args)
    {
        char[] set = {'a','b'};
        int k = 3;
        MySet(set,2,3,"");
    }
}