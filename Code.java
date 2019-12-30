public class Code {

    int[] codeArray;
    int[] colourCountArray;

    //Mastermind code constructor
    public Code(int firstColour, int secondColour, int thirdColour, int fourthColour) {

        codeArray = new int[] {firstColour, secondColour, thirdColour, fourthColour};
        colourCountArray = new int[] {0, 0, 0, 0, 0, 0, 0, 0};

        int codeNumber;
        for(int i = 0; i < 4; i++){
            codeNumber = codeArray[i];
            switch (codeNumber) {
                case 0:
                    colourCountArray[0]++;
                    break;
                case 1:
                    colourCountArray[1]++;
                    break;
                case 2:
                    colourCountArray[2]++;
                    break;
                case 3:
                    colourCountArray[3]++;
                    break;
                case 4:
                    colourCountArray[4]++;
                    break;
                case 5:
                    colourCountArray[5]++;
                    break;
                case 6:
                    colourCountArray[6]++;
                    break;
                case 7:
                    colourCountArray[7]++;
                    break;
            }
        }
    }

    //Determines if every colour in one code is the same as another
    public boolean isEqual(Code anotherCode) {
        for (int i = 0; i < 4; i++) {
            if(codeArray[i] != anotherCode.codeArray[i]) {
                return false;
            }
        }
        return true;
    }

    //Prints the Mastermind code with the format "| COLOUR1 | COLOUR2 | COLOUR 3 | COLOUR 4 |"
    public void printCode() {

        String codeString = "|";
        int codeNumber;

        for(int i = 0; i < 4; i++){
            codeNumber = codeArray[i];
            //Converts a number code into a string code where the each number corresponds to a colour name
            switch (codeNumber) {
                case 0:
                    codeString += " RED |";
                    break;
                case 1:
                    codeString += " ORANGE |";
                    break;
                case 2:
                    codeString += " YELLOW |";
                    break;
                case 3:
                    codeString += " GREEN |";
                    break;
                case 4:
                    codeString += " BLUE |";
                    break;
                case 5:
                    codeString += " PINK |";
                    break;
                case 6:
                    codeString += " GREY |";
                    break;
                case 7:
                    codeString += " WHITE |";
                    break;
            }
        }
        System.out.println(codeString);
    }



}