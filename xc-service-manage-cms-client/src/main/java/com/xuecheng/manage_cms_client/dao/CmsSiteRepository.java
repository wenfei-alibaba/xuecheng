package com.xuecheng.manage_cms_client.dao;

import com.xuecheng.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * created by xuwenfei 2021-03-24
 */
public interface CmsSiteRepository extends MongoRepository<CmsSite,String> {

}