package CodeChef1000_1400;

import java.util.Scanner;

public class TCSExamination {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int DSADRAGON = sc.nextInt();
            int TOCDRAGON = sc.nextInt();
            int DMDRAGON = sc.nextInt();
            int totalDRAGON = DSADRAGON + TOCDRAGON + DMDRAGON;

            int DSASLOTH = sc.nextInt();
            int TOCSLOTH = sc.nextInt();
            int DMSLOTH = sc.nextInt();
            int totalSLOTH = DSASLOTH + TOCSLOTH + DMSLOTH;
            if(totalDRAGON > totalSLOTH) {
                System.out.println("DRAGON");
            } else if (totalDRAGON < totalSLOTH) {
                System.out.println("SLOTH");
            } else if (totalDRAGON == totalSLOTH) {
                if (DSADRAGON > DSASLOTH) {
                    System.out.println("DRAGON");
                } else if (DSADRAGON < DSASLOTH) {
                    System.out.println("SLOTH");
                } else if (DSADRAGON == DSASLOTH) {
                    if (TOCDRAGON > TOCSLOTH) {
                        System.out.println("DRAGON");
                    } else if (TOCDRAGON < TOCSLOTH) {
                        System.out.println("SLOTH");
                    } else if (TOCDRAGON == TOCSLOTH) {
                        if (DMDRAGON > DMSLOTH) {
                            System.out.println("DRAGON");
                        } else if (DMDRAGON < DMSLOTH) {
                            System.out.println("SLOTH");
                        } else if (DMDRAGON == DMSLOTH) {
                            System.out.println("TIE");
                        }
                    }
                }
            }
        }
    }
}