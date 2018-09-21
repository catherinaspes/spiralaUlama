public class Spirala {

    public static void main(String[] args) {

        int szerokoscSpirali = 7;
        int b;
        if (szerokoscSpirali % 2 == 0) {
            b = szerokoscSpirali / 2;
        } else {
            b = (szerokoscSpirali / 2) + 1;
        }


        int szer = szerokoscSpirali;

        int spirala[][] = new int[szerokoscSpirali][szerokoscSpirali];

        int liczbaKontrolna = (szerokoscSpirali*szerokoscSpirali)+1;

        int wartoscI = 0;
        int wartoscJ = 0;


        for (int i = 0; i < b; i++) {

            for (int j = 0; j < szer; j++) {
                liczbaKontrolna--;
                spirala[wartoscI][wartoscJ] = liczbaKontrolna;

                if (i == 0) {
                    if (wartoscI < (szer - 1)) {
                        wartoscI++;
                    }
                } else {
                    if (wartoscI < szer) {
                        wartoscI++;
                    }
                }
            }

            for (int k = 1; k < szer; k++) {
                if (k == 1) {
                    wartoscJ++;
                }
                liczbaKontrolna--;
                spirala[wartoscI][wartoscJ] = liczbaKontrolna;

                if (i == 0) {
                    if (wartoscJ < (szer - 1)) {
                        wartoscJ++;
                    }
                } else {
                    if (wartoscJ < szer) {
                        wartoscJ++;
                    }
                }
            }

            for (int l = 1; l < szer; l++) {
                if (l == 1) {
                    wartoscI--;
                }
                liczbaKontrolna--;
                spirala[wartoscI][wartoscJ] = liczbaKontrolna;


                if ((wartoscI >= (szerokoscSpirali-szer)) && (wartoscI>0)) {
                    wartoscI--;
                }
            }

            for (int m = 1; m < szer - 1; m++) {
                if (m == 1) {
                    wartoscJ--;
                }
                liczbaKontrolna--;
                spirala[wartoscI][wartoscJ] = liczbaKontrolna;
                if ((wartoscJ >= (szerokoscSpirali-szer)) && (wartoscJ>0)) {
                    wartoscJ--;
                }
            }

            szer--;
            szer--;
            wartoscI++;
            wartoscJ++;


        }


        for (int i = 0; i < szerokoscSpirali; i++) {
            for (int j = 0; j < szerokoscSpirali; j++) {
                System.out.print(spirala[i][j] + "\t ");
            }
            System.out.println();
        }
    }
}
