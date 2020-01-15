package io.spass.spasswebapp.organisation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Organisation {

    @Id
    public String id;

    public String name;
}
