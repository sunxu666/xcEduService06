package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 〈一句话功能简述〉<br>
 * 〈dao〉
 *
 * @author sunxu
 * @create 2019/7/30
 * @since 1.0.0
 */
public interface CmsSiteRepository extends MongoRepository<CmsSite,String> {
}
