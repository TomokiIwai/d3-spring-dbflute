package com.example.tomokiiwai;

import com.example.tomokiiwai.rdb.exbhv.UserBhv;
import com.example.tomokiiwai.rdb.exentity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * コントローラー
 *
 * @author tomoki.iwai
 */
@Controller
public class D3Controller {
    private final UserBhv bhv;

    /**
     * Constructor
     */
    public D3Controller(final UserBhv bhv) {
        this.bhv = bhv;
    }

    /**
     * トップページ
     */
    @RequestMapping("/")
    public String index() {
        return "/index.html";
    }

    /**
     * データ取得
     */
    @RequestMapping("/selectAll")
    @ResponseBody
    public String selectAll() {
        try {
            return new ObjectMapper().writeValueAsString(bhv.selectList(cb -> cb.query().setId_IsNotNull()));
        } catch (JsonProcessingException e) {
            return "{code: \"failed\"}";
        }
    }

    /**
     * データ登録
     *
     * @param name     名前
     * @param password パスワード
     */
    @RequestMapping("/register")
    @ResponseBody
    public String register(@RequestParam("username") final String name, @RequestParam("password") final String password) {
        final User entity = new User();
        entity.setName(name);
        entity.setPassword(password);

        try {
            bhv.insert(entity);
            return "OK";
        } catch (Exception ignore) {
            return "NG";
        }
    }
}
