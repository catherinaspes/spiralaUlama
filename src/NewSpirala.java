public class NewSpirala {

    //OD POCZĄTKU!

    public static void main(String[] args) {

        int rozmiarSpirali = 25;

        int szerokoscSpirali = (int) Math.sqrt(rozmiarSpirali);

        if ((szerokoscSpirali * szerokoscSpirali) < rozmiarSpirali) {
            szerokoscSpirali++;
        }

        int wartoscI = -1;
        int wartoscJ = -1;
        int wartoscPoczatkowa = 1;
        int kolejnaLiczba = 1;
        int punktPoczatkowy;
        int okrazenie = 0;
        int[][] spirala = new int[szerokoscSpirali][szerokoscSpirali];

        if (szerokoscSpirali % 2 == 0) {
            punktPoczatkowy = szerokoscSpirali / 2-1;
        } else {
            punktPoczatkowy = szerokoscSpirali / 2;
        }


        for (int i = 0; i < szerokoscSpirali; i++) {

            okrazenie++;


            if (i == 0) {
                spirala[punktPoczatkowy][punktPoczatkowy] = wartoscPoczatkowa;
                wartoscI = punktPoczatkowy;
                wartoscJ = punktPoczatkowy;
            }

            //gora

            if (i == 0) {

                for (int j = 0; j < 1; j++)
                    kolejnaLiczba++;
                    wartoscI++;

                spirala[wartoscI][wartoscJ] = kolejnaLiczba;
            } else {
                for (int j = 0; j < okrazenie * 2 - 1; j++)
                    kolejnaLiczba++;
                    wartoscI++;

                spirala[wartoscI][wartoscJ] = kolejnaLiczba;

            }

            //prawo


            for (int k = 0; k < okrazenie * 2 - 1; k++) {
                kolejnaLiczba++;
                wartoscJ++;
                spirala[wartoscI][wartoscJ] = kolejnaLiczba;

            }
            //dół

            for(int l = 0; l<okrazenie*2-1; l++){
                kolejnaLiczba++;
                wartoscI--;
                spirala[wartoscI][wartoscJ] = kolejnaLiczba;
            }

            //lewo

            for(int m = 0; m<okrazenie*2-1; m++){
                kolejnaLiczba++;
                wartoscJ--;
                spirala[wartoscI][wartoscJ] = kolejnaLiczba;
            }


        }


        for (int i = 0; i < szerokoscSpirali; i++) {
            for (int j = 0; j < szerokoscSpirali; j++) {
                System.out.print(spirala[i][j] + "\t \t");
            }
            System.out.println();
        }


    }


}
