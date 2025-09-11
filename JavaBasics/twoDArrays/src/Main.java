public class Main {
    public static void main(String[] args){
        //2D array = An array where each element is an array
        //           Useful for storing a matrix of data
//        ----------TELEPHONE E.G.----------
        char[][] telephone = {
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'},
        };

        for(char[] row : telephone){
            for(char element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }

//        ----------FOOD E.G.---------------
//        String[] fruits = {"apple", "orange", "banana"};
//        String[] vegetables = {"potato", "onion", "carrot"};
//        String[] meats = {"chicken", "pork", "beef", "fish"};

//        2D ARRAY
        //String[][] groceries = {fruits, vegetables, meats};
//        String[][] groceries = {
//                {"apple", "orange", "banana"},
//                {"potato", "onion", "carrot"},
//                {"chicken", "pork", "beef", "fish"}};
//        groceries[row][column]
//        groceries[0][0] = "pineapple";
//        groceries[1][0] = "celery";
//        groceries[1][2] = "celery";
//        groceries[2][1] = "eggs";
//
//        for (String[] arrayElements : groceries){
//            for (String element : arrayElements){
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
    }
}
