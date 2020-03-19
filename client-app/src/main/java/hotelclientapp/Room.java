package hotelclientapp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Room {
    private long id;
    private String name;
    private String number;
    private String info;

    public Room() {
        super();
    }

    public Room(long id, String name, String number, String info) {
        super();
        this.id = id;
        this.name = name;
        this.number = number;
        this.info = info;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Room{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", number='").append(number).append('\'');
        sb.append(", info='").append(info).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
