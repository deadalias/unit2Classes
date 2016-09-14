public class Door
{
    private String name;
    private boolean isOpened;
    
    public Door( String doorName, boolean doorIsOpened )
    {
        this.name = doorName;
        this.isOpened = doorIsOpened;
    }
    
    public void open()
    {
        this.isOpened = true;
    }
    
    public void close()
    {
        this.isOpened = false;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName( String newName )
    {
    	this.name = newName;
    }

    public boolean getIsOpened()
    {
        return this.isOpened;
    }
    
    public String toString()
    {
        String str = "The door: ";
        str += this.getName();
        str += " is opened: ";
        str += this.getIsOpened();
        return str;
    }
}