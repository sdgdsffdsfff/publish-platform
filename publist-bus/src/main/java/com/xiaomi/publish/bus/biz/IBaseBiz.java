package com.xiaomi.publish.bus.biz;


import com.xiaomi.publish.bus.bean.PageResults;

import java.util.List;

/**
 * 业务接口
 * Created by lijie on 2015-08-10.
 */
public interface IBaseBiz<T> {

    public void save(T t);

    public void update(T t);

    public void saveOrUpdate(T t);

    public T load(int id);

    public T get(int id);

    public void delete(T t);

    public void delete(int Id);

    public void executeHql(String hqlString, Object... values);

    public void executeSql(String sqlString, Object... values);

    public T getByHQL(String hqlString, Object... values);

    public T getBySQL(String sqlString, Object... values);

    public List<T> getListByHQL(String hqlString, Object... values);

    public List<T> getListBySQL(String sqlString, Object... values);

    public Long countByHql(String hql, Object... values);

    public Long countBySql(String sql, Object... values);

    public PageResults<T> findPageByFetchedHql(String hql, String countHql, int pageNo, int pageSize, Object... values);
}
