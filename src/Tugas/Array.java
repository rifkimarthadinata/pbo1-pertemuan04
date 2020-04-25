package Tugas;

public class Array {
    public static void main(String[] args) {
        String teman[][]={

                {"syihab","habibi","doni"},
                {"dino","rian","rosa"},
                {"arif","hafiz","fauzan"},
        };
        for(int row=0; row<teman.length; row++){
            for(int col=0; col<teman.length; col++) {
                System.out.println(teman[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
