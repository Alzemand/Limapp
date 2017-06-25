package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Empregado;
import model.Pedido;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-25T00:40:17")
@StaticMetamodel(Servico.class)
public class Servico_ { 

    public static volatile SingularAttribute<Servico, Empregado> empregado;
    public static volatile SingularAttribute<Servico, String> valormetro;
    public static volatile SingularAttribute<Servico, Pedido> pedido;
    public static volatile SingularAttribute<Servico, Long> id;
    public static volatile SingularAttribute<Servico, String> descricao;

}