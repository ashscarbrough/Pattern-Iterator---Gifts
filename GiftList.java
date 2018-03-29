import java.util.ArrayList;

public class GiftList implements ItemCollection
{
  private ArrayList<Item> items;

  public GiftList()
  {
    items = new ArrayList<>();
  }
  
  public void addItem(Item item)
  {
	  items.add(item);
  }
  
  public void removeItem(Item item)
  {
	  items.remove(item);
  }

  public ItemIterator iterator()
  {
    return new GiftListIterator(this);
  }

  public ArrayList<Item> getItems()
  {
    return items;
  }
}
