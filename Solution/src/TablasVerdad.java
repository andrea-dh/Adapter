public class TablasVerdad {

    static int n = 3, renglones = (int) Math.pow(2, n);
    static String p[] = new String[renglones];
    static String q[] = new String[renglones];
    static String r[] = new String[renglones];

    public static void main(String[] args) {

        darValores();
        convertirTF();
        imprimir();


    }

    public static String convertirBinario(int num) {
        String bin = "";
        do {
            if (num % 2 == 0) bin = "0" + bin;
            else bin = "1" + bin;
            num = num / 2;
        }
        while (num > 0);

        return bin;

    }

    public static void darValores() {
        r[0] = convertirBinario(0).substring(0,1);
        q[0] = "0";
        p[0] = "0";
        r[1] = convertirBinario(1).substring(0,1);
        q[1] = "0";
        p[1] = "0";
        r[2] = convertirBinario(2).substring(1,2);
        q[2] = convertirBinario(2).substring(0,1);
        p[2] = "0";
        q[3] = convertirBinario(3).substring(1,2);
        r[3] = convertirBinario(3).substring(0,1);
        p[3] = "0";


        for (int i = 4; i < renglones; i++) {
            p[i] = convertirBinario(i).substring(0,1);
            q[i] = convertirBinario(i).substring(1,2);
            r[i] = convertirBinario(i).substring(2,3);
        }
    }

    public static void convertirTF() {
        for (int i = 0; i < renglones; i++) {
            if(p[i]=="0") p[i]="False";
            if(p[i]=="1") p[i]="True";
            if(q[i]=="0") q[i]="False";
            if(q[i]=="1") q[i]="True";
            if(r[i]=="0") r[i]="False";
            if(r[i]=="1") r[i]="True";


        }

    }


    public static void imprimir(){
        for (int i = 0; i < renglones; i++) {
            System.out.println(p[i] + "\t" + q[i] + "\t" + r[i]);
        }
    }


}

