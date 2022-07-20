public class index
{
    public static void main (String args[])
    {
        //Deklarasi array
        String[][]huruf = {
                {"A","B","C/K","D","E"},
                {"F","G","H","I","J"},
                {"L","M","N","O","P"},
                {"Q","R","S","T","U"},
                {"V","W","X","Y","Z"}
        };
        //Menampilkan isi array pada indeks ke-[0][1] dan [2][0]
        System.out.println(huruf[0][2]);
        System.out.println(huruf[3][1]);
        System.out.println(huruf[0][2]);
        System.out.println(huruf[2][4]);
    }
}
