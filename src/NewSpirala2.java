public class NewSpirala2 {

    public static void main(String[] args) {

        int szerokoscSpirali = 20;
        int b;
        if (szerokoscSpirali % 2 == 0) {
            b = szerokoscSpirali / 2;
        } else {
            b = (szerokoscSpirali / 2) + 1;
        }


        int szer = szerokoscSpirali;

        int spirala[][] = new int[szerokoscSpirali][szerokoscSpirali];

        int liczbaKontrolna = 0;

        int wartoscI = 0;
        int wartoscJ = 0;


        for (int i = 0; i < b; i++) {

            //dół

            System.out.println("jedziem w dół");

            for (int j = 0; j < szer; j++) {
                liczbaKontrolna++;
                spirala[wartoscI][wartoscJ] = liczbaKontrolna;
                System.out.print("Liczba kontrolna: " + liczbaKontrolna);
                System.out.print(" wartość i: " + wartoscI);
                System.out.println(" wartość J: " + wartoscJ);
                System.out.println();
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
            //prawo

            System.out.println("jedziem w prawo");
            for (int k = 1; k < szer; k++) {
                if (k == 1) {
                    wartoscJ++;
                }
                liczbaKontrolna++;
                spirala[wartoscI][wartoscJ] = liczbaKontrolna;
                System.out.print("Liczba kontrolna: " + liczbaKontrolna);
                System.out.print(" wartość i: " + wartoscI);
                System.out.println(" wartość J: " + wartoscJ);
                System.out.println();
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

            //góra
            System.out.println("jedziem w górę");

            for (int l = 1; l < szer; l++) {
                if (l == 1) {
                    wartoscI--;
                }
                liczbaKontrolna++;
                spirala[wartoscI][wartoscJ] = liczbaKontrolna;
                System.out.print("Liczba kontrolna: " + liczbaKontrolna);
                System.out.print(" wartość i: " + wartoscI);
                System.out.println(" wartość J: " + wartoscJ);
                System.out.println();

                if ((wartoscI >= (szerokoscSpirali-szer)) && (wartoscI>0)) {
                    wartoscI--;
                }
            }


            //lewo
            System.out.println("jedziem w lewo");

            for (int m = 1; m < szer - 1; m++) {
                if (m == 1) {
                    wartoscJ--;
                }
                liczbaKontrolna++;
                spirala[wartoscI][wartoscJ] = liczbaKontrolna;
                System.out.print("Liczba kontrolna: " + liczbaKontrolna);
                System.out.print(" wartość i: " + wartoscI);
                System.out.println(" wartość J: " + wartoscJ);
                System.out.println();

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
                System.out.print(spirala[i][j] + "\t \t");
            }
            System.out.println();
        }




    }
}
