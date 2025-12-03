import java.util.ArrayList;
import java.util.List;

public class cleancode1 {
    public final static int STATUS_VALUE = 0; 
    public final static int FLAGGED = 4; 
 
    public List2<int[]> getFlaggedCells() {
        List2<int[]> flaggedCells = new ArrayList<int[]>();
        
        for (int[] cell : gameBoard)
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
            return flaggedCells; 
    }
}