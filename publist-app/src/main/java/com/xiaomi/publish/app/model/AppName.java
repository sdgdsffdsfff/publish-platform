package com.xiaomi.publish.app.model;

import javax.persistence.*;
import java.util.Set;

/**
 * 应用软件名称 一个名称下面有不同的版本
 * Created by lijie on 2015-08-10.
 */
@Entity
@Table(name = "app_name")
public class AppName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 应用软件属于哪个分类
     */
    @Column(name = "app_type_id")
    private Integer appTypeId;

    /**
     * 应用软件名称
     */
    @Column(name = "[name]")
    private String name;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取应用软件属于哪个分类
     *
     * @return app_type_id - 应用软件属于哪个分类
     */
    public Integer getAppTypeId() {
        return appTypeId;
    }

    /**
     * 设置应用软件属于哪个分类
     *
     * @param appTypeId 应用软件属于哪个分类
     */
    public void setAppTypeId(Integer appTypeId) {
        this.appTypeId = appTypeId;
    }

    /**
     * 获取应用软件名称
     *
     * @return name - 应用软件名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置应用软件名称
     *
     * @param name 应用软件名称
     */
    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_name_id")
    @OrderBy(value = "time DESC ")
    private Set<AppFile> appFileSet;

    public Set<AppFile> getAppFileSet() {
        return appFileSet;
    }

    public void setAppFileSet(Set<AppFile> appFileSet) {
        this.appFileSet = appFileSet;
    }
}
