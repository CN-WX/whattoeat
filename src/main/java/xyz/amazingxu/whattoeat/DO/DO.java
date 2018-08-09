package xyz.amazingxu.whattoeat.DO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author xuwang <121894598@qq.com>
 * @date 2018/8/9 13:56
 */
@Entity(name = "what")
public class DO {
    @Override
    public String toString() {
        return "DO{" +
                "id='" + id + '\'' +
                ", what='" + what + '\'' +
                '}';
    }

    @Id
    @Column(name = "id",length = 20,nullable = false)
    private int id;
    @Column(name = "what",nullable = false)
    private String what;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }
}
