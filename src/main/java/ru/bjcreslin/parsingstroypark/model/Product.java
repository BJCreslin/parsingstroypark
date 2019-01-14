package ru.bjcreslin.parsingstroypark.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * table Product
 * <p>
 * version -1.0
 * id
 * name- название
 * link - ссылка
 * cost- цена
 * comment- примечание
 */

@Entity
@Getter
@Setter
@ToString
@Table(name = "products")
public class Product extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "link")
    private String link;

    @Column(name = "cost")
    private BigDecimal cost;

    @Column(name = "comment")
    private String comment;

    @Column(name = "code")
    private Long code;

    @Column(name = "ourname")
    private String ourName;

}
