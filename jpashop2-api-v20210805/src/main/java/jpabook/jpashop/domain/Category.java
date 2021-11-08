package jpabook.jpashop.domain;


public class Category {

    private Long id;

    private String name;


    private List<Item> items = new ArrayList<>();


    private Category parent;

    private List<Category> child = new ArrayList<>();

    //==연관관계 메서드==//

    }

}
