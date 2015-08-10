package com.xiaomi.publish.app.model;

import javax.persistence.*;
import java.util.Date;

/**
 * 应用软件信息
 * Created by lijie on 2015-08-10.
 */
@Entity
@Table(name = "app_file")
public class AppFile {
    /**
     * 文件上传类
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 资源下载路径
     */
    private String url;

    /**
     * 校验md5 0=不校验 1=校验
     */
    @Column(name = "[check]")
    private String check;

    /**
     * 更新模式 0=小于新版本号时更新 1=不等于新版本号时更新
     */
    private String model;

    /**
     * 软件大小
     */
    private String size;

    /**
     * 上传时间
     */
    @Column(name = "[time]")
    private Date time;

    /**
     * 文件上传用户
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 当前文件属于哪个名称下面的不同版本
     */
    @Column(name = "app_name_id")
    private Integer appNameId;

    /**
     * 附件信息
     */
    private String plus;

    /**
     * 资源备注
     */
    @Column(name = "[desc]")
    private String desc;

    /**
     * 资源版本
     */
    @Column(name = "[version]")
    private String version;

    /**
     * md5
     */
    @Column(name = "[md5]")
    private String md5;

    /**
     * 获取文件上传类
     *
     * @return id - 文件上传类
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置文件上传类
     *
     * @param id 文件上传类
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取资源下载路径
     *
     * @return url - 资源下载路径
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置资源下载路径
     *
     * @param url 资源下载路径
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取校验md5 0=不校验 1=校验
     *
     * @return check - 校验md5 0=不校验 1=校验
     */
    public String getCheck() {
        return check;
    }

    /**
     * 设置校验md5 0=不校验 1=校验
     *
     * @param check 校验md5 0=不校验 1=校验
     */
    public void setCheck(String check) {
        this.check = check;
    }

    /**
     * 获取更新模式 0=小于新版本号时更新 1=不等于新版本号时更新
     *
     * @return model - 更新模式 0=小于新版本号时更新 1=不等于新版本号时更新
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置更新模式 0=小于新版本号时更新 1=不等于新版本号时更新
     *
     * @param model 更新模式 0=小于新版本号时更新 1=不等于新版本号时更新
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 获取软件大小
     *
     * @return size - 软件大小
     */
    public String getSize() {
        return size;
    }

    /**
     * 设置软件大小
     *
     * @param size 软件大小
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 获取上传时间
     *
     * @return time - 上传时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置上传时间
     *
     * @param time 上传时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取文件上传用户
     *
     * @return user_id - 文件上传用户
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置文件上传用户
     *
     * @param userId 文件上传用户
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取当前文件属于哪个名称下面的不同版本
     *
     * @return app_name_id - 当前文件属于哪个名称下面的不同版本
     */
    public Integer getAppNameId() {
        return appNameId;
    }

    /**
     * 设置当前文件属于哪个名称下面的不同版本
     *
     * @param appNameId 当前文件属于哪个名称下面的不同版本
     */
    public void setAppNameId(Integer appNameId) {
        this.appNameId = appNameId;
    }

    /**
     * 获取附件信息
     *
     * @return plus - 附件信息
     */
    public String getPlus() {
        return plus;
    }

    /**
     * 设置附件信息
     *
     * @param plus 附件信息
     */
    public void setPlus(String plus) {
        this.plus = plus;
    }

    /**
     * 获取资源备注
     *
     * @return desc - 资源备注
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置资源备注
     *
     * @param desc 资源备注
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 获取资源版本
     *
     * @return version - 资源版本
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置资源版本
     *
     * @param version 资源版本
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取md5
     *
     * @return md5 - md5
     */
    public String getMd5() {
        return md5;
    }

    /**
     * 设置md5
     *
     * @param md5 md5
     */
    public void setMd5(String md5) {
        this.md5 = md5;
    }
}
