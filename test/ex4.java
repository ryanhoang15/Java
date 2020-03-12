package test;

public class ex4 {
        private char suit;
        private char rank;

        public ex4(char r, char s) {
            this.rank = r;
            this.suit = s;
        }

        public  void display() {
            System.out.printf("%c%c",rank,suit);
        }

        public int getValue(){
            int value = 0;
            if( rank =='A'){
                value = 1;
            }
            else if( rank =='T' || rank == 'J' || rank == 'Q' || rank == 'K'){
                value = 10;
            }
            return value;
        }

    public char getRank(){
        return rank;
    }

    public char getSuit(){
        return suit;
    }

        public static void main(String[] arg){
            ex4 c1 = new ex4('T','H');
            c1.display();
            System.out.println("\n" + c1.getValue());
            System.out.println(c1.getRank());
            System.out.println(c1.getSuit());

        for(int i = 0; i < 4;i++){
            System.out.print("*");
            for(int j = 0; j < 13; j++){
                System.out.print("^");
            }
            System.out.println();
        }

    }
}


