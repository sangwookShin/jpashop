package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

//    mappedBy 쓰면 member에 의해 매핑된 것
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

}
