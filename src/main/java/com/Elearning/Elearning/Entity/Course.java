package com.Elearning.Elearning.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private boolean isPublished;
    private String targetAudience;
    private String objectives;
    private String status;
    private String prerequisites;
    private String level;
    private String currency;
    private double price;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.LAZY)
    private List<Section> sections;

    public Course(String title,String description,boolean isPublished,String targetAudience,String objectives,String status,String prerequisites,String level,String currency,double price)
    {
        this.title=title;
        this.description=description;
        this.isPublished=isPublished;
        this.targetAudience=targetAudience;
        this.objectives=objectives;
        this.status=status;
        this.prerequisites=prerequisites;
        this.level=level;
        this.currency=currency;
        this.price=price;

    }
}
