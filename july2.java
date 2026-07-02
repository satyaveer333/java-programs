public class july2{
    public static void main(String[] args){
        //code 1
        int i = 0;
        for (i = 0; i < 10; i=i+2) {
            System.out.println(i);
        }

        //code 2
        int j = 0;
        for (j = 0; j < 10; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }

        //code 3
        int k = 0;
        for (k = 0; k < 10; k++) {
            if (k % 2 != 0) {
                continue;
            }
            System.out.println(k);
        }

        //code 4
        int l = 0;
        for (l = 0; l < 10; l++) {
            if (l== 5) {
                break;
            }
            System.out.println(l);
        }

        //code 5
        int m = 0;
        for (m = 0; m < 10; m++) {
            if (m== 5) {
                continue;
            }
            System.out.println(m);
        }

        //code 6
        int n = 0;
        for (n = 0; n < 10; n++) {
            if (n!= 5) {
                continue;
            }
            System.out.println(n);
        }

        //code 7
        int o = 0;
        for (o = 0; o < 10; o++) {
            if (o != 5) {
                System.out.println(o);
            }
        }

        //code 8
        int p = 0;
        for (p = 0; p < 10; p++) {
            if (p != 5) {
                break;
            }
            System.out.println(p);
        }

        //code 9
        int q = 0;
        for (q = 0; q < 10; q++) {
            if (q>5) {
                System.out.println(q);
            }
        }

        //code 10
        int r = 0;
        for (r = 0; r < 10; r++) {
            if (r<5) {
                System.out.println(r);
            }
        }
    }
}