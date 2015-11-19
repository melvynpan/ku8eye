package org.ku8eye.mapping;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.ku8eye.domain.Host;

public interface HostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbggenerated
     */
    @Delete({
        "delete from host",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbggenerated
     */
    @Insert({
        "insert into host (ID, ZONE_ID, ",
        "HOST_NAME, IP, ROOT_PASSWD, ",
        "NOTE, LAST_UPDATED)",
        "values (#{id,jdbcType=INTEGER}, #{zoneId,jdbcType=INTEGER}, ",
        "#{hostName,jdbcType=CHAR}, #{ip,jdbcType=CHAR}, #{rootPasswd,jdbcType=CHAR}, ",
        "#{note,jdbcType=VARCHAR}, #{lastUpdated,jdbcType=TIMESTAMP})"
    })
    int insert(Host record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, ZONE_ID, HOST_NAME, IP, ROOT_PASSWD, NOTE, LAST_UPDATED",
        "from host",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ZONE_ID", property="zoneId", jdbcType=JdbcType.INTEGER),
        @Result(column="HOST_NAME", property="hostName", jdbcType=JdbcType.CHAR),
        @Result(column="IP", property="ip", jdbcType=JdbcType.CHAR),
        @Result(column="ROOT_PASSWD", property="rootPasswd", jdbcType=JdbcType.CHAR),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP)
    })
    Host selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, ZONE_ID, HOST_NAME, IP, ROOT_PASSWD, NOTE, LAST_UPDATED",
        "from host"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ZONE_ID", property="zoneId", jdbcType=JdbcType.INTEGER),
        @Result(column="HOST_NAME", property="hostName", jdbcType=JdbcType.CHAR),
        @Result(column="IP", property="ip", jdbcType=JdbcType.CHAR),
        @Result(column="ROOT_PASSWD", property="rootPasswd", jdbcType=JdbcType.CHAR),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Host> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbggenerated
     */
    @Update({
        "update host",
        "set ZONE_ID = #{zoneId,jdbcType=INTEGER},",
          "HOST_NAME = #{hostName,jdbcType=CHAR},",
          "IP = #{ip,jdbcType=CHAR},",
          "ROOT_PASSWD = #{rootPasswd,jdbcType=CHAR},",
          "NOTE = #{note,jdbcType=VARCHAR},",
          "LAST_UPDATED = #{lastUpdated,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Host record);
}