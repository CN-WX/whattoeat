package xyz.amazingxu.whattoeat.DTO;


/**
 * @author xuwang <121894598@qq.com>
 * @date 2018/8/9 14:02
 */
public class DTO {
    @Override
    public String toString() {
        return "DTO{" +
                "id='" + id + '\'' +
                ", what='" + what + '\'' +
                '}';
    }

    private int id;
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
