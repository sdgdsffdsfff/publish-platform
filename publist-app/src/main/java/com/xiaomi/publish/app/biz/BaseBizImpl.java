package com.xiaomi.publish.app.biz;

import com.xiaomi.publish.app.bean.PageResults;
import com.xiaomi.publish.app.dao.BaseDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 业务基类
 * Created by lijie on 2015-08-10.
 */
public class BaseBizImpl<T> implements IBaseBiz<T> {

    @Autowired
    private BaseDaoImpl<T> baseDao;

    @Override
    public void save(T t) {
        baseDao.save(t);
    }

    @Override
    public void update(T t) {
        baseDao.update(t);
    }

    @Override
    public void saveOrUpdate(T t) {
        baseDao.saveOrUpdate(t);
    }

    @Override
    public T load(int id) {
        return baseDao.load(id);
    }

    @Override
    public T get(int id) {
        return baseDao.get(id);
    }

    @Override
    public void delete(T t) {
        baseDao.delete(t);
    }

    @Override
    public void delete(int id) {
        baseDao.delete(id);
    }

    @Override
    public void executeHql(String hqlString, Object... values) {
        baseDao.executeHql(hqlString, values);
    }

    @Override
    public void executeSql(String sqlString, Object... values) {
        baseDao.executeSql(sqlString, values);
    }

    @Override
    public T getByHQL(String hqlString, Object... values) {
        return baseDao.getByHQL(hqlString, values);
    }

    @Override
    public T getBySQL(String sqlString, Object... values) {
        return baseDao.getBySQL(sqlString, values);
    }

    @Override
    public List<T> getListByHQL(String hqlString, Object... values) {
        return baseDao.getListByHQL(hqlString, values);
    }

    @Override
    public List<T> getListBySQL(String sqlString, Object... values) {
        return baseDao.getListBySQL(sqlString, values);
    }

    @Override
    public Long countByHql(String hql, Object... values) {
        return baseDao.countByHql(hql, values);
    }

    @Override
    public Long countBySql(String sql, Object... values) {
        return baseDao.countBySql(sql, values);
    }

    @Override
    public PageResults<T> findPageByFetchedHql(String hql, String countHql, int pageNo, int pageSize, Object... values) {
        return baseDao.findPageByFetchedHql(hql, countHql, pageNo, pageSize, values);
    }
}
