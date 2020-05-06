package piles;

import cards.*;
import java.util.Collections;

/**
 * An interface that is used for the methods in determining game logic for
 * whether a card can be added to another pile or not.
 * 
 * @author Jennifer
 *
 */
public interface IGamePile {

	public boolean addable(Pile p);

	public boolean canAdd(Pile p);

}
