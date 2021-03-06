package com.superywd.lottery.main.model.config;

import com.superywd.library.properties.Property;

/**
 * @author 迷宫的中心
 * @date 2019/5/14 22:48
 */
public class DataBaseConfig {
    /**
     * mybatis路径配置
     */
    @Property(key = "mybatis.config.path",defaultValue = "file:config/mybatis/mybatis-config.xml")
    public static String MYBATIS_CONFIG_PATH;

    /**
     * 数据库连接地址
     */
    @Property(key = "database.url",defaultValue = "jdbc:mysql://localhost:3306/aion_login")
    public static String DATABASE_URL;

    /**
     * 数据库驱动
     */
    @Property(key = "database.driver",defaultValue = "com.mysql.jdbc.Driver")
    public static String DATABASE_DRIVER;

    /**
     * 数据库账号
     */
    @Property(key = "database.user",defaultValue = "root")
    public static String DATABASE_USER;

    /**
     * 数据库密码
     */
    @Property(key = "database.password",defaultValue = "scanf")
    public static String DATABASE_PASSWORD;

}
