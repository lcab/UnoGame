/*Lorena Cabrera
 *
 */
import java.util.*;

public class player {

    private int c_Player;

    private List<String> stack;

    public player()
    {

    }

    public player(int currentPlayer)
    {
        c_Player = currentPlayer;

    }

    public int getPlayer()
    {
        return c_Player;
    }

    public String[] getStack()
    {
        String stackList[] = new String[stack.size()];

        for(int i=0; i < stack.size(); i++)
        {
            stackList[i] =stack.get(i);
        }

        for(String h : stackList)
		{
			System.out.print("\t" + h + "\n");
		}

        return stackList;
    }


    public String toString()
    {
        return "Player "+ c_Player + ", their stack is = " + stack;
    }
}
