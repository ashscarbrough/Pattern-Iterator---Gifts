public class App
{
  public static void main(String[] args)
  {
    GiftList chest = new GiftList();
    
    Item I1 = new Item(ItemType.BOOK, "Lord of Ring");
    Item I2 = new Item(ItemType.DOLL, "Care Bears");
    Item I3 = new Item(ItemType.DVD, "Potion of Wisdom");
    Item I4 = new Item(ItemType.GAME, "Doom Day");
    Item I5 = new Item(ItemType.BOOK, "Sword of Silver");

    chest.addItem(I1);
    chest.addItem(I2);
    chest.addItem(I3);
    chest.addItem(I4);
    chest.addItem(I5);
    chest.removeItem(I1);

    ItemIterator myIterator = chest.iterator();
    
    while (myIterator.hasNext())
    {
    	Item item = myIterator.next();
    	System.out.println(item.getName() + ": " + item.getType());
    }
  }
}
