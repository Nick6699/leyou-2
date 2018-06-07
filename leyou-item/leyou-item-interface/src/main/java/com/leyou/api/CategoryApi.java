package com.leyou.api;



import com.leyou.pojo.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.jmx.export.naming.IdentityNamingStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Qin PengCheng
 * @date 2018/6/5
 */
@RequestMapping("category")
public interface CategoryApi {

    /**
     * 根据分类id查询分类名称的方法
     *
     * @param list
     * @return
     */
    @GetMapping("names")
    public ResponseEntity<List<String>> queryCategoryNamesBycids(
            @RequestParam("ids") List<Long> list
    );

    /**
     * 根据分类的id查询所有分类的方法
     * @param cids
     * @return
     */
    @GetMapping("categories")
    public ResponseEntity<List<Category>> queryCategoriesByCids(
            @RequestParam("cids") List<Long> cids
    );

}
