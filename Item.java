public class Item
{
  private ItemType type;
  private String name;

  public Item(ItemType type, String name)
  {
    this.type = type;
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public ItemType getType()
  {
    return type;
  }
}
