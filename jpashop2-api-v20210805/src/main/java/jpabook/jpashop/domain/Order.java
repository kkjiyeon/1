package jpabook.jpashop.domain;



import static javax.persistence.FetchType.*;


public class Order {

    private Long id;


    private Member member;

    private List<OrderItem> orderItems = new ArrayList<>();


    private Delivery delivery;

    private LocalDateTime orderDate; //주문시간

    private OrderStatus status; //주문상태 [ORDER, CANCEL]

    //==연관관계 메서드==//
    public void setMember(Member member) {

    }

    public void addOrderItem(OrderItem orderItem) {

    }

    public void setDelivery(Delivery delivery) {

    }

    //==생성 메서드==//
    public static Order createOrder(Member member, Delivery delivery, OrderItem... orderItems) {

        }

    }

    //==비즈니스 로직==//
    /**
     * 주문 취소
     */
    public void cancel() {

        }


        }
    }

    //==조회 로직==//
    /**
     * 전체 주문 가격 조회
     */
    public int getTotalPrice() {

    }

}
