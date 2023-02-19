class Array2d
{ 
    public static void main(String args[])
     { 

     int[][] board = new int[4][4]; 

System.out.println("\n Fast algo \n");
     for (int row = 0; row < board.length; row++) 
     { 
        for (int col = 0; col < board[row].length; col++) 
        { 
            board[row][col] = row * col; 
            System.out.println(board[row][col]);
        } 
      }
      
System.out.println(" \n\n Slow Algo \n");
            for (int row = 0; row < board.length; row++) 
            { 
                for (int col = 0; col < board[row].length; col++) 
                { 
                    board[col][row] = col * row;
                    System.out.println(board[col][row]);
                } 
            } 
        } 
}

