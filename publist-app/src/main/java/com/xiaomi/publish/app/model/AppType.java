package com.xiaomi.publish.app.model;

import javax.persistence.*;
import java.util.Set;

/**
 * 应用软件分类
 * Created by lijie on 2015-08-10.
 */
@Entity
@Table(name = "app_type")
public class AppType {
    /**
     * 应用软件分类
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 分类名称
     */
    @Column(name = "[name]")
    private String name;

    /**
     * 分类描叙
     */
    @Column(name = "[desc]")
    private String desc;

    /**
     * 排序
     */
    @Column(name = "orderNo")
    private Integer orderno;

    /**
     * 获取应用软件分类
     *
     * @return id - 应用软件分类
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置应用软件分类
     *
     * @param id 应用软件分类
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取分类名称
     *
     * @return name - 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     *
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取分类描叙
     *
     * @return desc - 分类描叙
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置分类描叙
     *
     * @param desc 分类描叙
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 获取排序
     *
     * @return orderNo - 排序
     */
    public Integer getOrderno() {
        return orderno;
    }

    /**
     * 设置排序
     *
     * @param orderno 排序
     */
    public void setOrderno(Integer orderno) {
        this.orderno = orderno;
    }

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_type_id")
    private Set<AppName> appNameSet;

    public Set<AppName> getAppNameSet() {
        return appNameSet;
    }

    public void setAppNameSet(Set<AppName> appNameSet) {
        this.appNameSet = appNameSet;
    }
}
