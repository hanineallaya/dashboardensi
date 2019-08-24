package hanine.karim.dashboard.Entities;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
public class Identity implements Serializable {
    private long ID;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long LoginID;
    private String DisplayName;

    private String FirstName;
    private String LastName;
    private String  Email;
    private String Function;


    private int OrganizationUnit;
}
