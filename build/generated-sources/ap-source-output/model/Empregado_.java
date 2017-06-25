package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Funcao;
import model.Servico;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-25T00:40:17")
@StaticMetamodel(Empregado.class)
public class Empregado_ { 

    public static volatile SingularAttribute<Empregado, Funcao> funcao;
    public static volatile SingularAttribute<Empregado, String> matricula;
    public static volatile SingularAttribute<Empregado, String> nome;
    public static volatile SingularAttribute<Empregado, Long> id;
    public static volatile SingularAttribute<Empregado, Servico> servico;

}