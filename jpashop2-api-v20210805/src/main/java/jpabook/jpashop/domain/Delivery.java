package jpabook.jpashop.domain;


public class Delivery {


    private Long id;

    private Order order;

    private Address address;

    private DeliveryStatus status; //READY, COMP
}
