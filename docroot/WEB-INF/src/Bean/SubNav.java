package Bean;

public class SubNav
{
    private String id;

    private String navLabel;

    private String navLink;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getNavLabel ()
    {
        return navLabel;
    }

    public void setNavLabel (String navLabel)
    {
        this.navLabel = navLabel;
    }

    public String getNavLink ()
    {
        return navLink;
    }

    public void setNavLink (String navLink)
    {
        this.navLink = navLink;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", navLabel = "+navLabel+", navLink = "+navLink+"]";
    }
}
