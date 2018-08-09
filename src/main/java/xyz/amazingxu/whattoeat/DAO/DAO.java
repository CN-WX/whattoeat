package xyz.amazingxu.whattoeat.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import xyz.amazingxu.whattoeat.DO.DO;

/**
 * @author xuwang <121894598@qq.com>
 * @date 2018/8/9 14:03
 */
public interface DAO extends JpaRepository<DO,String> ,JpaSpecificationExecutor<DO>{
}
