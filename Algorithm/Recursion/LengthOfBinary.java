public class LengthOfBinary {
    static void Binary(int DoDaiKetQua, String MyResult, int length, char[] set)
    {
        if(DoDaiKetQua == 0)
        {
            System.out.println(MyResult);
            return;
        }
        
            Binary(DoDaiKetQua-1, MyResult + set[0], length, set);
            /*       lan 1: Binary(2,"0",2,{0,1})
             *       lan 2: Binary(1,"00",2,{0,1})
             *       lan 3: Binary(0,"000",2,{0,1}) -> 000
             * 
             */
            Binary(DoDaiKetQua-1, MyResult + set[1], length, set);
            /*      Lan 4: Binary(2,"0",2,{0,1})
                    lan 5: Binary(1,"01",2,{0,1})
                    lan 6: Binary(0,"010",2,{0,1})
             * 
             */
        
    }
    public static void main(String[] args)
    {
        char[] set = {'0','1'};
        int setLength = 2;
        Binary(3, "", setLength, set);
    }
}
