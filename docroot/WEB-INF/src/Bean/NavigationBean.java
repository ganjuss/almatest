package Bean;


public class NavigationBean
{
    private String id;

    private String navLabel;

    private String navLink;

    private SubNav subNav;

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

    public  String getNavLink ()
    {
        return navLink;
    }

    public void setNavLink (String navLink)
    {
        this.navLink = navLink;
    }

    public SubNav getSubNav ()
    {
        return subNav;
    }

    public void setSubNav (SubNav subNav)
    {
        this.subNav = subNav;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", navLabel = "+navLabel+", navLink = "+navLink+", subNav = "+subNav+"]";
    }
}