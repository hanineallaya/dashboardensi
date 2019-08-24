package hanine.karim.dashboard.Entities;

import javax.persistence.OneToMany;
import java.io.Serializable;

public class IdentityStore implements Serializable {
    private Long IDstore;
    private String DisplayName;
    private String Description;
    @OneToMany(mappedBy = "IdentityStore")
    private String Type;
    private Long OrgUnit;
    private String IdentityProviders;
}
