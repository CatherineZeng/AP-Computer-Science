
/**
 * Contact class
 * 
 * @Catherine Zeng 
 * @4-14-14
 */
public class Contact
{
    String name;
    String relation;
    String bday;
    String phone;
    String email;
    
    public Contact(String name, String relation, String bday, String phone, String email)
    {
        this.name=name;
        this.relation=relation;
        this.bday=bday;
        this.phone=phone;
        this.email=email;
    }
    
    public String getName()
    {return name;}
    public String getRelation()
    {return relation;}
    public String getBday()
    {return bday;}
    public String getPhone()
    {return phone;}
    public String getEmail()
    {return email;}
    
    public String toString()
    {
        System.out.printf("%16s%16s%16s%16s%25s",getName(), getRelation(), getBday(), getPhone(), getEmail());
        return "";
    }
    
}
