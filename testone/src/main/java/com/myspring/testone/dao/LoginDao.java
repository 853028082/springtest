package com.myspring.testone.dao;

import com.myspring.testone.bean.UserBean;
import com.myspring.testone.util.LoadSQLCompent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class LoginDao {
    private LoadSQLCompent loadSQLCompent;
    private NamedParameterJdbcTemplate namedJdbcTemplate;
    private final static Logger log = LoggerFactory.getLogger(LoginDao.class);

    public LoginDao(LoadSQLCompent loadSQLCompent, NamedParameterJdbcTemplate namedJdbcTemplate) {
        this.loadSQLCompent = loadSQLCompent;
        this.namedJdbcTemplate = namedJdbcTemplate;
    }

    public UserBean getUser(String username) {
        String sql = loadSQLCompent.getSqls().get("SECURITY_SELECT_USER");
        HashMap<String, String> map = new HashMap<>();
        map.put("username", username);
        List<UserBean> userBeanList = namedJdbcTemplate.query(sql, map, new BeanPropertyRowMapper<>(UserBean.class));
        UserBean userBean;
        if (userBeanList.size() > 0) {
            userBean = userBeanList.get(0);
        } else {
            userBean = new UserBean();
        }
        return userBean;
    }


    public void adduser(String username, String password) {
        String sql = loadSQLCompent.getSqls().get("SECURITY_INSERT_USER");
        MapSqlParameterSource sps = new MapSqlParameterSource();
        sps.addValue("username", username);
        sps.addValue("password", password);
        namedJdbcTemplate.update(sql, sps);
    }
}
