/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 7
 */

public class GiftListIterator implements ItemIterator
{
  private GiftList GL;
  private int position;

  public GiftListIterator(GiftList gl)
  {	
	  GL = gl;
	  position = 0;
  }

  public boolean hasNext()
  {
	  if (position < (GL.getItems()).size()) // GL.getItems() returns ArrayList, this checks size
		  return true;		// If size < position, there are more items
	  else
		  return false;
  }

  public Item next()
  {												// Position already incremented
	  Item i = (GL.getItems()).get(position);	// We seek the next position in Arraylist
	  position++;
	  return i;
	 
  }
}
