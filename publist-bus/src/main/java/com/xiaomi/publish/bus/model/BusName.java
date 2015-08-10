package com.xiaomi.publish.bus.model;

import javax.persistence.*;
import java.util.Set;

/**
 * 应用软件名称 一个名称下面有不同的版本
 * Created by lijie on 2015-08-10.
 */
@Entity
@Table(name = "bus_name")
public class BusName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
    private Set<BusFile> appFileSet;

    public Set<BusFile> getAppFileSet() {
        return appFileSet;
    }

    public void setAppFileSet(Set<BusFile> appFileSet) {
        this.appFileSet = appFileSet;
    }
}
