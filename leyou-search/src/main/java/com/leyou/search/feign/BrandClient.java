package com.leyou.search.feign;

import com.leyou.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Qin PengCheng
 * @date 2018/6/7
 */
@FeignClient(value = "item-service")
public interface BrandClient extends BrandApi {
}
