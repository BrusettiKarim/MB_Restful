package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-27T14:30:54")
@StaticMetamodel(Utente.class)
public class Utente_ { 

    public static volatile SingularAttribute<Utente, String> password;
    public static volatile SingularAttribute<Utente, String> ruolo;
    public static volatile SingularAttribute<Utente, String> salt;
    public static volatile SingularAttribute<Utente, String> email;
    public static volatile SingularAttribute<Utente, String> username;

}