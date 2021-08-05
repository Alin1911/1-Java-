public class p1 {
    public static void main(String[] args)
    {
        String s1 ="sir1 si cu sir2 fac un sir3";
        String s2 ="si";
        int nr=0;
        int pos=0;
        while(pos != -1){
            pos=s1.indexOf(s2,pos);
            if (pos != -1){
                nr++;
                pos+=s2.length();
            }
        }
        System.out.println(nr);
    }
}