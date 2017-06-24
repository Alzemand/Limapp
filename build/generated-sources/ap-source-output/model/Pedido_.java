package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Cliente;
import model.Servico;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-24T17:33:14")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Cliente> cliente;
    public static volatile SingularAttribute<Pedido, String> data;
    public static volatile SingularAttribute<Pedido, Long> id;
    public static volatile SingularAttribute<Pedido, Servico> servico;
    public static volatile SingularAttribute<Pedido, String> metragem;

}