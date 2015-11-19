package org.ku8eye.mapping;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.ku8eye.domain.Tenant;

public interface TenantMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tenant
     *
     * @mbggenerated
     */
    @Delete({
        "delete from tenant",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tenant
     *
     * @mbggenerated
     */
    @Insert({
        "insert into tenant (ID, NAME, NOTE, ",
        "LAST_UPDATED)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=CHAR}, #{note,jdbcType=VARCHAR}, ",
        "#{lastUpdated,jdbcType=TIMESTAMP})"
    })
    int insert(Tenant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tenant
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, NAME, NOTE, LAST_UPDATED",
        "from tenant",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.CHAR),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP)
    })
    Tenant selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tenant
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, NAME, NOTE, LAST_UPDATED",
        "from tenant"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.CHAR),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Tenant> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tenant
     *
     * @mbggenerated
     */
    @Update({
        "update tenant",
        "set NAME = #{name,jdbcType=CHAR},",
          "NOTE = #{note,jdbcType=VARCHAR},",
          "LAST_UPDATED = #{lastUpdated,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Tenant record);
}