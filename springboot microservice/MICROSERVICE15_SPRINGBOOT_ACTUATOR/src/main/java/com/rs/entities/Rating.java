package com.rs.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "rating_sequence")
    @SequenceGenerator(name ="rating_sequence",initialValue = 1,allocationSize = 1)
    private Integer id;
    private Integer hotelid;
    private Integer userid;
    private Integer rating;
    private  String remark;

}
