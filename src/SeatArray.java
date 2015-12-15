public class SeatArray {
 
        Seat[][] firstClass;
        Seat[][] businessClass;
        Seat[][] economyClass;
 
        public SeatArray(int x, int y, int f, int g, int h, int k) {
                firstClass = new Seat[x][y];
                fillSeats(1);
                businessClass = new Seat[f][g];
                fillSeats(2);
                economyClass = new Seat[h][k];
                fillSeats(3);
        }
       
        // Fills in the empty array with empty seats
        public void fillSeats(int classType){
                if (classType == 1){
                        for (int i = 0; i < firstClass.length; i++){
                                for (int k = 0; k < firstClass[i].length;k++){
                                        firstClass[i][k] = new Seat(true, 1);
                                }
                        }
                }
                else if (classType == 2){
                        for (int i = 0; i < businessClass.length; i++){
                                for (int k = 0; k < businessClass[i].length;k++){
                                        businessClass[i][k] = new Seat(true, 2);
                                }
                        }
                }
                else if (classType == 3){
                        for (int i = 0; i < economyClass.length; i++){
                                for (int k = 0; k < economyClass[i].length;k++){
                                        economyClass[i][k] = new Seat(true, 3);
                                }
                        }
                }
               
        }
       
        //Gets the seat number code (BF9, FA10, EE16, etc)
        public String getSeatNumber(int x, int y, int classType){
                String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                if (classType == 1){
                        return "F" + alphabet.substring(x, x+1) + y;
                }
                else if (classType == 2){
                        return "B" + alphabet.substring(x, x+1) + y;
                }
                else if (classType == 3){
                        return "E" + alphabet.substring(x, x+1) + y;
                }
                else return "Invalid Seat";
        }
 
        // Checks if the seat is a window seat
        public boolean isWindowSeat(int x, int y, int classType) {
                if (classType == 1) {
                        if (x == 0 && y < firstClass[0].length)
                                return true;
                        else if (x == firstClass.length && y < firstClass[0].length)
                                return true;
                        else
                                return false;
                } else if (classType == 2) {
                        if (x == 0 && y < businessClass[0].length)
                                return true;
                        else if (x == businessClass.length && y < businessClass[0].length)
                                return true;
                        else
                                return false;
                } else if (classType == 3) {
                        if (x == 0 && y < economyClass[0].length)
                                return true;
                        else if (x == economyClass.length && y < economyClass[0].length)
                                return true;
                        else
                                return false;
                } else
                        return false;
        }
 
        // Sets availability of the seats (empty or not)
        public void setAvailability(int x, int y, boolean available, int classType) {
                if (classType == 1) firstClass[x][y].setAvailability(available);
                else if (classType == 2) businessClass[x][y].setAvailability(available);
                else if (classType == 3) economyClass[x][y].setAvailability(available);
        }
 
        // Getting availability of the seats (empty or not)
        public boolean getAvailability(int x, int y, int classType) {
                if (classType == 1) return firstClass[x][y].getAvailability();
                else if (classType == 2) return businessClass[x][y].getAvailability();
                else if (classType == 3) return economyClass[x][y].getAvailability();
                else return false;
        }
 
        // Sets the prices of all seats in that class type (business, first, economy)
        public void setPrice(double price, int classType) {
                if (classType == 1) {
                        for (int i = 0; i < firstClass.length; i++) {
                                for (int j = 0; j < firstClass[i].length; j++) {
                                        firstClass[i][j].setPrice(price);
                                }
                        }
                }
                else if (classType == 2) {
                        for (int i = 0; i < businessClass.length; i++) {
                                for (int j = 0; j < businessClass[i].length; j++) {
                                        businessClass[i][j].setPrice(price);
                                }
                        }
                }
                else if (classType == 3) {
                        for (int i = 0; i < economyClass.length; i++) {
                                for (int j = 0; j < economyClass[i].length; j++) {
                                        economyClass[i][j].setPrice(price);
                                }
                        }
                }
        }
       
        // Gets the price of the seat
        public String getPrice (int x, int y, int classType){
                if (classType == 1) return firstClass[x][y].getPrice();
                else if (classType == 2) return businessClass[x][y].getPrice();
                else if (classType == 3) return economyClass[x][y].getPrice();
                else return null;
        }
       
        public String groupFind(int number, int classType){
                Seat[][] classGroup;
                if (classType == 1) classGroup = firstClass;
                else if (classType == 2) classGroup = businessClass;
                else if (classType == 3) classGroup = economyClass;
                else return null;
               
                String[] group = new String[number];
                for (int i = 0; i < classGroup.length; i++){
                        boolean done = false;
                        for (int k = 0; k < classGroup[i].length; k++){
                               
                                int count = 0;
                                int arrayCount = 0;
                               
                                for (int h = i; h < i + (number/3 + 1) && h + i < classGroup.length; h++){
                                        for (int g = k; g < i + (number/3 +1) && g + k < classGroup[h].length; g++){
                                                if (classGroup[h][g].getAvailability() == true){
                                                        group[arrayCount] = this.getSeatNumber(h, g, classType);
                                                        arrayCount++;
                                                        count++;
                                                }
                                                if (count == number){
                                                        done = true;
                                                        break;
                                                }
                                        }
                                        if (done) break;
                                }
                                if (done) break;
                        }
                        if (done) break;
                }
                String result = group[0];
                for (int i = 1; i < group.length; i++){
                        result = result + " " +  group[i] + " ";
                }
                return result;
        }
 
}