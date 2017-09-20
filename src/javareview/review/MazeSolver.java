/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview.review;

/**
 *
 * @author slatz8075
 */
public class MazeSolver {

    
    public void printMaze(char[][] maze){
        //loop through all rows
        for(int i = 0; i < maze.length; i++){
            //go through each row
            for(int j = 0; j < maze[i].length; j++){
                //printing the curent location
                System.out.print(maze[i][j]);
            }
            //move to next line
            System.out.println("");
        }
    }
    
    public boolean solveMaze(char[][] maze, int row, int col){
        //am I off the map?
        if(row < 0 || col < 0 || 
           row >=maze.length || 
           col >= maze[0].length){
            return false;
        }
        //did I find the end?>
        if(maze[row][col] == 'e'){
            printMaze(maze);
            return true;
        }
        //is the a bad spot?
        if(maze[row][col] == '+' ||
           maze[row][col] == 'w'){
            return false;
        }
        //I'm on a valid location!
        //mark I've been here!
        maze[row][col] = '+';
        //check north!
        boolean check = solveMaze(maze, row - 1, col);
        if (check){
            return true;
        }
        //check east
        check = solveMaze(maze, row, col + 1);
        if (check){
            return true;
        }
        //check south
        check = solveMaze(maze, row + 1, col);
        if (check){
            return true;
        }
        //check west
        check = solveMaze(maze, row, col -1);
        if (check){
            return true;
        }
        //spot no good
        //"unmoving..."
        maze[row][col] = '.';
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //char[][] maze = new char[10][10];
        char[][] maze = {{'w','w','w','w','.', '.'},
                         {'s','.','w','.','w', '.'},
                         {'w','.','w','.','w', '.'},
                         {'w','.','.','.','.', '.'},
                         {'w','w','w','e','w', 'w'}};
        
        
        MazeSolver test = new MazeSolver();
        test.printMaze(maze);
        System.out.println(" ");
        test.solveMaze(maze,1,0);
    }
}
