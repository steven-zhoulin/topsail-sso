package com.topsail.sso.ui.controller;

import com.topsail.sso.ui.domain.Member;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Steven
 */
@Controller
@RequestMapping("/member")
public class MemberController {

    /**
     * 会员列表页面
     */
    @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("member/list");
        return modelAndView;
    }

    /**
     * 导出
     */
    @PreAuthorize("hasAuthority('memberExport')")
    @ResponseBody
    @RequestMapping("/export")
    public List<Member> export() {
        List<Member> list = new ArrayList<>();
        list.add(Member.builder().name("张三").code("1000").mobile("13112345678").gender(1).build());
        list.add(Member.builder().name("李四").code("1001").mobile("15812346723").gender(1).build());
        return list;
    }

    /**
     * 详情
     */
    @PreAuthorize("hasAuthority('memberDetail')")
    @RequestMapping("/detail")
    public ModelAndView detail() {
        return new ModelAndView(" member/detail");
    }
}
