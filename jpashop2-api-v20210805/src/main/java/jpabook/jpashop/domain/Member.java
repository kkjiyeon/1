package jpabook.jpashop.domain;


public class Member {


    private Long id;

    private String name;


    private Address address;


    private List<Order> orders = new ArrayList<>();

}
