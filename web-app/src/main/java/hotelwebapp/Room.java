package hotelwebapp;
/*
17.03.2020
created by yalind
*/

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="ROOM")
public class Room {
    @Id
    @Column(name="ROOM_ID")
    @GeneratedValue
    private long id;
    @Column(name="NAME")
    private String name;
    @Column(name="ROOM_NUMBER")
    private String number;
    @Column(name="BED_INFO")
    private String info;

    public Room(long id, String name, String number, String info) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.info = info;
    }
}
