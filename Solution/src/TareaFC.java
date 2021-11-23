public class TareaFC {

    // (p → q) ⋀ (p → r) ≡ p → (q ⋀ r)
    //variables
    static int a=3, n=(int) Math.pow(2,a);
    static boolean p[]=new boolean[n];
    static boolean q[]=new boolean[n];
    static boolean r[]=new boolean[n];
    static boolean pq[]=new boolean[n];
    static boolean pr[]=new boolean[n];
    static boolean qr[]=new boolean[n];
    static boolean pqpr[]=new boolean[n];
    static boolean pqr[]=new boolean[n];

    public static void main(String[] args) {
        darValores();
        calcular();
        imprimirValores();

    }





    public static void darValores(){
        for (int i = 0; i < n; i++) {
            if(i<n/2) p[i]=true;
            else p[i]=false;
            if(i<2 || i==4 || i==5) q[i]=true;
            else q[i]=false;
            if(i%2==0) r[i]=true;
            else r[i]=false;

        }
    }

    public static void calcular(){
        for (int i = 0; i < n; i++) {
            //calcular (p → q)
            if(p[i] && q[i]==false) pq[i]=false;
            else pq[i]=true;
            //calcular (p → r)
            if(p[i] && r[i]==false)pr[i]=false;
            else pr[i]=true;
            //calcular (q ⋀ r)
            if(q[i] && r[i]) qr[i]=true;
            else qr[i]=false;
            //calcular (p → q) ⋀ (p → r)
            if (pq[i] && pr[i]) pqpr[i]=true;
            else pqpr[i]=false;
            // calcular p → (q ⋀ r)
            if(p[i] && qr[i]==false) pqr[i]=false;
            else pqr[i]=true;



        }
    }

    public static void imprimirValores(){
        System.out.println("p\t\tq\t\tr\t\t(p → q)\t\t(p → r)\t\t(q ⋀ r)\t\t(p → q) ⋀ (p → r)\t\tp → (q ⋀ r)");
        for (int i = 0; i < n; i++) {
            System.out.println(p[i]+"\t"+q[i]+"\t"+r[i]+"\t"+pq[i]+"\t\t"+pr[i]+"\t\t"+qr[i]+"\t\t\t\t"+pqpr[i]+"\t\t\t\t"+pqr[i]);
        }
    }
}
