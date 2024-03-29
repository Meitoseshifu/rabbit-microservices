package com.bobocode.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="notes")
@Getter
@Setter
@ToString
public class Note {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String body;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Note note)) return false;
        return id != null && id.equals(note.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode(); // todo why
    }
}
